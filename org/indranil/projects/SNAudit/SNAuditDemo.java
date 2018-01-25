package org.indranil.projects.SNAudit;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SNAuditDemo 
{
	public static void main(String[] args) 
	{
                String AuditResult = null;
                int auditsuccess = 0;
                try
                {
                    FileInputStream file = new FileInputStream(new File("D:\\Indranil\\Projects\\SNAudit\\Spreadsheets\\howtodoinjava_demo.xlsx"));

			//Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			//Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			//Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
                        
                       Row row = rowIterator.next();
                       Set<String> names = new HashSet<String>();
                        names.add("ANALYSISINPROGRESSFROMPS");
                        names.add("DUETOOTHERPRIORITYINCIDENTS");
                        names.add("WAITINGFORCODECHANGE");
                        names.add("WAITINGFORRESPONSEFROMINTERFACETEAM");
                        names.add("WAITINGFORRESPONSEFROML3");
                        names.add("WAITINGFORRESPONSEFROMVENDOR/USER");
                        Set<String> names1 = new HashSet<String>();
                        names1.add("DAILY ACTIVITY");
                        names1.add("USER QUERY");
                        int flag1=0;
                            for (int i =0 ;i <=18;i++)
                            {
                                Cell validate = row.getCell(i);
                                String header[] = new String[19];
                                header[i]=validate.getStringCellValue();
                               // System.out.print(header[i]);
                                //System.out.print(i);
                                flag1=valid(header[i],i);
                                if(flag1==1)
                                {
                                    break;
                                }
                                //System.out.print(flag1);
                            }
                                if(flag1==1)
                                {
                                    System.out.print("XML Parsing Error !!!"+"\n"+"Please check the XML format");
                                }
                                else
                                {
			while (rowIterator.hasNext())
                        { 
                                row = rowIterator.next();
                                Iterator<Cell> cellIterator = row.cellIterator();
                                Cell cell14 = row.getCell(7);
                                Cell cell15 = row.getCell(0);
                                Cell cell20 = row.getCell(6);
                               
				while (cellIterator.hasNext()) 
				{
					Cell cell = cellIterator.next();
                                        
                                        switch(cell.getColumnIndex())
					{
						// Check for the not null for Number,Contact,Title,Priority,Incident state,Assignment group,Assignee
                                            //Opened,User defined 1,Work notes,excluding User defined 2,Resolution description,Resolution category,Classification,
                                            //Description,Resolved,Primary Application,Primary application instance,Primary environment.
                                            case 0:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            AuditResult = "SN#"+cell.getStringCellValue()+" ";
                                                        break;
                                                case 1:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            AuditResult = AuditResult+"assigned to"+" "+cell20.getStringCellValue()+" ";
                                                            AuditResult = AuditResult+"created on"+" "+cell14.getDateCellValue()+" "+"has below errors:"+"\n";
                                                        break;
                                                case 2:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                          AuditResult = AuditResult+"Title Missing."+"\n";
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 3:
                                                    //Severity Check
                                                    //case 18 Primary environment if uat then case 4 priority should be 4-Low,
                                                    //case 18 Primary environment if prod and case 2 has prefix as User query or daily activity then 4-Low
                                                    Cell cell4 = row.getCell(18);
                                                    Cell cell5 = row.getCell(2);
                                                    String Des = cell5.getStringCellValue();
                                                    Des = Des.replaceAll("[^a-zA-Z]", " ");
                                                    Des = Des.toUpperCase();
                                                    Des = Des.trim();
                                                    String[] arr = Des.split("\\s+");
                                                    //System.out.print(Des);
                                                    String Prefix = arr[0]+arr[1];
                                                    if (cell4.getStringCellValue().equals("UAT"))
                                                    {
                                                       if (!cell.getStringCellValue().equals("4 - Low"))
                                                        {
                                                          auditsuccess = 1;
                                                           AuditResult = AuditResult+"Wrong priority selected."+"\n";
                                                         }
                                                    }
                                                    else if (cell4 .getStringCellValue().equals("PROD") && names1.contains(Prefix))
                                                    {
                                                        if(!cell.getStringCellValue().equals("4 - Low"))
                                                        {
                                                            auditsuccess = 1;
                                                            AuditResult = AuditResult+"Wrong priority selected for Daily activity/User query SNs"+"\n";
                                                        }
                                                    }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 4:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 5:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 6:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                               case 7:
                                                        if (cell.getDateCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getDateCellValue() + "\t");
                                                        break;
                                               case 8:
                                                       if (cell.getNumericCellValue()==0)
                                                        {
                                                          auditsuccess = 1;
                                                          AuditResult = AuditResult+"Efforts missing."+"\n";

                                                         }
                                                        else
                                                            //System.out.print(cell.getNumericCellValue() + "\t");
                                                        break;
                                                case 9:
                                                        //case 4 if incident state is resolved or pending then case 9 work note should have some value
                                                        Cell cell1 = row.getCell(4);
                                                        //System.out.print(cell1.getStringCellValue());
                                                        //System.out.print(cell.getStringCellValue() + "\t");
                                                        if (cell1.getStringCellValue().equals("Resolved") && cell.getStringCellValue().equals(""))
                                                        {

                                                            auditsuccess = 1;
                                                            AuditResult = AuditResult+"Work Notes missing."+"\n";
                                                         }
                                                        else if (cell1.getStringCellValue().equals("Pending") && cell.getStringCellValue().equals(""))
                                                            {
                                                          auditsuccess = 1;
                                                            AuditResult = AuditResult+"Work Notes missing"+"\n";
                                                         }
                                                         else
                                                             //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 10:
                                                    //User defined 2 field check
                                                    //case 4 if incident state is pending or in progress then case 10 user defined 2 must have values
                                                    //like
                                                    //Analysis in progress from PS
                                                    //Due to other priority incidents
                                                    //Waiting for Code change
                                                    //Waiting for response from interface team
                                                    //Waiting for response from L3
                                                    //Waiting for response from Vendor / User
                                                    //if ticket age is more than 8 hours in case of in progress then case 10 user defined 2 must have values
                                                    //case 4 if incident state is resolved and if user defined 2 has value hen it must be in between
                                                    //the above values.
                                                    Cell cell2 = row.getCell(4);
                                                    Cell cell3 = row.getCell(7);
                                                    //Calculate the age of the ticket
                                                    cell3.getDateCellValue();
                                                    Date crrdate = new Date();
                                                    //System.out.print(crrdate);
                                                    Date opendate = cell3.getDateCellValue();
                                                    long diff = crrdate.getTime() - opendate.getTime();
                                                    long diffSeconds = diff / 1000 % 60;
                                                    long diffMinutes = diff / (60 * 1000) % 60;
                                                    long diffHours = diff / (60 * 60 * 1000);
                                                    long Age_in_minutes = ((diffHours*60)+diffMinutes+(diffSeconds/60));
                                                   //System.out.println(Age_in_minutes);
                                                    String usrdef=cell.getStringCellValue();
                                                    usrdef = usrdef.toUpperCase().trim().replaceAll("\\s+","");
                                                    //System.out.print(usrdef);
                                                    if (cell2.getStringCellValue().equals("Pending") && cell.getStringCellValue().equals(""))
                                                        {
                                                        auditsuccess = 1;
                                                        AuditResult = AuditResult+"User Defined2 field missing"+"\n";
                                                         }
                                                    else if(cell2.getStringCellValue().equals("In Progress") && cell.getStringCellValue().equals(""))
                                                            {
                                                                if(Age_in_minutes > 480)
                                                                {
                                                                    auditsuccess = 1;
                                                                    AuditResult = AuditResult+"User Defined2 field missing"+"\n";
                                                                }
                                                         }
                                                    else if(!names.contains(usrdef) && !cell.getStringCellValue().equals(""))
                                                          {
                                                         auditsuccess = 1;
                                                         //System.out.print(cell.getStringCellValue() + "\t");
                                                         AuditResult = AuditResult+"User Defined2 field is not defined as instructed"+"\n";
                                                        }
                                                        else
                                                           // System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 11:
                                                       if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 12:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 13:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 14:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 15:
                                                        if (cell.getDateCellValue()== null)
                                                        {
                                                           auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getDateCellValue() + "\t");
                                                        break;
                                                case 16:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 17:
                                                    //Correct SN group selection check.
                                                    Cell cell6 = row.getCell(16);
                                                    Cell cell7 = row.getCell(18);
                                                    int flag = EnvCheck(cell7.getStringCellValue(),cell6.getStringCellValue(),cell.getStringCellValue());
                                                        if (flag == 1)
                                                        {
                                                            auditsuccess = 1;
                                                          AuditResult = AuditResult+"Wrong SN group selected"+"\n";
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
                                                case 18:
                                                        if (cell.getStringCellValue()==null)
                                                        {
                                                          auditsuccess = 1;
                                                         }
                                                        else
                                                            //System.out.print(cell.getStringCellValue() + "\t");
                                                        break;
					}
                            }
                                        if(auditsuccess==1)
                                {
				System.out.print(AuditResult);
                                 }
                            else
                                {
                                    AuditResult="SN#"+cell15.getStringCellValue()+" "+"assigned to"+" "+cell20.getStringCellValue()+" "+"created on"+" "+cell14.getDateCellValue()+" "+"has no errors"+"\n";
                                    System.out.print(AuditResult);
                            }              
			}
                        System.out.println("Audit successfully Done.");
                    }
                        

         // Now set the actual message
        

         // Send message
			file.close();
                        
            }
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

    private static int EnvCheck(String stringCellValue, String stringCellValue0, String stringCellValue1) {

        int flag=0;
        String Env=stringCellValue;
        String App=stringCellValue0;
        String Ins=stringCellValue1;

        if (Env.equals("PROD") && App.equals("EVENT MASTER CENTRAL"))
        {
            if(!Ins.equals("EMC~GLBL~PROD~EMC"))
            flag=1;
        }
        if(Env.equals("UAT") && App.equals("EVENT MASTER CENTRAL"))
        {
            if(!Ins.equals("EMC~GLBL~UAT~EMC"))
                flag=1;
        }

        return flag;
    }

    private static int valid(String header, int i) {
        int flag = 0;
        if(i==0 && !(header.equals("Number")))
        {
            flag = 1;
        }
        if(i==1 && !(header.equals("Contact")))
        {
            flag = 1;
        }
        if(i==2 && !(header.equals("Title")))
        {
            flag = 1;
        }
        if(i==3 && !(header.equals("Priority")))
        {
            flag = 1;
        }
        if(i==4 && !(header.equals("Incident state")))
        {
            flag = 1;
        }
        if(i==5 && !(header.equals("Assignment group")))
        {
            flag = 1;
        }
        if(i==6 && !(header.equals("Assignee")))
        {
            flag = 1;
        }
        if(i==7 && !(header.equals("Opened")))
        {
            flag = 1;
        }
        if(i==8 && !(header.equals("User defined 1")))
        {
            flag = 1;
        }
        if(i==9 && !(header.equals("Work notes")))
        {
            flag = 1;
        }
        if(i==10 && !(header.equals("User defined 2")))
        {
            flag = 1;
        }
        if(i==11 && !(header.equals("Resolution description")))
        {
            flag = 1;
        }
        if(i==12 && !(header.equals("Resolution category")))
        {
            flag = 1;
        }
        if(i==13 && !(header.equals("Classification")))
        {
            flag = 1;
        }
        if(i==14 && !(header.equals("Description")))
        {
            flag = 1;
        }
        if(i==15 && !(header.equals("Resolved")))
        {
            flag = 1;
        }
        if(i==16 && !(header.equals("Primary Application")))
        {
            flag = 1;
        }
        if(i==17 && !(header.equals("Primary application instance")))
        {
            flag = 1;
        }
        if(i==18 && !(header.equals("Primary environment")))
        {
            flag = 1;
        }
																	       
       return flag;
    }
       
}
