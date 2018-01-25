package org.indranil.learning.topicwise.IO;
// This program is to illustrate the FileWriter Java class
import java.io.*;
public class FileW_RIODemo {
    public static void main(String []args) throws IOException
    {
        char[]ch={'a','b','c'};
        String s="This line is defined as string variable in the program";
        FileWriter fw=new FileWriter("demo.txt");
        fw.write("This is a demo file.");
        fw.write("\n This is the second line of the file"); // \n is not getting recognized by the FileWriter
        FileWriter fw1=new FileWriter("DemoDir\\OutsiderDemo.txt");
        fw1.write(ch);
        fw1.write(s);
        fw.flush();
        fw1.flush();
        fw.close();
        fw1.close();
        
        FileWriter fw2=new FileWriter("demo.txt",true);
        fw2.write("Indranil Banerjee");
        fw2.append("Twinkle Ghosal");
        fw2.flush();
        fw2.close();
    }
}
