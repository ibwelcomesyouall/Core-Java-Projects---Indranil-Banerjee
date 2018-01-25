package org.indranil.projects.DAAdditionalCheck;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DAAdditionalCheckReport {

    public static void main(String[] args) throws IOException {

        String pattern = "MM/dd/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        FunctionDef funDef=new FunctionDef();
        System.out.println("<HTML><HEAD><style type=\"text/css\">\n" +
".myOtherTable { background-color:#eee;border-collapse:collapse; }\n" +
".myOtherTable th { background-color:#000;color:white;width:50%; }\n" +
".myOtherTable td, .myOtherTable th { padding:5px;border:1px solid #000;width:1200; }\n" +
".headerTable { background-color:#eee;border-collapse:collapse; }\n" +
".headerTable th { background-color:#6495ED;color:white;width:50%; }\n" +
".headerTable td, .headerTable th { padding:10px;border:1px solid #000;width:1200; }\n" +
".checkTable { background-color:#eee;border-collapse:collapse; }\n" +
".checkTable th { background-color:#7FFFD4;color:black;width:50%; }\n" +
".checkTable td, .headerTable th { padding:10px;border:1px solid #000;width:1200; }\n" +
"</style></HEAD><TITLE></TITLE><BODY><CENTER><TABLE class="+"headerTable"+"><TR><TH>DA Additional Checks for "+date+"</TH></TR></TABLE></CENTER><br/><br/>");
        System.out.println("<CENTER><TABLE class="+"checkTable"+" ><TR><TH> Check 1 </TH></TR></TABLE></CENTER><br/><br/>");
        funDef.GetRptDetails(1,date);
        System.out.println("<CENTER><TABLE class="+"checkTable"+" ><TR><TH> Check 2 </TH></TR></TABLE></CENTER><br/><br/>");
        funDef.GetRptDetails(2,date);
        System.out.println("<CENTER><TABLE class="+"checkTable"+" ><TR><TH> Check 3 </TH></TR></TABLE></CENTER><br/><br/>");
        funDef.GetRptDetails(3,date);
        System.out.println("</BODY></HTML>");
    }
}

class FunctionDef
{
    void GetRptDetails(int CheckNo, String date) throws IOException
        {
            String RptDetails;
            String[] RptDetailsSplit = new String[5];
            BufferedReader br=new BufferedReader(new FileReader("ReportDetails.txt"));
            while((RptDetails=br.readLine())!=null)
            {
                RptDetailsSplit=RptDetails.split(",");
                if(Integer.parseInt(RptDetailsSplit[0])==CheckNo)
                {
                   if(Integer.parseInt(RptDetailsSplit[1])==1)
                   {
                      getDBdataDetails(CheckNo,RptDetailsSplit[2],RptDetailsSplit[3],RptDetailsSplit[4],date); 
                   }
                   if(Integer.parseInt(RptDetailsSplit[1])==2)
                   {
                       getLogDetails(CheckNo,RptDetailsSplit[2],date);
                   }
                }
            }
        }
    void getDBdataDetails(int CheckNo,String RptName,String JobName,String colname,String date) throws IOException
    {
            String FileName=RptName.replaceAll(" ", "_");
            System.out.println("<CENTER><TABLE class="+"myOtherTable"+"  ><TR><TH>"+RptName+" check for "+date+"</TH></TR></TABLE></CENTER><CENTER><TABLE class="+"myOtherTable"+">");
            BufferedReader br = new BufferedReader(new FileReader(FileName+".txt"));
            String ID;
            int count=0;
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
    void getLogDetails(int CheckNo,String RptName,String date) throws IOException
    {
      String pattern = "MMddyyyy";
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
      String logdate = simpleDateFormat.format(new Date());
      String FileName=RptName.replaceAll(" ", "_");
      System.out.println("<CENTER><TABLE class="+"myOtherTable"+"  ><TR><TH>"+RptName+" for "+date+"</TH></TR></TABLE></CENTER><CENTER><TABLE class="+"myOtherTable"+">");
      BufferedReader br = new BufferedReader(new FileReader(FileName+".txt"));
      String ID;
      int count=0;
      while(br.readLine()!=null)
      {
      count++;
      }
      if(count==0)
      {
          if(RptName.contains("GMI"))
          {
            System.out.println("<TR><TD align="+"center"+">No Issues on "+RptName+":/nas/hdgprod/DerivativesBatch/logs/wfSendClientFTP_GMI.log."+logdate+"</TD></TR></TABLE></CENTER><br/><br/>");
          }
          if(RptName.contains("IRS"))
          {
            System.out.println("<TR><TD align="+"center"+">No Issues on "+RptName+":/nas/hdgprod/DerivativesBatch/logs/wfSendClientFTP_IRS.log."+logdate+"</TD></TR></TABLE></CENTER><br/><br/>");
          }
          if(RptName.contains("IOException"))
          {
            System.out.println("<TR><TD align="+"center"+">No Issues found in the log /nas/hdgprod/DerivativesBatch/logs/wfGenerateReconActivityCSV.log</TD></TR></TABLE></CENTER><br/><br/>");
          }
          if(RptName.contains("Custom FTP"))
          {
            System.out.println("<TR><TD align="+"center"+">No Issues found in the log /nas/hdgprod/DerivativesBatch/logs/wfGenerateConsolidatedSTMT.log.DAILY."+logdate+"</TD></TR></TABLE></CENTER><br/><br/>");
          }
          
      }
            else
            {
                System.out.println("<TR><TD align="+"center"+"><font color=\"red\">Issue :"+RptName+" details below:</font></TD></TR><TR><TD align="+"center"+">");
                BufferedReader br1 = new BufferedReader(new FileReader(FileName+".txt"));
                while((ID=br1.readLine())!=null)
                {
                    System.out.println(ID);
                    System.out.println("<br/>");
                }
                System.out.println("</TD><TR/></TABLE></CENTER><br/><br/>");

            }  
    }
          void TableCreater(int counter,String ID)
            {
                String[] IDsplit = new String[counter];
                IDsplit=ID.split("#");
                System.out.println("<TR>");
                for(int j=0;j<counter;j++)
                {
                    System.out.println("<TD align="+"center"+">"+IDsplit[j]+"</TD>");
                }
                System.out.println("</TR>");

            }
    
}

