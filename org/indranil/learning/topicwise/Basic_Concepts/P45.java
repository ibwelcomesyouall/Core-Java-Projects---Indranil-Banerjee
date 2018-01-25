
//Date     : 28th Aug 2016.
//Question : Write a program to read a number and display number of digits avaliable.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P45 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int count=0,j;
        do{
        j=N/10;
        N=N/10;
        count++;
        }
        while (j!=0);
        System.out.println(" Number of digits in the supplied number is: "+count);
    }
}
/*Output: run:
Please enter a number:
45256
 Number of digits in the supplied number is: 5
BUILD SUCCESSFUL (total time: 5 seconds)
*/

