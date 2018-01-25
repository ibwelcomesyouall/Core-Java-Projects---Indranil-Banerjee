
//Date     : 22nd Aug 2016.
//Question : Write a program to read a number and display first N natural number.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P30 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number(Value of N):");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        System.out.println("The first "+num+" natural number is as below:");
        for (int i=1;i<=num;i++)
        System.out.println(i);
    }
}

/*Output: run:
Please enter a number(Value of N):
11
The first 11 natural number is as below:
1
2
3
4
5
6
7
8
9
10
11
BUILD SUCCESSFUL (total time: 3 seconds)
*/

