package org.indranil.projects.logmonitoring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogMonitoring {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, ParseException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","Hibernate-user","Hello@2016");
	    Statement stmt = connection.createStatement();
	    ResultSet rset = stmt.executeQuery("select ID,LOG_PATH,LOG_NAME,SEARCH_PATTERN from LOG_MONITORING_PROPERTIES");
	    while(rset.next()) {
	    	System.out.println(rset.getString("LOG_PATH"));
	    	System.out.println(rset.getString("LOG_NAME"));
	    	System.out.println(rset.getString("SEARCH_PATTERN"));
	    	LogMonitoring.logPatternSearchDBPersister(rset.getInt("ID"),rset.getString("LOG_PATH"), rset.getString("LOG_NAME"), rset.getString("SEARCH_PATTERN"));
	    }
	    connection.close();
	    
	    collinelogPatternSearchDBPersister();

	}
	
	public static void logPatternSearchDBPersister(int id, String log_path, String log_name, String search_pattern) throws IOException, ClassNotFoundException, SQLException {
		
		File logfile = new File(log_path+log_name);
		BufferedReader br = new BufferedReader(new FileReader(logfile));
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(logfile), ));
		String line=null;
		System.out.println("[.]*"+search_pattern+"[.]*");
		while((line = br.readLine())!=null) {
			//System.out.println(line.trim());
			Pattern pattern = Pattern.compile("[.]*"+search_pattern+"[.]*");
	        Matcher matcher = pattern.matcher(line);
	        if (matcher.find())
	        {
	            LogMonitoring.save(id,line);
	        }
		}
		br.close();
		
	}

	private static void save(int id, String line) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","Hibernate-user","Hello@2016");
	    Statement stmt = connection.createStatement();
	    System.out.println("insert into LOG_MONITORING_RESULT values("+id+",'"+line.trim()+"')");
	    stmt.executeUpdate("insert into LOG_MONITORING_RESULT values("+id+",'"+line.trim()+"')");
	    connection.close();
		
		
	}
	
public static void collinelogPatternSearchDBPersister() throws IOException, ClassNotFoundException, SQLException, ParseException {
	String process=null;
	String sla=null;	
	String actual_timestamp_pattern = null;
	ArrayList <String> actual_times = new ArrayList<String>();
	
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","Hibernate-user","Hello@2016");
    Statement stmt = connection.createStatement();
    ResultSet rset = stmt.executeQuery("select PROCESS,SLA,ACTUAL_TIMESTAMP_STRATEGY,ACTUAL_TIMESTAMP_PATTERN from COLLINE_LOG_MONITORING_PROPERTIES");
    while(rset.next()) {
    	System.out.println(rset.getString("ACTUAL_TIMESTAMP_STRATEGY"));
    	process = rset.getString("PROCESS");
    	sla = rset.getString("SLA");
    	actual_timestamp_pattern = rset.getString("ACTUAL_TIMESTAMP_PATTERN");
    	
    	Statement stmt1 = connection.createStatement();
    	System.out.println("select RESULT from LOG_MONITORING_RESULT where ID in("+rset.getString("ACTUAL_TIMESTAMP_STRATEGY")+")");
    	ResultSet rset1 = stmt1.executeQuery("select RESULT from LOG_MONITORING_RESULT where ID in("+rset.getString("ACTUAL_TIMESTAMP_STRATEGY")+")");
    	while(rset1.next()) {
    		actual_times.add(rset1.getString("RESULT"));
    	}
    }
    
    Statement stmt2 = connection.createStatement();
    stmt2.executeUpdate("insert into COLLINE_LOG_MONITORING_RESULT (PROCESS,SLA,ACTUAL_TIMESTAMP) values('"+process+"','"+sla+"','"+LogMonitoring.max(actual_times,actual_timestamp_pattern)+"')");
    
    connection.close();		
		
	}

private static String max(ArrayList<String> actual_times, String actual_timestamp_pattern) throws ParseException {
	SimpleDateFormat formatter = new SimpleDateFormat(actual_timestamp_pattern);
	Date max_timestamp = formatter.parse(actual_times.get(0));
	for(String actual_time: actual_times) {
		try {
            Date date = formatter.parse(actual_time);
            //System.out.println(date);
            max_timestamp = (max_timestamp.after(date)) ? max_timestamp : date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
	
	return formatter.format(max_timestamp);
}

}
