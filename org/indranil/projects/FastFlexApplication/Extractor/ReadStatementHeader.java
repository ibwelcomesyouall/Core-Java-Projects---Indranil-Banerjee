package org.indranil.projects.FastFlexApplication.Extractor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadStatementHeader {
	String line;
	int count=0;
	
	void readHeader(String filename) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		while((line=br.readLine())!=null)
		{
			//////////////////// Bank Name Logic as i have also considered this a bank of america's statement.
			if(count==0)
			{
				System.out.println("Bank Name : " + line.replaceAll("[^A-Z]"," ").trim());
			}
			Pattern p = Pattern.compile("[A-Z0-9]*\\.COM[A-Z0-9]*"); ////////////////////////////// Website Logic
			Matcher m = p.matcher(line);
			while(m.find())
			{
				System.out.println("Website : "+ line.substring(m.start(),m.end()));
				
			}	
			count++;
		}
		br.close();
	}
}
