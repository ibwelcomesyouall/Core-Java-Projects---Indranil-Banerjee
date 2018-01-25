
//Date     : 22nd Aug 2016.
//Question : Write a program to read age of a person and display whether he/she is eligible for voting or not.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P12 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter your age:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i= Integer.parseInt(br.readLine());
        if (i<0)
        System.out.println("Please enter correct age");
        else if(i<18)
            System.out.println("You are not eligible for voting");
        else
            System.out.println("You are eligible for voting");
    }
}

/*Output: run:
Please enter your age:
26
You are eligible for voting
BUILD SUCCESSFUL (total time: 3 seconds)
                or
Please enter your age:
12
You are not eligible for voting
BUILD SUCCESSFUL (total time: 4 seconds)
                or
Please enter your age:
-2
Please enter correct age
BUILD SUCCESSFUL (total time: 3 seconds)
*/
