
//Date     : 22nd Aug 2016.
//Question : Write a program to read a number and display whether it is Prime Number or not.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P40 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int checkbit=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                checkbit=1;
                break;
            }
        }
        if(checkbit==0)
            System.out.println("The number supplied is a prime number.");
        else
            System.out.println("The number supplies is not a prime number");
    }
}
/*Output: run:
Please enter a number:
2
The number supplied is a prime number.
BUILD SUCCESSFUL (total time: 2 seconds)
                or
run:
Please enter a number:
112
The number supplies is not a prime number
BUILD SUCCESSFUL (total time: 2 seconds)
*/

