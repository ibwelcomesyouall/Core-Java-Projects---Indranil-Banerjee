
//Date     : 28th Aug 2016.
//Question : Write a program to read a number and display the sum of eve digits and sum of odd digits.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P48 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int evensum=0,j,k,oddsum=0;
        do{
        j=N/10;
        k=N%10;
        N=N/10;
        if(k%2==0)
            evensum=evensum+k;
        else
            oddsum=oddsum+k;
        }
        while (j!=0);
        System.out.println(" The sum of its even digits is: "+evensum);
        System.out.println(" The sum of its odd digits is: "+oddsum);
    }
}
/*Output: run:
Please enter a number:
345836
 The sum of its even digits is: 18
 The sum of its odd digits is: 11
BUILD SUCCESSFUL (total time: 3 seconds)
*/

