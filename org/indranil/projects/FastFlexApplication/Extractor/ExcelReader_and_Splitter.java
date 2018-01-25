package org.indranil.projects.FastFlexApplication.Extractor;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader_and_Splitter {
     
    public static void main(String[] args) throws IOException {
        String excelFilePath = "F:\\FastFlex Loan Processing Application\\Input\\Data.xlsx";
        System.out.println("Hello");
        txtFileNameGenerator(excelFilePath);
    }
    
    static void txtFileNameGenerator(String excelfile) throws IOException
    {
    	FileInputStream inputStream = new FileInputStream(new File(excelfile));
        
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();
         
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                System.out.println(cell.getRowIndex() +" "+cell.getColumnIndex());
                 if(nextRow.getRowNum()>0 && cell.getColumnIndex()==0 && cell.getStringCellValue().contains("pdf"))
                 {
                	 System.out.println(cell.getStringCellValue());
                	 txtFileGenerator(cell.getStringCellValue().split("\\.")[0]+".txt",txtFileDataGenerator(excelfile,cell.getStringCellValue()));
                	 System.out.println("walla !!");
                	 System.out.println(cell.getStringCellValue());
                 }

            }
        }
        inputStream.close();
    }
    
    static ArrayList<String> txtFileDataGenerator(String excelfile, String pdf_name) throws IOException
    {
    	ArrayList<String> all_data = new ArrayList<String>();
    	FileInputStream inputStream = new FileInputStream(new File(excelfile));
        
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();
         
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if(cell.getStringCellValue().equals(pdf_name))
                {
                	System.out.println("got it");
                	while (cellIterator.hasNext())
                	{
                		all_data.add(cellIterator.next().getStringCellValue());
                	}
                }
            }
        }  
        inputStream.close();
        return all_data;
    }
             
    
    static void txtFileGenerator(String filename, ArrayList<String> all_data) throws FileNotFoundException
    {
    	PrintWriter pr = new PrintWriter("F:\\FastFlex Loan Processing Application\\Input\\"+filename);
    	for(String data : all_data)
    	{
    		pr.println(data);    		
    	}
    	pr.close();
    }
 
}
