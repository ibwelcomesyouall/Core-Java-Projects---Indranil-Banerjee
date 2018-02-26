package org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Application;

import org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Util.GETUtility;
import org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Util.JSONParserUtility;
import org.json.simple.parser.ParseException;

public class JiraRestAPIIssueTracker {
	
	String JSONFile;

	public static void main(String[] args) throws ParseException {
		
		JiraRestAPIIssueTracker tracker = new JiraRestAPIIssueTracker();
		
		System.out.println("!!! This Utility will fetch the JIRA details and store in the Database !!!");
		
		// Run a loop to gather all issues by putting a GET Request
		
		// Single GET request below :-
		
		GETUtility get = new GETUtility("https://jira.atlassian.com/rest/api/latest/issue/", "u525202", "Ballon@123");
		
		tracker.JSONFile = get.getDataFromServer("COMMUNITY-2976.json");
		
		JSONParserUtility parser = new JSONParserUtility(tracker.JSONFile);		
		
		// Think about the logic so that the performance is not compromised. 
		
		// Parse each Request and get the required fields
		
		// Same the details in a database

	}

}
