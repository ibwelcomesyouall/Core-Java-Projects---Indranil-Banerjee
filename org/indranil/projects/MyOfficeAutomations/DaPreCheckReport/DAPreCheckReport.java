package org.indranil.projects.MyOfficeAutomations.DaPreCheckReport;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DAPreCheckReport {

    public static void main(String[] args) throws IOException {

        String process_no="123";
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
"</style></HEAD><TITLE></TITLE><BODY><CENTER><TABLE class="+"headerTable"+"><TR><TH>DA Pre Checks for "+date+"</TH></TR></TABLE></CENTER><br/><br/>");
        System.out.println("<CENTER><TABLE class="+"checkTable"+" ><TR><TH> Check 1 </TH></TR></TABLE></CENTER><br/><br/>");
        //funDef.GetRptDetails(1,date,args[0]);
        funDef.GetRptDetails(1,date,process_no);
        System.out.println("<CENTER><TABLE class="+"checkTable"+" ><TR><TH> Check 2 </TH></TR></TABLE></CENTER><br/><br/>");
        //funDef.GetRptDetails(2,date,args[0]);
        funDef.GetRptDetails(2,date,process_no);
        System.out.println("<CENTER><TABLE class="+"checkTable"+" ><TR><TH> Check 3 </TH></TR></TABLE></CENTER><br/><br/>");
        //funDef.GetRptDetails(3,date,args[0]);
        funDef.GetRptDetails(3,date,process_no);
        System.out.println("</BODY></HTML>");
    }
}

class FunctionDef
{
    void GetRptDetails(int CheckNo, String date, String process_no) throws IOException
        {
            String RptDetails;
            String[] RptDetailsSplit = new String[5];
            BufferedReader br=new BufferedReader(new FileReader("ReportDetails.txt."+process_no));
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
                       getDBComparisionDetails(CheckNo,RptDetailsSplit[2],RptDetailsSplit[3],RptDetailsSplit[4],date);
                   }
                   /*if(Integer.parseInt(RptDetailsSplit[1])==3)
                   {
                       getDiskSpaceDetails(CheckNo,RptDetailsSplit[2],RptDetailsSplit[3],date);
                   }*/
                }
            }
        }
    void getDBdataDetails(int CheckNo,String RptName,String process_no,String colname,String date) throws IOException
    {
            String FileName=RptName.replaceAll(" ", "_");
            System.out.println("<CENTER><TABLE class="+"myOtherTable"+"  ><TR><TH>"+RptName+" check for "+date+"</TH></TR></TABLE></CENTER><CENTER><TABLE class="+"myOtherTable"+">");
            BufferedReader br = new BufferedReader(new FileReader(FileName+".txt"+"."+process_no));
            String ID;
            int count=0;
            while(br.readLine()!=null)
            {
                count++;
            }
            if(count==0)
            {
                System.out.println("<TR><TD align="+"center"+">No Trades in Pending Status</TR></TD></TABLE></CENTER><br/><br/>");
            }
            else
            {
                System.out.println("<TR><TD align="+"center"+">Trades in Pending Status: "+count+"</TR></TD></TABLE></CENTER><br/><TABLE class="+"myOtherTable"+">");    
                BufferedReader br1 = new BufferedReader(new FileReader(FileName+".txt"+"."+process_no));
                    int counter = 0;
                    System.out.println("<TR>");
                    for( int i=0; i<colname.length(); i++ ) {
                        if( colname.charAt(i) == '#' ) {
                        counter++;
                        }
                    }
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
    }
        void TableCreater(int counter,String ID)
            {
                String[] IDsplit = new String[counter];
                IDsplit=ID.split("#");
                System.out.println("<TR>");
                for(int j=0;j<counter;j++)
                {
                    System.out.println("j="+j+"<TD align="+"center"+">"+IDsplit[j]+"</TD>");
                }
                System.out.println("</TR>");

            }

        void getDBComparisionDetails(int CheckNo,String RptName,String process_no,String colname,String date) throws IOException
        {
            String FileName=RptName.replaceAll(" ", "_");
            String TradesS=null;
            String TradesO=null;
            int cmp_count=0;
            int flag=0;
            String ID;
            System.out.println("<CENTER><TABLE class="+"myOtherTable"+"  ><TR><TH>"+RptName+" check for "+date+"</TH></TR></TABLE></CENTER><CENTER><TABLE class="+"myOtherTable"+">");

            BufferedReader br = new BufferedReader(new FileReader(FileName+"S.txt"+"."+process_no));
            BufferedReader br1 = new BufferedReader(new FileReader(FileName+"O.txt"+"."+process_no));
            int countS=0,countO=0;
            while(br.readLine()!=null)
            {
                countS++;
            }
            while(br1.readLine()!=null)
            {
                countO++;
            }
            System.out.println("<TR><TD align=center>Trades in DA(Sybase)"+countS);
            System.out.println("vs Trades in DA(Oracle)"+countO+"</TD></TR>");
            BufferedReader br2 = new BufferedReader(new FileReader(FileName+"diff.txt"+"."+process_no));
            int counter = 0;
                    System.out.println("<TR>");
                    for( int i=0; i<colname.length(); i++ ) {
                        if( colname.charAt(i) == '#' ) {
                        counter++;
                        }
                    }
                    //System.out.println(counter);
                    String[] colsplit = new String[counter];
                    colsplit=colname.split("#");
                    for(int k=0;k<counter;k++)
                    {
                        System.out.println("<TH>"+colsplit[k]+"</TH>");
                    }
                    System.out.println("</TR>");
                    while((ID=br2.readLine())!=null)
                    {
                        TableCreater(counter,ID);
                    }
                    System.out.println("</TABLE></CENTER><br/><br/>");
        }

}
    
