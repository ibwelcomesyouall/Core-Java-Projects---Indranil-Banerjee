
//Date     : 28th Aug 2016.
//Question : Write a program to read a number and display the sum of cubes of individual digits.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P49 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int sum=0,j,k;
        do{
        j=N/10;
        k=N%10;
        N=N/10;
        sum = sum +(k*k*k);
        }
        while (j!=0);
        System.out.println(" Sum of the cube of digits : "+sum);
    }
}
/*Output: run:
Please enter a number:
67
 Sum of the cube of digits : 559
BUILD SUCCESSFUL (total time: 3 seconds)
*/

