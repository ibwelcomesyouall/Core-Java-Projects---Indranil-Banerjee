package org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Application;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Util.GETUtility;

public class JIRARESTTotalIssueUtil {
	
	public static void main(String[] args) throws IOException {
		JiraRestAPIIssueTracker tracker = new JiraRestAPIIssueTracker();
		URL obj = new URL("https://jira.atlassian.com/rest/api/2/search?jql=project=18710");
		System.out.println("Checking the URL : " + obj.toString());
			
		GETUtility get = new GETUtility("https://jira.atlassian.com/rest/api/2/search?jql=project=18710", "u525202", "Ballon@123");
			
		System.out.println(get.getDataFromServer(""));

	}
}

