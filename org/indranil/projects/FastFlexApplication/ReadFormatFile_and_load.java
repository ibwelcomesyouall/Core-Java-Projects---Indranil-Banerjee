package org.indranil.projects.FastFlexApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class ReadFormatFile_and_load {
ArrayList<String> l;
	
	public ReadFormatFile_and_load(ArrayList<String> l) throws IOException {
		this.l=l;
		load_data_in_DB_attributes(l);
	}
	
	void load_data_in_DB_attributes(ArrayList<String> l) throws IOException
	{
		String instruction=null;
		String line=null;
		BufferedReader br = new BufferedReader(new FileReader("F:\\FastFlex Loan Processing Application\\Input\\format.txt"));
		try {
		    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","Hibernate-user","Hello@2016");
		    while((instruction=br.readLine())!=null)
		    {
		    	System.out.println("Instruction : "+instruction);
		    	line=l.get(Integer.parseInt(instruction.split(",")[0])-1).replace("'", "").toUpperCase();
			    PreparedStatement pStmt = connection.prepareStatement("insert into data_extracted_stage3 values('"+instruction.split(",")[1]+"','"+line+"')");
			    pStmt.execute();
		    }
		connection.close();
		}
		    catch(Exception e) {
		    System.out.println("SQLException: " + e.getMessage());
		    }
	}
}
