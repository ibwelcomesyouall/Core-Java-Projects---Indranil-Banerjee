package org.indranil.projects.MyOfficeDevelopments.JiraRestApi;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Model.Issue;
import org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Util.DBInsertionUtility;
import org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Util.GETUtility;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JiraIssueTracker {
	
	private ArrayList<String> issueList = new ArrayList<String>();
	private ArrayList<Issue> issueDetailsList = new ArrayList<Issue>();
	
	int totalIssueOfProject(String baseurl, String key) throws IOException, ParseException {
		
		URL url = new URL(baseurl+"/rest/api/2/search?jql=project="+key);			
		GETUtility get = new GETUtility(url.toString(), "u525202", "Ballon@123");
		String jsonResponse = get.getDataFromServer("");
		Object obj = new JSONParser().parse(jsonResponse);
        JSONObject jo = (JSONObject) obj;
        return Integer.valueOf(jo.get("total").toString());
	}
	
	ArrayList<String> AllIssueListOfProject(String baseurl, String key) throws IOException, ParseException{
		
		int startindex=0;		
		for(int endindex = 100; endindex <= totalIssueOfProject(baseurl,key) ; endindex+=100) {
			
			URL url = new URL(baseurl+"/rest/api/2/search?jql=project="+key+"&startAt="+startindex+"&maxResults="+endindex);
			GETUtility get = new GETUtility(url.toString(), "u525202", "Ballon@123");
			String jsonResponse = get.getDataFromServer("");
			Object obj = new JSONParser().parse(jsonResponse);
	        JSONObject jo = (JSONObject) obj;
	        
	        JSONArray ja = (JSONArray) jo.get("issues");
	        Iterator<?> itr1 = ja.iterator();
	         
	        while (itr1.hasNext()) 
	        {
	        	@SuppressWarnings("unchecked")
				Map<String,String> issueMap = (Map<String,String>) itr1.next();
	        	issueList.add(issueMap.get("key"));
	        }	        
	        startindex=endindex+1;			
		}
		return issueList;		
	}
	
ArrayList<Issue> FetchAllIssueDetailsOfProject(String baseurl, String key) throws IOException, ParseException{
		
		int startindex=0;
		Issue issue;
		for(int endindex = 100; endindex <= totalIssueOfProject(baseurl,key) ; endindex+=100) {
			
			URL url = new URL(baseurl+"/rest/api/2/search?jql=project="+key+"&startAt="+startindex+"&maxResults="+endindex);
			GETUtility get = new GETUtility(url.toString(), "u525202", "Ballon@123");
			String jsonResponse = get.getDataFromServer("");
			Object obj = new JSONParser().parse(jsonResponse);
	        JSONObject jo = (JSONObject) obj;
	        
	        JSONArray ja = (JSONArray) jo.get("issues");
	        Iterator<?> itr1 = ja.iterator();
	         
	        while (itr1.hasNext()) 
	        {
	        	issue = new Issue();
	        	@SuppressWarnings("unchecked")
				Map<String,Object> issueMap = (Map<String,Object>) itr1.next();
	        	issue.setIssue_id(issueMap.get("key").toString());
	        	@SuppressWarnings("unchecked")
				Map<String,Object> fields = (Map<String,Object>)issueMap.get("fields");
	        	@SuppressWarnings("unchecked")
				Map<String,String> status = (Map<String,String>)fields.get("status");
	        	issue.setIssue_status(status.get("name"));
	        	@SuppressWarnings("unchecked")
				Map<String,String> priority = (Map<String,String>)fields.get("priority");
	        	issue.setIssue_priority(priority.get("name"));
	        	issue.setIssue_create_date(fields.get("created").toString());
	        	
	        	issueDetailsList.add(issue);
	        }	        
	        startindex=endindex+1;			
		}
		return issueDetailsList;		
	}

ArrayList<Issue> FetchOpenIssueDetailsOfProject(String baseurl, String key) throws IOException, ParseException{
	ArrayList<Issue> openIssueDetailsList = new ArrayList<Issue>();
	for(Issue issueDetails : FetchAllIssueDetailsOfProject(baseurl,key)) {
		if(!(issueDetails.getIssue_status().equals("Closed"))) {
			openIssueDetailsList.add(issueDetails);
		}
	}
	
	return openIssueDetailsList;	
}
		
	public static void main(String[] args) throws IOException, ParseException {
		
		//String url = args[0];
		//String key = args[1];
		
		String baseurl = "https://jira.atlassian.com";
		String key = "18710";
		
		JiraIssueTracker jit = new JiraIssueTracker();
		
		if(baseurl == null || key == null ) {
			System.out.println("!!! This program to get the JIRA issue Details !!!");
			System.out.println("Please pass REST URL as first argument !!!");
			System.out.println("Please pass the project id as second argument !!!");
		}
		else {		
		System.out.println("Total Number of Issues : " + jit.totalIssueOfProject(baseurl,key));
		//System.out.println("Issue list : " + jit.AllIssueListOfProject(baseurl,key));
		/*System.out.println("Issue Detail List : ");
		for(Issue issueDetails : jit.FetchOpenIssueDetailsOfProject(baseurl,key)) {
			System.out.println("ID : " + issueDetails.getIssue_id());
			System.out.println("Created Date : " + issueDetails.getIssue_create_date());
			System.out.println("Status : " + issueDetails.getIssue_status());
			System.out.println("Priority : " + issueDetails.getIssue_priority());
		}*/
		
		System.out.println(".................. Saving the details in DB .................. ");
		
		DBInsertionUtility dbiu = new DBInsertionUtility();
		dbiu.insertDetailsinDB(jit.FetchOpenIssueDetailsOfProject(baseurl,key));
		
		System.out.println(".................. Details saved in DB .................. ");
		
		}
	}
}
