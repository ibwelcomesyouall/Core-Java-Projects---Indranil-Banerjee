package org.indranil.projects.FastFlexApplication.Extractor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadStatementSummary {
	String line;
	int count=0,flag=0,counter=0;
	String[] words;
	HashMap <String,Double> summary = new HashMap <String,Double>();
	
	void readSummary(String filename) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		while((line=br.readLine())!=null)
		{
			if(count==0)
			{
				words=line.split(" ");
				System.out.println("Type of Account : "+ words[1]);
				System.out.println("Account Type : "+ words[words.length-1]);
			}
			else if(count==1)
			{
				line=line.replaceAll("JAN(?:UARY)?","01").replaceAll("FEB(?:RUARY)?","02").replaceAll("MAR(?:CH)?","03").replaceAll("APR(?:IL)?","04").replaceAll("MAY","05").replaceAll("JUN(?:E)?","06").replaceAll("JUL(?:Y)?","07").replaceAll("AUG(?:UST)?","08").replaceAll("SEP(?:TEMBER)?","09").replaceAll("OCT(?:OBER)?","10").replaceAll("NOV(?:EMBER)?","11").replaceAll("DEC(?:EMBER)?","12");
				line=line.replaceAll("[^0-9]"," ");
				line=line.replaceAll("\\s+"," ").trim();
				System.out.println("Account number : "+line.split(" ")[6]);
				System.out.println("Statement start date : "+line.split(" ")[1]+"/"+line.split(" ")[0]+"/"+line.split(" ")[2]);
				System.out.println("Statement end date : " +line.split(" ")[4]+"/"+line.split(" ")[3]+"/"+line.split(" ")[5]);
				
			}
			//FOR JANUARY 1. 2016 TO JANUARY 31. 2016
			else if (line.contains("ACCOUNT SUMMARY") || flag==1)
			{
				flag=1;	
				if(line.matches(".*\\d+.*"))
				{
					line=line.replaceAll("(?<=\\d) +(?=\\d)", "");
					line=line.replaceAll(",", "");
					line=line.replaceAll("- ", "-");
					line=line.replaceAll("\\s", "");
					//System.out.println(line);
					
					Pattern p = Pattern.compile("[-]?[\\$]?[0-9]*\\.[0-9]{2}");
					Matcher m = p.matcher(line);
					while(m.find())
					{
						//System.out.println(line.substring(m.start(), m.end()));
						if(counter==0)
						{
							summary.put("Opening Balance", Double.parseDouble(line.substring(m.start(), m.end()).replaceAll("\\$","")));	
						}
						else if(counter==1)
						{
							summary.put("Total deposits", Double.parseDouble(line.substring(m.start(), m.end()).replaceAll("\\$","")));
						}
						else if(counter==2)
						{
							summary.put("Total Withdrawals", Double.parseDouble(line.substring(m.start(), m.end()).replaceAll("\\$","")));
						}
						else if(counter==3)
						{
							summary.put("Checks", Double.parseDouble(line.substring(m.start(), m.end()).replaceAll("\\$","")));
						}
						else if(counter==4)
						{
							summary.put("Total Fees", Double.parseDouble(line.substring(m.start(), m.end()).replaceAll("\\$","")));
						}
						else if(counter==5)
						{
							summary.put("Average ledger balance", Double.parseDouble(line.substring(m.start(), m.end()).replaceAll("\\$","")));
						}
						else if(counter==6)
						{
							summary.put("Ending Balance", Double.parseDouble(line.substring(m.start(), m.end()).replaceAll("\\$","")));
						}					
						
						counter++;
						
					}

				}
			}
			count++;
		}
		br.close();
		for(String key:summary.keySet())
		{
			System.out.println(key+ " : "+summary.get(key));
		}
	}

}
