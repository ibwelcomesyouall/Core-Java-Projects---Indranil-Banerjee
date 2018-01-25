
//Date     : 28th Aug 2016.
//Question : Write a program to display Nth Fibonacci number.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P44 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int j=0,k=1,l=0;
        System.out.println(" The "+N+"th Fibonacci number is");
        if(N==1)
        {
          System.out.println(l);  
        }
        else
        {
        for (int i=0;i<N-1;i++)
        {
            l=j+k;
            k=j;
            j=l;
        }
        System.out.println(l);
        }
    }
}
/*Output: run:
Please enter a number:
5
 The 5th Fibonacci number is
3
BUILD SUCCESSFUL (total time: 3 seconds)
*/

