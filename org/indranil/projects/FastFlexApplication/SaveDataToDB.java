package org.indranil.projects.FastFlexApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class SaveDataToDB {
	ArrayList<String> data = null;
	ArrayList<Integer> line_number = null;
	
	public SaveDataToDB(ArrayList<Integer> line_number,ArrayList<String> data) {
		this.data=data;
		this.line_number=line_number;
		
		
		
		for(int i=0;i<line_number.size();i++)
		{
			for(int j =0;j<data.size();j++)
			{
				if(i==j)
				{
					//System.out.println(data.get(j).trim());
					//save them into database
					try {
					    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","Hibernate-user","Hello@2016");
					    PreparedStatement pStmt = connection.prepareStatement("insert into data_extracted_stage1 values('"+line_number.get(i)+"','"+data.get(j).trim().replace("'", "").toUpperCase()+"')");
					    pStmt.execute();
					    connection.close();
					    }
					    catch(Exception e) {
					    System.out.println("SQLException: " + e.getMessage());
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		

	}

}
