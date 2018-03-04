package org.indranil.projects.MyOfficeDevelopments.appmonitor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.indranil.projects.MyOfficeDevelopments.appmonitor.Service.StrategyManipulatorService;

public class AppMonitor {
	
	static String[] complete_strategy;
	
	public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {
		SimpleDateFormat dt = new SimpleDateFormat("dd-MMM-yyyy");
        String date = dt.format(new Date());
		System.out.println("AppMonitor is running for " + date);
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","Indranil","IndranilPass");
        Statement st = connection.createStatement(); 
        ResultSet rs = st.executeQuery("select * from Colline_Batch_Monitoring where Monitoring_Date='"+date+"' and Monitoring_Status='Not Done'");
        
        System.out.println("Have to monitor the following records :- ");
        while(rs.next()) {
        	System.out.println(rs.getString("Monitoring_Name"));
        	new StrategyManipulatorService(rs.getString("Monitoring_Name"),rs.getString("Monitoring_Strategy"),date);
        	
        }
	}

}
