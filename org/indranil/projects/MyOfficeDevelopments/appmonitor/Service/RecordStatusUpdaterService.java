package org.indranil.projects.MyOfficeDevelopments.appmonitor.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RecordStatusUpdaterService {
	
	public RecordStatusUpdaterService(){
	}
	
	public void update_batch_monitoring_result(String monitoring_name, String result, String date) throws ClassNotFoundException, SQLException {
		if(result != null) {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","Indranil","IndranilPass");
	        Statement st = connection.createStatement(); 
	        System.out.println("update Colline_Batch_Monitoring set Monitoring_Result='"+result+"',Monitoring_Status='Done' where Monitoring_Name='"+monitoring_name+"' and Monitoring_Date='"+date+"'");
	        st.executeUpdate("update Colline_Batch_Monitoring set Monitoring_Result='"+result+"',Monitoring_Status='Done' where Monitoring_Name='"+monitoring_name+"' and Monitoring_Date='"+date+"'");
	        
	        System.out.println("Monitoring result saved in DB ......");
		}
		
	}

}
