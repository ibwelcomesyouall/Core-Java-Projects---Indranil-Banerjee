
//Date     : 28th Aug 2016.
//Question : Write a program to read a number and display number of even and odd digits.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P46 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int evencount=0,j,k,oddcount=0;
        do{
        j=N/10;
        k=N%10;
        N=N/10;
        System.out.println(k);
        if(k%2 ==0)
        evencount++;
        else
            oddcount++;
        }
        while (j!=0);
        System.out.println(" Number of even digits in the supplied number is: "+evencount);
        System.out.println(" Number of odd digits in the supplied number is: "+oddcount);
    }
}
/*Output: run:
Please enter a number:
556677
7
7
6
6
5
5
 Number of even digits in the supplied number is: 2
 Number of odd digits in the supplied number is: 4
BUILD SUCCESSFUL (total time: 3 seconds)
*/

