
//Date     : 28th Aug 2016.
//Question : Write a program to read a number and display whether it is Armstrong or not.
//An Armstrong number is an integer such that the sum of the cubes of its digits is equal to the number itself. 
//For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
public class P52 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()),N1=0,N2;
        N2=N;
        do{
            N1=N1+(int)pow((N%10),3);
            N=N/10;
        }while(N!=0);
        if(N2==N1)
            System.out.println("The number is an armstrong number");
        else
            System.out.println("The number is not an armstrong number");
    }
}
/*Output: run:
Please enter a number:
371
The number is an armstrong number
BUILD SUCCESSFUL (total time: 3 seconds)
*/

