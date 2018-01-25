
//Date     : 22nd Aug 2016.
//Question : Write a program to read two numbers and display the minimum.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P15 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers::");
        System.out.println("Please enter first number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i= Integer.parseInt(br.readLine());
        System.out.println("Please enter second number:");
        int j= Integer.parseInt(br.readLine());
        int min;
        if(i<=j)
            min=i;
        else
        min=j;
        System.out.println("The Minimum number is:"+min);
    }
}

/*Output: run:
Please enter two numbers::
Please enter first number:
9
Please enter second number:
23
The Minimum number is:9
BUILD SUCCESSFUL (total time: 3 seconds)
                or
Please enter two numbers::
Please enter first number:
3
Please enter second number:
3
The Minimum number is:3
BUILD SUCCESSFUL (total time: 3 seconds)
*/
