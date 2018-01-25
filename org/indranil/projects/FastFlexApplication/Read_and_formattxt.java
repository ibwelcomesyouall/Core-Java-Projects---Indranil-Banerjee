package org.indranil.projects.FastFlexApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Read_and_formattxt {
	
	ArrayList<String> l;
	
	public Read_and_formattxt(ArrayList<String> l) throws IOException {
		this.l=l;
		load_data_in_DB_with_format(l);
	}
	
	void load_data_in_DB_with_format(ArrayList<String> l) throws IOException{
		for(String line: l)
		{
			try {
			    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","Hibernate-user","Hello@2016");
			    System.out.println(line);
			    System.out.println(line=line.replace("'", "").toUpperCase());
			    PreparedStatement pStmt = connection.prepareStatement("insert into data_extracted_stage2 values('field','"+line+"')");
			    pStmt.execute();
			    connection.close();
			    }
			    catch(Exception e) {
			    System.out.println("SQLException: " + e.getMessage());
			}
		}
		}
}
