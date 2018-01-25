
//Date     : 22nd Aug 2016.
//Question : Write a program to read two numbers and swap them using bitwise operator.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P7{
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers::");
        System.out.println("Please enter first number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i= Integer.parseInt(br.readLine());
        System.out.println("Please enter second number:");
        int j= Integer.parseInt(br.readLine());
        System.out.println("The value first number is:"+i+ " and the Second number is:"+j);
        i = i ^ j; // XOR operation
        j = i ^ j; // XOR operation
        i = i ^ j; // XOR operation
        System.out.println("Now after swapping");
        System.out.println("The value first number is:"+i+ " and the Second number is:"+j);
    }
}

/*Output: run:
Please enter two numbers::
Please enter first number:
34
Please enter second number:
87
The value first number is:34 and the Second number is:87
Now after swapping
The value first number is:87 and the Second number is:34
BUILD SUCCESSFUL (total time: 6 seconds)
*/
