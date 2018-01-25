
//Date     : 28th Aug 2016.
//Question : Write a program to read a number and display its reverse.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
public class P50 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()),count=0,d;
        int N1=N;
        do{
            N=N/10;
            count++;
        }while(N!=0);
        for(int i=count;i>0;i--)
        {
            d=N1%10;
            N=N+(d*(int)(pow(10,(i-1))));
            N1=N1/10;
        }      
        System.out.println("Reverse of the digit supplied is: "+N);
    }
}
/*Output: run:
Please enter a number:
76354
Reverse of the digit supplied is: 45367
BUILD SUCCESSFUL (total time: 2 seconds)
*/

