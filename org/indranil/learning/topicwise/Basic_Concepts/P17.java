
//Date     : 22nd Aug 2016.
//Question : Write a program to read three numbers and display the minimum.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P17 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers::");
        System.out.println("Please enter first number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min=0;
        int i= Integer.parseInt(br.readLine());
        System.out.println("Please enter second number:");
        int j= Integer.parseInt(br.readLine());
         System.out.println("Please enter third number:");
        int k= Integer.parseInt(br.readLine());
        if(((i<=j)&&(i<=k)))
            min=i;
        else if ((j<=i)&&(j<=k))
            min=j;
        else if ((k<=i)&&(k<=i))
            min=k;      
        System.out.println("The Minimum number is:"+min);
    }
}

/*Output: run:
Please enter two numbers::
Please enter first number:
5
Please enter second number:
6
Please enter third number:
3
The Minimum number is:3
BUILD SUCCESSFUL (total time: 3 seconds)
              or
Please enter two numbers::
Please enter first number:
12
Please enter second number:
12
Please enter third number:
12
The Minimum number is:12
BUILD SUCCESSFUL (total time: 3 seconds)
*/
