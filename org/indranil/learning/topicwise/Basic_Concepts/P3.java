
//Date     : 22nd Aug 2016.
//Question : Write a program to read a String value from user and display its individual characters.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a String value:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        char ch[] = new char[str.length()];
        ch = str.toCharArray();
        for (int j=0;j<ch.length;j++)
        {
            System.out.println("Character "+j+"="+ch[j]);
        }  
    }
}

/*Output: run:
Please enter a String value:
Indranil Banerjee
Character 0=I
Character 1=n
Character 2=d
Character 3=r
Character 4=a
Character 5=n
Character 6=i
Character 7=l
Character 8= 
Character 9=B
Character 10=a
Character 11=n
Character 12=e
Character 13=r
Character 14=j
Character 15=e
Character 16=e
BUILD SUCCESSFUL (total time: 5 seconds)
*/
