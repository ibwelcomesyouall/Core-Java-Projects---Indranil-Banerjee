package org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Util.GETUtility;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JiraIssueTracker {
	
	private ArrayList<String> issueList = new ArrayList<String>();
	
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
		System.out.println("Issue list : " + jit.AllIssueListOfProject(baseurl,key));
		}
	}
}
