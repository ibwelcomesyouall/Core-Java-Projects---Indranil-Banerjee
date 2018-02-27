package org.indranil.projects.MyOfficeDevelopments.JiraRestApi.Util;

import java.sql.*;
import java.util.ArrayList;

import org.indranil.projects.MyOfficeDevelopments.JiraRestApi.Model.Issue;

/**
 * JdbcInsert1.java - Demonstrates how to INSERT data into an SQL
 *                    database using Java JDBC.
 */
public class DBInsertionUtility { 
  
    public void insertDetailsinDB (ArrayList<Issue> openIssueDetailsList) { 
        try { 
        	
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpensePassword");
            Statement st = connection.createStatement(); 
            st.executeUpdate("DELETE FROM JIRATracker");  
            for(Issue openissue : openIssueDetailsList ) {
            	String insertsql = "INSERT INTO JIRATracker VALUES(?,?,?,?)";
            	PreparedStatement pst = connection.prepareStatement(insertsql);
            	pst.setString(1, openissue.getIssue_id());
            	pst.setString(2, openissue.getIssue_create_date());
            	pst.setString(3, openissue.getIssue_priority());
            	pst.setString(4, openissue.getIssue_status());
            	pst.executeUpdate();
            } 
            connection.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
  
    }
}