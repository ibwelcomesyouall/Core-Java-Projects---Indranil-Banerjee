package org.indranil.projects.MyOfficeAutomations.HTMLGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogDataFormater {
    LogDataFormater(String a, String b, String d, String f, String s, String h, String l)
    {
        
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
    
}
