/*
 * Write  a program ro read a file containing mobile numbers and write the mobile numbers to a new file
 */
package org.indranil.learning.topicwise.Regular_Expression;
import java.io.*;
import java.util.regex.*;

public class PhCapture {
    public static void main (String[] args) throws IOException
    {
        String floc= "F:\\Study\\Programming language\\My Java Codes\\Dummy Files inventory";
        File f = new File(floc);
        String s[] = f.list();
        Pattern p = Pattern.compile("[a-zA-Z0-9]*[.]txt");
        for (String s1:s)
        {
          
          Matcher m = p.matcher(s1);
          if (m.find())
          {
          System.out.println(s1);
          BufferedReader br = new BufferedReader(new FileReader(floc+"\\"+s1));
          PrintWriter pw = new PrintWriter(floc+"\\"+"output\\PhList.txt");
          Pattern p1 = Pattern.compile("(0|91)?[7-9][0-9]{9}");
          String s2 = br.readLine();
          while (s2 != null)
          {
             Matcher m1=p1.matcher(s2);
             while (m1.find())
             {
              pw.println(m1.group());
             }
              s2=br.readLine();
          }
        pw.flush();
        pw.close();
        br.close();
          
          }
        }
    }    
}
