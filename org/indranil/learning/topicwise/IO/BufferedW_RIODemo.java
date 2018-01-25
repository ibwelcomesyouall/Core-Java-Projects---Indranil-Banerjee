package org.indranil.learning.topicwise.IO;
// This program is to illustrate the Buffered Reader and Writer concept in Java
import java.io.*;
public class BufferedW_RIODemo 
{
    public static void main(String[]args) throws IOException
    {
        char[]ch ={'a','b','c','d'};
        BufferedWriter bw=new BufferedWriter(new FileWriter("demo1.txt"));
        bw.write("This is a file whose name is demo1.txt");
        bw.newLine(); // Have some problem in the code.
        bw.write("This is the second line of the file");
        bw=new BufferedWriter(new FileWriter("demo1.txt",true));
        bw.write("Hey!!! i have appened the file with the below line");
        bw.newLine();
        bw.write(ch);
        bw.flush();
        bw.close();
    }
}
