package org.indranil.projects.FastFlexApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxtDataExtractor {
	
	String extractedData_oneLiner;
	ArrayList<String> tmp = new ArrayList<String>();
	
	TxtDataExtractor(String extractedData_oneLiner)
	{
		this.extractedData_oneLiner=extractedData_oneLiner;
		
	}
	
	
	void fetch_accountnumber(String extractedData_oneLiner)
	{
		int size=0;
		HashSet<String> account_numbers = new HashSet<String>();
		//System.out.println(extractedData_oneLiner);
		extractedData_oneLiner=extractedData_oneLiner.replaceAll("\\s{2,}", " ").trim();
		//System.out.println(extractedData_oneLiner);
		Pattern p = Pattern.compile("\\s[0-9]+\\s");
		Matcher m = p.matcher(extractedData_oneLiner);
		while(m.find())
		{
			//System.out.println(Long.parseLong(extractedData_oneLiner.substring(m.start(), m.end()).replaceAll("\\s","")));
			tmp.add(extractedData_oneLiner.substring(m.start(), m.end()).replaceAll("\\s",""));
		}
		
		for(String tmp_acc : tmp)
		{
			if(tmp_acc.length()>size)
			{
				size=tmp_acc.length();
			}
		}
		//System.out.println("Max size is : "+size);
		for(String tmp_acc : tmp)
		{
			if(tmp_acc.length()==size)
			{
				account_numbers.add(tmp_acc);
			}
		}
		
		System.out.println("The account count is: "+account_numbers.size());
		if(account_numbers.size()==1)
		{
			System.out.println("The account number is: "+account_numbers);
		}
		else
		{
			System.out.println("The account numbers are: "+account_numbers);
		}
		
	}
	
	void fetch_statementstartenddate(String extractedData_oneLiner)
	{
		HashSet<Integer> years = new HashSet<Integer>();
		ArrayList<Integer> dates = new ArrayList<Integer>();
		Map<Integer, Integer> countMap = new HashMap<>();
		extractedData_oneLiner=extractedData_oneLiner.replaceAll("\\s{2,}", " ").trim();
		//System.out.println(extractedData_oneLiner);
		Pattern p = Pattern.compile("19\\d{2}|20\\d{2}|21\\d{2}");
		Matcher m = p.matcher(extractedData_oneLiner);
		while(m.find())
		{
			years.add(Integer.parseInt(extractedData_oneLiner.substring(m.start(), m.end()).replaceAll("\\s","")));
		}
		Integer max_year=0;
		Integer min_year=0;
		if(years.size()==1)
		{
			for(int year : years)
			{
				max_year=min_year=year;

			}
			
		}
		else
		{
			for(int year : years)
			{
				if(year>max_year)
				{
					max_year=year;
				}
				else
				{
					min_year=year;
				}
			}
		}
		//System.out.println(extractedData_oneLiner);
		//MAY 31, 2016 THROUGH JUNE 30, 2016
		extractedData_oneLiner=extractedData_oneLiner.replaceAll("[^A-Z0-9\\s]", " ");
		extractedData_oneLiner=extractedData_oneLiner.replaceAll("\\b1\\b","01").replaceAll("\\b2\\b","02").replaceAll("\\b3\\b","03").replaceAll("\\b4\\b","04").replaceAll("\\b5\\b","05").replaceAll("\\b6\\b","06").replaceAll("\\b7\\b","07").replaceAll("\\b8\\b","08").replaceAll("\\b9\\b","09");
		extractedData_oneLiner=extractedData_oneLiner.replaceAll("JAN[A-Z]*","01").replaceAll("FEB[A-Z]*","02").replaceAll("MAR[A-Z]*","03").replaceAll("APR[A-Z]*","04").replaceAll("MAY","05").replaceAll("JUN[A-Z]*","06").replaceAll("JUL[A-Z]*","07").replaceAll("AUG[A-Z]*","08").replaceAll("SEP[A-Z]*","09").replaceAll("OCT[A-Z]*","10").replaceAll("NOV[A-Z]*","11").replaceAll("DEC[A-Z]*","12");
		extractedData_oneLiner=extractedData_oneLiner.replaceAll("\\s","");
		//System.out.println(extractedData_oneLiner);
		Pattern p1 = Pattern.compile(min_year.toString()+"|"+max_year.toString());
		Matcher m1 = p1.matcher(extractedData_oneLiner);
		while(m1.find())
		{
			//System.out.println(extractedData_oneLiner.substring(m1.start()-12, m1.start()));
			//extractedData_oneLiner=extractedData_oneLiner.substring(m1.start()-12, m1.start());
			//System.out.println(extractedData_oneLiner);
			//System.out.println(extractedData_oneLiner.substring(0,extractedData_oneLiner.length()-4));
			//if(extractedData_oneLiner.substring(m1.start()-12, m1.start()).substring(m1.start()-12, m1.start()-8).matches("))
			//dates.add(Integer.parseInt(extractedData_oneLiner.substring(m1.start()-4, m1.start())));
		}
		System.out.println(dates);

		System.out.println("Statement start year : "+min_year);
		System.out.println("Statement end year : "+max_year);
	}

}
