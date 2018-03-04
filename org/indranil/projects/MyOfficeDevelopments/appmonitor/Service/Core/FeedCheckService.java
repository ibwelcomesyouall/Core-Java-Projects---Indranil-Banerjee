package org.indranil.projects.MyOfficeDevelopments.appmonitor.Service.Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.indranil.projects.MyOfficeDevelopments.appmonitor.Model.Feed;

public class FeedCheckService {
	
	Feed feed = new Feed();
	
	public FeedCheckService() {
	}
	
	public FeedCheckService(String monitoring_name, int type_id, String date) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","Indranil","IndranilPass");
        Statement st = connection.createStatement(); 
        ResultSet rs = st.executeQuery("select * from Feedmaster_Indranil where feed_id="+type_id);
        
        while(rs.next()) {
        	feed.setId(Integer.valueOf(rs.getString("feed_id")));
        	feed.setFeed_name(rs.getString("feed_name"));
        	feed.setFeed_path(rs.getString("feed_path"));
        	feed.setFeed_sla(rs.getString("feed_SLA"));
        	feed.setServer_name(rs.getString("server_name"));
        	feed.setUsername(rs.getString("username"));
        	feed.setPassword(rs.getString("pass"));
        	
        }
	}
	
	public String feedChecker() {
		System.out.println(feed.getId());
		/* it will login to the server using servername, username and password values
		 * it will go to the path as specified
		 * it will check for the file as specified in filename and will also convert the filename date if applicable
		 * if it found the file, it will return the timestamp of the file else will return null;
		 */
    	return "10:00:00";
    }

}
