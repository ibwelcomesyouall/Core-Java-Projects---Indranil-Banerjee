
//Date     : 22nd Aug 2016.
//Question : Write a program to read three numbers and display the maximum.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P16 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers::");
        System.out.println("Please enter first number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max=0;
        int i= Integer.parseInt(br.readLine());
        System.out.println("Please enter second number:");
        int j= Integer.parseInt(br.readLine());
         System.out.println("Please enter third number:");
        int k= Integer.parseInt(br.readLine());
        if(((i>=j)&&(i>=k)))
            max=i;
        else if ((j>=i)&&(j>=k))
            max=j;
        else if ((k>=i)&&(k>=i))
            max=k;      
        System.out.println("The Maximum number is:"+max);
    }
}

/*Output: run:
Please enter two numbers::
Please enter first number:
3
Please enter second number:
4
Please enter third number:
3
The Maximum number is:4
BUILD SUCCESSFUL (total time: 5 seconds)
              or
Please enter two numbers::
Please enter first number:
3
Please enter second number:
3
Please enter third number:
5
The Maximum number is:5
BUILD SUCCESSFUL (total time: 4 seconds)
            or
Please enter two numbers::
Please enter first number:
7
Please enter second number:
7
Please enter third number:
7
The Maximum number is:7
BUILD SUCCESSFUL (total time: 5 seconds)
*/
