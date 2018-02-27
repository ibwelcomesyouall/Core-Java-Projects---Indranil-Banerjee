package org.indranil.projects.MyOfficeDevelopments.JiraRestApi.Model;

public class Issue {
	
	private String issue_id;
	private String issue_status;
	private String issue_priority;
	private String issue_create_date;
	public String getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(String issue_id) {
		this.issue_id = issue_id;
	}
	public String getIssue_status() {
		return issue_status;
	}
	public void setIssue_status(String issue_status) {
		this.issue_status = issue_status;
	}
	public String getIssue_create_date() {
		return issue_create_date;
	}
	public void setIssue_create_date(String issue_open_date) {
		this.issue_create_date = issue_open_date;
	}
	public String getIssue_priority() {
		return issue_priority;
	}
	public void setIssue_priority(String issue_priority) {
		this.issue_priority = issue_priority;
	}
	
}
