
//Date     : 28th Aug 2016.
//Question : Write a program to read value of N and display the Fibonacci series with N numbers.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P43 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int j=0,k=1,l=0;
        System.out.println(" The Fibonacci series with "+N+" numbers are as below");
        System.out.println(l);
        for (int i=0;i<N-1;i++)
        {
            l=j+k;
            k=j;
            j=l;
            System.out.println(l);
        }
    }
}
/*Output: run:
Please enter a number:
8
 The Fibonacci series with 8 numbers are as below
0
1
1
2
3
5
8
13
BUILD SUCCESSFUL (total time: 4 seconds)
*/

