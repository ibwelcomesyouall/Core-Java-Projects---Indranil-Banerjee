
//Date     : 28th Aug 2016.
//Question : Write a program to read a number and display sum of its individual digit.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P47 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int sum=0,j,k;
        do{
        j=N/10;
        k=N%10;
        N=N/10;
        sum=sum+k;
        }
        while (j!=0);
        System.out.println(" The sum of its digits is: "+sum);
    }
}
/*Output: run:
Please enter a number:
451
 The sum of its digits is: 10
BUILD SUCCESSFUL (total time: 2 seconds)
*/

