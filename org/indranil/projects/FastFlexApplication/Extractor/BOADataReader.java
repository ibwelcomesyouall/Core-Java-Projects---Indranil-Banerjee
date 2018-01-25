package org.indranil.projects.FastFlexApplication.Extractor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BOADataReader {
	
	String line;
	int counter=0,counter1=0;
	String[] maindata_Array,maindata_Array1,maindata_Array2;
	StringBuffer filtered_data = new StringBuffer();
	ArrayList<String> extractedDataList = new ArrayList<String>();
	
	void readAndSplit(String filename) throws IOException
	{
		int count=0,start_count=0;
		BufferedReader br = new BufferedReader(new FileReader(filename));
		while((line=br.readLine())!=null)
		{
			if(counter==3)
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
		br.close();
		//System.out.println(extractedDataList);
		for(String line:extractedDataList)
		{
			//System.out.println(line);
			//System.out.println("#################### The count is : "+count);
			if(line.contains("Please see the Account Changes section of your statement for details regarding important changes to your account".toUpperCase()))
			{
				//System.out.println(start_count);
				splittedFileGenerator(filename.split("\\.")[0]+"header.txt",extractedDataList,0,count);
				start_count=count+1;
				//System.out.println(count);
			}
			else if(line.contains("Includes checks paid. deposited irems & orher debits".toUpperCase()))
			{
				//System.out.println("#################### The count is : "+count);
				//System.out.println("#################### The start count is : "+start_count);
				splittedFileGenerator(filename.split("\\.")[0]+"summary.txt",extractedDataList,start_count,count);
				start_count=count+1;
			}
			else if(line.contains("printable version of the How to Balance Your Account Worksheet".toUpperCase()))
			{
				splittedFileGenerator(filename.split("\\.")[0]+"transaction.txt",extractedDataList,start_count,count);
			}
			count++;
		}
	}
	
	void splittedFileGenerator(String filename, ArrayList<String> l, int start_index, int end_index) throws FileNotFoundException
	{
		PrintWriter pr = new PrintWriter(filename);
		int index=start_index;
		while(index <= end_index)
		{
			//System.out.println(l.get(index));
			pr.println(l.get(index));	
			index++;
		}
		pr.flush();
		pr.close();
	}

	public static void main(String[] args) throws IOException {
		BOADataReader bdr = new BOADataReader();
		bdr.readAndSplit("F:\\FastFlex Loan Processing Application\\Input\\BOAStmtJanuary2016.txt");
		ReadStatementHeader rsh = new ReadStatementHeader();
	    rsh.readHeader("F:\\FastFlex Loan Processing Application\\Input\\BOAStmtJanuary2016header.txt");
		ReadStatementSummary rss = new ReadStatementSummary();
		rss.readSummary("F:\\FastFlex Loan Processing Application\\Input\\BOAStmtJanuary2016summary.txt");
	}

}
