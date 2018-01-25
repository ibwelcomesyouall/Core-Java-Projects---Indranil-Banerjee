
//Date     : 28th Aug 2016.
//Question : Write a program to read a number and display whether it is Palindrome or not.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
public class P51 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()),count=0,d,rn=0;
        int N1=N;
        do{
            N=N/10;
            count++;
        }while(N!=0);
        N=N1;
        for(int i=count;i>0;i--)
        {
            d=N1%10;
            rn=rn+(d*(int)(pow(10,(i-1))));
            N1=N1/10;
        }      
        if(N==rn)
            System.out.println("The number supplied is a palindrome number");
        else
            System.out.println("The number supplied is not a palindrome number");
    }
}
/*Output: run:
Please enter a number:
123
The number supplied is not a palindrome number
BUILD SUCCESSFUL (total time: 2 seconds)
                or
Please enter a number:
12321
The number supplied is a palindrome number
BUILD SUCCESSFUL (total time: 3 seconds)

*/

