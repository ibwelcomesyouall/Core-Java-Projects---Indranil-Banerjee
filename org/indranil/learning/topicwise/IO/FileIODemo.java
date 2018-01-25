package org.indranil.learning.topicwise.IO;
//The below program is just a demo which will contain all File Readers and Writer classes.
// This will illustrate the below different java classes:
//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
//PrintWriter
import java.io.*;
public class FileIODemo  
{
    public static void main(String[] args) throws IOException
    {
        //Code to create new file.
        //There are 3 file constructors.
        //File f = new File(String fName);
        //File f=new File(String subdirectory,String fName);
        //File f=new File (File subdirectory, String fName);
        File f =new File("demo.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());
        //Code to create new directory.
        File f1=new File("DemoDir");
        System.out.println(f1.exists());
        f1.mkdir();
        System.out.println(f1.exists());
        File f4=new File("DemoDir\\InsideDir");
        f4.mkdir();
        File f2=new File("DemoDir\\InsideDir","InsideDemo.txt");
        f2.createNewFile();
        File f3=new File(f1,"OutsideDemo.txt");
        f3.createNewFile();
        System.out.println(f.isFile());
        System.out.println(f4.isDirectory());
        String[] fileList=f1.list();
        for (String s1:fileList)
        {
            System.out.println(s1);
        }
        System.out.println(f.length());
        f.delete();
        System.out.println("****Program Completed****");
    }
    
}
