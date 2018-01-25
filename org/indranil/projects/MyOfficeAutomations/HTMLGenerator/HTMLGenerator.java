package org.indranil.projects.MyOfficeAutomations.HTMLGenerator;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HTMLGenerator {

   public static void main(String[] args) throws IOException {

        String pattern = "MM/dd/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String ReportName="DA Additional Check";
        //String ReportName=args[0];
        String StylerDetails;
        BufferedReader br=new BufferedReader(new FileReader("Styler.txt"));
        while((StylerDetails=br.readLine())!=null)
        {
            System.out.println(StylerDetails);
        }
        // Title of the Report
        System.out.println("<CENTER>"
                + "<TABLE class="+"headerTable"+">"
                + "<TR>"
                + "<TH>"+ReportName+" for "+date+"</TH>"
                + "</TR>"
                + "</TABLE>"
                + "</CENTER>"
                + "<br/><br/>");
        // Reader the ReportDetails File
        PropertyFileReader pfr = new PropertyFileReader(date,"ReportDetails.txt");
        System.out.println("</BODY></HTML>");
    }
}
