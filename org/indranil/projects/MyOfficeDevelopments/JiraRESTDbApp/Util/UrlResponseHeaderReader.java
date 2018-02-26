package org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Util;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class UrlResponseHeaderReader {
	
	public static void main(String[] args) throws IOException {
		
		int count=0;
		int id = 0;
		
		do {
			URL obj = new URL("https://jira.atlassian.com/rest/api/latest/issue/COMMUNITY-"+id+".json");
			System.out.println("Checking the URL : " + obj.toString());
			URLConnection conn = obj.openConnection();
			Map<String, List<String>> map = conn.getHeaderFields();
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				//System.out.println("Key : " + entry.getKey() +" ,Value : " + entry.getValue());
				if(entry.getKey() == null) {
					if(entry.getValue().contains("200")) {
						System.out.println("Status : 200");
						count++;
					}
					else {
						System.out.println("Status : "+entry.getValue());
					}
				}
				//System.out.println("Key : " + entry.getKey() +" ,Value : " + entry.getValue());
			}
			id++;
		}
		while(true);
	
	//URL obj = new URL("https://jira.atlassian.com/rest/api/latest/issue/COMMUNITY-2976.json");
	

}
	
}


