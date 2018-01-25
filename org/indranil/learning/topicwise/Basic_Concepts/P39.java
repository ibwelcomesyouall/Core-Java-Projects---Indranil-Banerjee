
//Date     : 22nd Aug 2016.
//Question : Write a program to read a number and display its factorial.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P39 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int num1=num;
        int fact=1;
        if(num==0 || num==1)
            fact=1;
        else
        {
            do{
              fact=fact*num;
              num=num-1;
            }while(num!=1);
        }
        System.out.println("The Factorial of "+num1+" is: "+fact);
    }
}
/*Output: run:
Please enter a number:
7
The Factorial of 7 is: 5040
BUILD SUCCESSFUL (total time: 1 second)
*/

