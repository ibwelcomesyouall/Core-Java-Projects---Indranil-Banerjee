package org.indranil.projects.MyOfficeAutomations.HTMLGenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DBDataFormater {
    
    DBDataFormater(String RptName,String JobName,String colname,String date,String d, String r, String f) throws FileNotFoundException, IOException
    {
        String FileName=RptName.replaceAll(" ", "_");
            System.out.println("<CENTER><TABLE class="+"myOtherTable"+"  ><TR><TH>"+RptName+" check for "+date+"</TH></TR></TABLE></CENTER><CENTER><TABLE class="+"myOtherTable"+">");
            BufferedReader br = new BufferedReader(new FileReader(FileName+".txt"));
            String ID;
            int count=0;
            int CheckNo=0;
            while(br.readLine()!=null)
            {
                count++;
            }
            if(count==0)
            {
                System.out.println("<TR><TD align="+"center"+">No Issues</TR></TD></TABLE></CENTER><br/><br/>");
            }
            else
            {
                if(CheckNo==1)
                {
                    
                    BufferedReader br1 = new BufferedReader(new FileReader(FileName+".txt"));
                    int counter = 0;
                    System.out.println("<TR>");
                    for( int i=0; i<colname.length(); i++ ) {
                        if( colname.charAt(i) == '#' ) {
                        counter++;
                        } 
                    }
                    System.out.println("<TD align="+"center"+" colspan="+counter+"><font color=\"red\">Issue : Missing "+RptName+" for below "+count+ " Alert_ID . Need to force start : "+JobName+"</font></TD></TR><TR>");
                    String[] colsplit = new String[counter];
                    colsplit=colname.split("#");
                    for(int k=0;k<counter;k++)
                    {
                    System.out.println("<TH>"+colsplit[k]+"</TH>");
                    }
                    System.out.println("</TR>");
                    while((ID=br1.readLine())!=null)
                    {
                        TableCreater(counter,ID);
                    }
                    System.out.println("</TABLE></CENTER><br/><br/>");
                }
                if(CheckNo==2)
                {
                    BufferedReader br1 = new BufferedReader(new FileReader(FileName+".txt"));
                    int counter = 0;
                    System.out.println("<TR>");
                    for( int i=0; i<colname.length(); i++ ) {
                        if( colname.charAt(i) == '#' ) {
                        counter++;
                        } 
                    }
                    System.out.println("<TD align="+"center"+" colspan="+counter+"><font color=\"red\">Issue : Missing "+RptName+" ftp client for below "+count+ " Client ID</font></TD></TR><TR>");
                    String[] colsplit = new String[counter];
                    colsplit=colname.split("#");
                    for(int k=0;k<counter;k++)
                    {
                    System.out.println("<TH>"+colsplit[k]+"</TH>");
                    }
                    System.out.println("</TR>");
                    while((ID=br1.readLine())!=null)
                    {
                        TableCreater(counter,ID);
                    }
                        
                        System.out.println("<TD colspan="+counter+">Please check Below Job:<br/>");
                        System.out.println(JobName);
                        System.out.println("</TD><TR/></TABLE></CENTER><br/><br/>");
                }
                if(CheckNo==3)
                {
                    BufferedReader br1 = new BufferedReader(new FileReader(FileName+".txt"));
                    int counter = 0;
                    System.out.println("<TR>");
                    for( int i=0; i<colname.length(); i++ ) {
                        if( colname.charAt(i) == '#' ) {
                        counter++;
                        } 
                    }
                    System.out.println("<TD align="+"center"+" colspan="+counter+"><font color=\"red\">Issue : Missing "+RptName+" for below "+count+ " clients .</font></TD></TR><TR>");
                    String[] colsplit = new String[counter];
                    colsplit=colname.split("#");
                    for(int k=0;k<counter;k++)
                    {
                    System.out.println("<TH>"+colsplit[k]+"</TH>");
                    }
                    System.out.println("</TR>");
                    while((ID=br1.readLine())!=null)
                    {
                        TableCreater(counter,ID);
                    }
                    System.out.println("<TR><TD colspan="+counter+">Please check Below Job:<br/>");
                    System.out.println(JobName);
                    System.out.println("</TD><TR/></TABLE></CENTER><br/><br/>");
                }
    }
    
    }

	private void TableCreater(int counter, String ID) {
		String[] IDsplit = new String[counter];
        IDsplit=ID.split("#");
        System.out.println("<TR>");
        for(int j=0;j<counter;j++)
            System.out.println("<TD align="+"center"+">"+IDsplit[j]+"</TD>");
        System.out.println("</TR>");
		
	}
}
