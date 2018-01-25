package org.indranil.projects.eastonfileprocessing;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Indranil Banerjee
 */
public class EastonFileProcessingFix {
    public static void main(String[] args)throws DocumentException, FileNotFoundException {
        Scanner sc = new Scanner (System.in);
        System.out.println("********** Easton File Processing **********");
        System.out.println("Please enter the name of the file you want to process::");
        String filename=sc.nextLine();
        int count=0,count1=0,x=0,deletecount=0,outputpdfcount=0;
        File template = new File("Pattern.txt");
        File template1 = new File("Templates.txt");
        try {
                
                FileInputStream in = new FileInputStream(template);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                FileInputStream in1 = new FileInputStream(template1);
                BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
                String[] filearray = new String[50];
                String[] filearray1 = new String[50];
                int j=0,l=0;
                while ((filearray[j] = br.readLine()) != null) 
                {
                    filearray[j]=filearray[j].replaceAll("(( )+|\\n)", " ");
                    System.out.println(filearray[j]);
                    j++;
                }
                while ((filearray1[l] = br1.readLine()) != null) 
                {
                    filearray1[l]=filearray1[l].replaceAll("(( )+|\\n)", " ");
                    System.out.println(filearray1[l]);
                    l++;
                }
            PdfReader reader = new PdfReader(filename);
            File outFile = new File("Output.pdf");
            File outFile1 = new File("Deleted.pdf");
            Document document = new Document(reader.getPageSizeWithRotation(1));
            Document document1 = new Document(reader.getPageSizeWithRotation(1));
            PdfCopy copy = new PdfCopy(document, new FileOutputStream(outFile));
            PdfCopy copy1 = new PdfCopy(document1, new FileOutputStream(outFile1));
            System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
            //try{
            document.open();
            document1.open();
            for(int i=1; i <= reader.getNumberOfPages();i++){
            String page = PdfTextExtractor.getTextFromPage(reader, i);
            page=page.replaceAll("(( )+|\\n)", " ");
            System.out.println("page number="+i+page);
            for (int k=0;k<j;k++){
               System.out.println(filearray[k]);
               
                
            if (page.contains(filearray[k]))
            {
                x=1;
                for (int k1=0;k1<l;k1++){
                    System.out.println(filearray1[k1]);
                    
                if(page.contains(filearray1[k1]))
                {
                x=2;
                }
                }
            } 
            }         
            if (x==0)
            {
                PdfImportedPage page1 = copy.getImportedPage(reader, i);
                copy.addPage(page1);
                outputpdfcount=outputpdfcount+1;
            }
            if (x==1|| x==2)
            {
                PdfImportedPage page2 = copy1.getImportedPage(reader, i);
                if (x==1){
                copy1.addPage(page2);}
                else{
                PdfImportedPage page3 = copy1.getImportedPage(reader, i+1);
                copy1.addPage(page2);
                copy1.addPage(page3);
                deletecount=deletecount+1;
                i++;}
                deletecount=deletecount+1;
            }
            x=0;
            
            }
           System.out.println("Total pages deleted = "+deletecount);
           System.out.println("Total pages of "+filename+" = "+outputpdfcount);
           //System.out.println(document.getPageNumber());
            document.close();
            document1.close();
            sc.close();

        } catch (Exception e) {
            
            System.out.println("One of the document don't have a page.");
            //e.printStackTrace();
        } finally {
            sc.close();
        }
 
    }
 
    }

