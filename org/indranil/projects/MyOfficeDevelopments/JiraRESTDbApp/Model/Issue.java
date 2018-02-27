package org.indranil.projects.MyOfficeDevelopments.JiraRESTDbApp.Model;

public class Issue {
	
	private String issue_id;
	private String issue_status;
	private String issue_open_date;
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
	public String getIssue_open_date() {
		return issue_open_date;
	}
	public void setIssue_open_date(String issue_open_date) {
		this.issue_open_date = issue_open_date;
	}
}
