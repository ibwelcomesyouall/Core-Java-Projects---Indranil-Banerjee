
//Date     : 22nd Aug 2016.
//Question : Write a program to read a number and display sum of first N natural number.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P31 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number(Value of N):");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int sum=0;
        for (int i=1;i<=num;i++)
        sum=sum+i;
        System.out.println("The sum of first "+num+" natural number is:"+sum);
    }
}

/*Output: run:
Please enter a number(Value of N):
56
The sum of first 56 natural number is:1596
BUILD SUCCESSFUL (total time: 4 seconds)
*/

