
//Date     : 22nd Aug 2016.
//Question : Write a program to read two numbers and display the maximum.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P14 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers::");
        System.out.println("Please enter first number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i= Integer.parseInt(br.readLine());
        System.out.println("Please enter second number:");
        int j= Integer.parseInt(br.readLine());
        int max;
        if(i>=j)
            max=i;
        else
        max=j;
        
        System.out.println("The Maximum number is:"+max);
    }
}

/*Output: run:
Please enter two numbers::
Please enter first number:
3
Please enter second number:
5
The Maximum number is:5
BUILD SUCCESSFUL (total time: 5 seconds)
              or
Please enter two numbers::
Please enter first number:
5
Please enter second number:
5
The Maximum number is:5
BUILD SUCCESSFUL (total time: 9 seconds)
*/
