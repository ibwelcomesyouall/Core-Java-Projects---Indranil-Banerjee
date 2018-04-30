package org.indranil.learning.topicwise.PDF;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PdfReaderDemo {

    private static String path="F:\\Study\\Java Programming Codes\\IMP Details\\Spring and Hibernate\\All PDFs\\07-spring-security-pdfs\\07-spring-security-pdfs";
    private static String destination_file="F:\\security.txt";
    

    public static void main(String[] args) throws IOException {
    	PdfReader reader;
    	
    	BufferedWriter bw = new BufferedWriter(new FileWriter(destination_file,true));
    	
    	File f = new File(path);
    	for(String file: f.list()) {
    		System.out.println(">> Reading the file: " + file);
    		try {

                reader = new PdfReader(path+"\\"+file);
                String text=null;
                
                for(int i=1; i<=reader.getNumberOfPages();i++)
                	text = text + PdfTextExtractor.getTextFromPage(reader, i);

                System.out.println(text);
                bw.write(text);

                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }    		
    	}
    	bw.close();
    }

}
