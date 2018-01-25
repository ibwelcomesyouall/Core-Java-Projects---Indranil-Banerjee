
//Date     : 22nd Aug 2016.
//Question : Write a program to read two numbers and display sum.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P8 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers::");
        System.out.println("Please enter first number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i= Integer.parseInt(br.readLine());
        System.out.println("Please enter second number:");
        int j= Integer.parseInt(br.readLine());
        System.out.println("The value first number is:"+i+ "and the Second number is:"+j);
        System.out.println("The  sum of "+i+ "and "+j+"="+(i+j));
    }
}

/*Output: run:
Please enter two numbers::
Please enter first number:
2
Please enter second number:
4
The value first number is:2and the Second number is:4
The  sum of 2and 4=6
BUILD SUCCESSFUL (total time: 9 seconds)
*/
