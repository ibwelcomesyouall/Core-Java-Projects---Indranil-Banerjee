package org.indranil.projects.logmonitoring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SLACalculator {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","Hibernate-user","Hello@2016");
	    Statement stmt = connection.createStatement();
	    ResultSet rset = stmt.executeQuery("select PROCESS,SLA,ACTUAL_TIMESTAMP from COLLINE_LOG_MONITORING_RESULT");
	    while(rset.next()) {
	    	
	    	SimpleDateFormat simpledateformat = new SimpleDateFormat("DD/MM/yyyy HH:MM a");
	    	Date sla = simpledateformat.parse(rset.getString("SLA"));
	    	Date actual_timestamp = simpledateformat.parse(rset.getString("ACTUAL_TIMESTAMP"));
	    	
	    	if(sla.after(actual_timestamp)) {
	    		Statement stmt1 = connection.createStatement();
	    		stmt1.executeUpdate("UPDATE COLLINE_LOG_MONITORING_RESULT SET SLA_MET='Y' WHERE PROCESS='"+rset.getString("PROCESS")+"'");
	    	}
	    	else {
	    		Statement stmt1 = connection.createStatement();
	    		stmt1.executeUpdate("UPDATE COLLINE_LOG_MONITORING_RESULT SET SLA_MET='N' WHERE PROCESS='"+rset.getString("PROCESS")+"'");    		
	    	}
	    		

	    }
	}
}
