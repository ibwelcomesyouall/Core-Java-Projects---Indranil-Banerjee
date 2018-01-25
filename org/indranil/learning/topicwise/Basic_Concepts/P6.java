
//Date     : 22nd Aug 2016.
//Question : Write a program to read two numbers and swap them without using third variable.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers::");
        System.out.println("Please enter first number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i= Integer.parseInt(br.readLine());
        System.out.println("Please enter second number:");
        int j= Integer.parseInt(br.readLine());
        System.out.println("The value first number is:"+i+ "and the Second number is:"+j);
        j=i+j;
        i=j-i;
        j=j-i;
        System.out.println("Now after swapping");
        System.out.println("The value first number is:"+i+ "and the Second number is:"+j);
    }
}

/*Output: run:
Please enter two numbers::
Please enter first number:
2
Please enter second number:
7
The value first number is:2and the Second number is:7
Now after swapping
The value first number is:7and the Second number is:2
BUILD SUCCESSFUL (total time: 3 seconds)
*/
