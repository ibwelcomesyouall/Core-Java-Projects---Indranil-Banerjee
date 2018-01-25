package org.indranil.projects.FastFlexApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class txtStatementReader {
	
	String file =null;
	String line;
	int line_count=0;
	HashSet<Integer> page_numberList = new HashSet<Integer>();
	ArrayList<Integer> page_numberList_tmp = new ArrayList<Integer>();
	String[] pagenumber_Array,maindata_Array,maindata_Array1,maindata_Array2;
	ArrayList<String> extractedDataList= new ArrayList<String>();
	StringBuffer filtered_data = new StringBuffer();
	StringBuffer extractedData_oneLiner = new StringBuffer();
	int counter=0;
	int counter1=0;
	
	public txtStatementReader(String file) throws IOException {
		this.file=file;
		statementproperties(file);
	}
	
	void statementproperties(String file) throws IOException{
		File f = new File(file);
		BufferedReader br = new BufferedReader(new FileReader(f));
		while((line=br.readLine())!=null) {
			if(counter==0)
			{
				pagenumber_Array=line.split(";");
				for(String page_number_data:pagenumber_Array)
				{
					page_numberList.add(Integer.parseInt(page_number_data)+1);
					page_numberList_tmp.add(Integer.parseInt(page_number_data)+1);
					line_count++;
				}
			}
			else if(counter==3)
			{
				maindata_Array=line.split(";");
				for(String main_data: maindata_Array)
				{
					maindata_Array1=main_data.split("~");
					for(String main_data1: maindata_Array1)
					{
						maindata_Array2=main_data1.split("\\|");
						for(String main_data2 : maindata_Array2)
						{
							if(counter1==0)
							{
								filtered_data.append(main_data2+" ");
							}
							counter1++;
						}
						counter1=0;
					}
					extractedDataList.add(filtered_data.toString().toUpperCase()+" ");
					filtered_data=new StringBuffer();
				}
			}
			counter++;
		}
		System.out.println("##########################################################################################");
		System.out.println(f.getName()+" pdf has "+page_numberList.size()+" pages,"+line_count+" lines"+" and page numbers are : "+page_numberList);
		//System.out.println(extractedDataList);
		for(String extractedData : extractedDataList)
		{
			extractedData_oneLiner.append(extractedData.toString()+" ");
		}
		//System.out.println(extractedData_oneLiner);
		TxtDataExtractor tde = new TxtDataExtractor(extractedData_oneLiner.toString());
		//tde.fetch_accountnumber(extractedData_oneLiner.toString());
		tde.fetch_statementstartenddate(extractedData_oneLiner.toString());
		//fetch_account_number(f,extractedDataList);
		//fetch_statement_start_end(f,extractedDataList);
		//Read_and_formattxt raft = new Read_and_formattxt(extractedDataList);
		//ReadFormatFile_and_load rffal = new ReadFormatFile_and_load(extractedDataList);
		//SaveDataToDB sdDB = new SaveDataToDB(page_numberList_tmp,extractedDataList);
	}
	
	public static void main(String[] args) throws IOException
	{
		//txtStatementReader tsr = new txtStatementReader("F:\\FastFlex Loan Processing Application\\Input\\BOAStmtJanuary2016.txt");
		txtStatementReader tsr1 = new txtStatementReader("F:\\FastFlex Loan Processing Application\\Input\\ChaseStmt2160531to160630.txt");
		//txtStatementReader tsr2 = new txtStatementReader("F:\\FastFlex Loan Processing Application\\Input\\HeritageBankStmtJul.txt");
	}
	
	void fetch_account_number(File file,ArrayList<String> extractedDataList)
	{
		StringBuffer account_number_tmp = new StringBuffer();
		HashSet<Long> account_numbers = new HashSet<Long>();
		String extractedaccountdata;
		for(String extractedData: extractedDataList)
		{
			extractedData=extractedData.replaceAll("[^A-Z0-9]", "").replaceAll("NUMBER", "");
			
			if(extractedData.contains("ACCOUNT") && extractedData.matches(".*\\d+.*"))
			{
				if(!extractedData.endsWith("ACCOUNT")&&extractedData.split("ACCOUNT")[1].matches(".*\\d+.*") && extractedData.matches("[A-Z0-9]*ACCOUNT[0-9]+[A-Z0-9]*"))
				{
					extractedaccountdata=extractedData.split("ACCOUNT")[1];
					for(char accountnumberdata: extractedaccountdata.toCharArray())
					{
						if((int)accountnumberdata>47 && (int)accountnumberdata<58)
						{
							//System.out.println(accountnumberdata);
							account_number_tmp.append(accountnumberdata);						
							
						}
						else
						{
							break;
						}
						
					}
					account_numbers.add(Long.parseLong(account_number_tmp.toString()));
					account_number_tmp=new StringBuffer();
				}
			}
		}
		System.out.println("The account count in "+file.getName()+" is: "+account_numbers.size());
		if(account_numbers.size()==1)
		{
			System.out.println("The account number is: "+account_numbers);
		}
		else
		{
			System.out.println("The account numbers are: "+account_numbers);
		}
		
	}
	
	void fetch_statement_start_end(File file,ArrayList<String> extractedDataList)
	{
		String statement_start_year=null,statement_end_year=null,statement_start_day=null,statement_end_day=null,statement_start_month=null,statement_end_month=null;
		
		for(String extractedData: extractedDataList)
		{
			//System.out.println(extractedData);

			if(extractedData.matches(".*\\d+.*")&& extractedData.matches("[A-Z0-9/-|., ]*[0-9]{4}[A-Z0-9/-|., ]*[0-9]{4}"))
			{
				//System.out.println(extractedData);
				extractedData=extractedData.replaceAll("[^0-9]+", " ");
				//System.out.println(extractedData);
				String[] year_tmp=extractedData.split(" ");
				int year_count=0;
				for(String year: year_tmp)
				{
					//System.out.println(year.length());
					if(year.length()==4 && year_count==0)
					{
						statement_start_year=year;
						year_count++;
					}
					else if(year.length()==4 && year_count==1)
					{
						statement_end_year=year;
						year_count++;
					}
					
				}				

			}
			
		}
		for(String extractedData: extractedDataList)
		{
			//System.out.println(extractedData);
			//System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			if(extractedData.matches(".*\\d+.*")&& extractedData.matches("[A-Z0-9/-|., ]*[0-9]{4}[A-Z0-9/-|., ]*[0-9]{4}"))
			{
				extractedData=extractedData.replaceAll("[^0-9A-Z]+", "");
				//System.out.println(extractedData);
				extractedData=extractedData.replaceAll("JANUARY", "JAN").replaceAll("FEBRUARY", "FEB").replaceAll("MARCH", "MAR").replaceAll("APRIL", "APR").replaceAll("JUNE", "JUN").replaceAll("JULY", "JUL").replaceAll("AUGUST", "AUG").replaceAll("SEPTEMBER", "SEP").replaceAll("OCTOBER", "OCT").replaceAll("NOVEMBER", "NOV").replaceAll("DECEMBER", "DEC");
				//System.out.println(extractedData);
				Pattern p = Pattern.compile("[A-Z]{3}([0-9]{2}|[0-9]{1})[0-9]{4}[A-Z]*[A-Z]{3}[0-9]+[0-9]{4}");
				Matcher m = p.matcher(extractedData);
				while(m.find())
				{
					extractedData=extractedData.substring(m.start(), m.end()).replaceAll(statement_start_year,"").replaceAll(statement_end_year,"");
					//System.out.println(extractedData);
					extractedData=extractedData.replaceAll("JAN", "").replaceAll("FEB", "").replaceAll("MAR", "").replaceAll("APR", "").replaceAll("MAY", "").replaceAll("JUN", "").replaceAll("JUL", "").replaceAll("AUG", "").replaceAll("SEP", "").replaceAll("OCT", "").replaceAll("NOV", "").replaceAll("DEC", "");
					extractedData=extractedData.replaceAll("[A-Z]", "-").replaceAll("(-)\\1{1,}", "-");

					statement_start_day=extractedData.split("-")[0];
					statement_end_day=extractedData.split("-")[1];
				}
				
			}
		}
		for(String extractedData: extractedDataList)
		{
			//System.out.println(extractedData);
			//System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			if(extractedData.matches(".*\\d+.*")&& extractedData.matches("[A-Z0-9/-|., ]*[0-9]{4}[A-Z0-9/-|., ]*[0-9]{4}"))
			{
				extractedData=extractedData.replaceAll("[^0-9A-Z]+", "");
				//System.out.println(extractedData);
				extractedData=extractedData.replaceAll("JANUARY", "JAN").replaceAll("FEBRUARY", "FEB").replaceAll("MARCH", "MAR").replaceAll("APRIL", "APR").replaceAll("JUNE", "JUN").replaceAll("JULY", "JUL").replaceAll("AUGUST", "AUG").replaceAll("SEPTEMBER", "SEP").replaceAll("OCTOBER", "OCT").replaceAll("NOVEMBER", "NOV").replaceAll("DECEMBER", "DEC");
				//System.out.println(extractedData);
				Pattern p = Pattern.compile("[A-Z]{3}([0-9]{2}|[0-9]{1})[0-9]{4}[A-Z]*[A-Z]{3}[0-9]+[0-9]{4}");
				Matcher m = p.matcher(extractedData);
				while(m.find())
				{
					//System.out.println(extractedData);
					extractedData=extractedData.substring(m.start(), m.end()).replaceAll("[0-9]*","");
					//System.out.println(extractedData);
					extractedData=extractedData.replaceAll("JAN","01").replaceAll("FEB","02").replaceAll("MAR","03").replaceAll("APR","04").replaceAll("MAY","05").replaceAll("JUN","06").replaceAll("JUL","07").replaceAll("AUG","08").replaceAll("SEP","09").replaceAll("OCT","10").replaceAll("NOV","11").replaceAll("DEC","12");
					//System.out.println(extractedData);
					extractedData=extractedData.replaceAll("[A-Z]", "-").replaceAll("(-)\\1{1,}", "-");
					//System.out.println(extractedData);
					statement_start_month=extractedData.split("-")[0];
					statement_end_month=extractedData.split("-")[1];
					//System.out.println(extractedData);
					
				}
				
			}
		}
		System.out.println("The statement start date is: "+statement_start_day+"/"+statement_start_month+"/"+statement_start_year);
		System.out.println("The statement end date is: "+statement_end_day+"/"+statement_end_month+"/"+statement_end_year);
		System.out.println("##########################################################################################");
	}
	
	void savethedatatoDB(ArrayList<String> extractedDataList)
	{
		for(String extractedData: extractedDataList)
		{
				System.out.println(extractedData);
		}
		
	}
}
