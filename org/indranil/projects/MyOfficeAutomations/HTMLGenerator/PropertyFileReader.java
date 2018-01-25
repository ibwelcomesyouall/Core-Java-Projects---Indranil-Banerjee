package org.indranil.projects.MyOfficeAutomations.HTMLGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PropertyFileReader {
    PropertyFileReader(String date, String ControlFile) throws IOException
    {
        String CntlDetails;
        String[] CntlDetailsSplit = new String[7];
        BufferedReader br=new BufferedReader(new FileReader(ControlFile));
        while((CntlDetails=br.readLine())!=null)
        {
            CntlDetailsSplit=CntlDetails.split(",");
            if(Integer.parseInt(CntlDetailsSplit[0])==1)
            {
                DBDataFormater dbf = new DBDataFormater(
                        CntlDetailsSplit[1],//Name of the Report
                        CntlDetailsSplit[2],//Any starting message/Description
                        CntlDetailsSplit[3],//Column name seperated by #
                        CntlDetailsSplit[4],//check condition
                        CntlDetailsSplit[5],//Info Statement
                        CntlDetailsSplit[6],// Error Statement
                        date); 
            }
            if(Integer.parseInt(CntlDetailsSplit[0])==2)
            {
                LogDataFormater ldf = new LogDataFormater(
                        CntlDetailsSplit[1],//Name of the Report
                        CntlDetailsSplit[2],//Any starting message/Description
                        CntlDetailsSplit[3],//Log details
                        CntlDetailsSplit[4],//check condition
                        CntlDetailsSplit[5],//Info Statement
                        CntlDetailsSplit[6],// Error Statement
                        date);
            } 
            if(Integer.parseInt(CntlDetailsSplit[0])==3)
            {
                JobDetailsFormater jdf = new JobDetailsFormater(
                        CntlDetailsSplit[1],//Name of the Report
                        CntlDetailsSplit[2],//Any starting message/Description
                        CntlDetailsSplit[3],//Job details
                        CntlDetailsSplit[4],//check condition
                        CntlDetailsSplit[5],//Info Statement
                        CntlDetailsSplit[6],// Error Statement
                        date);
            }  
        }
    }
}
