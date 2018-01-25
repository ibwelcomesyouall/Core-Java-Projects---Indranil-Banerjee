/*
 * 3,Name of the Report,Any starting message/Description,Job Details, check condition,Info Statement, Error Statement
*/
package org.indranil.projects.MyOfficeAutomations.HTMLGenerator;

public class JobDetailsFormater {
    JobDetailsFormater(String ReportName, String desc, String JobDetails, String condition, String infomsg, String errmsg, String date)
    {
        System.out.println("<TABLE>");
                if(!ReportName.isEmpty())
                {
                 System.out.println("<TR><TH>"+ReportName+" for "+date+"</TH></TR>");   
                }
                if(!desc.isEmpty())
                {
                 System.out.println("<TR><TH>"+desc+"</TH></TR>");   
                }
                if(!JobDetails.isEmpty())
                {
                 System.out.println("<TR><TD>"+JobDetails+"</TD><TR>");   
                }
                String status = checkCondition(JobDetails,condition);
                if (status.equals("info"))
                {
                    if(!infomsg.isEmpty())
                    {
                        System.out.println("<TR><TD>"+infomsg+"</TD><TR>");   
                    }
                }
                else
                {
                    if(!errmsg.isEmpty())
                    {
                        System.out.println("<TR><TD>"+errmsg+"</TD><TR>");   
                    }
                }
                System.out.println("</TABLE>");
    }
    static String checkCondition(String JobDetails,String condition)
    {
        String status;
        String JobDetailsSplit[] = new String[7];
        String ConditionSplit[] = new String[2];
        JobDetails=JobDetails.replaceAll("\\s{2,}", " ").trim();
        JobDetailsSplit= JobDetails.split(" ");
        ConditionSplit= condition.split(":");
        if (JobDetailsSplit[5].equals(ConditionSplit[1]))   
            status="info";
        else
            status="err";
        return status;
    }
    
}
