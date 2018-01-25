
//Date     : 22nd Aug 2016.
//Question : Write a program to read a number and display whether the number is positive or negative.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P11 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i= Integer.parseInt(br.readLine());
        if(i<0)
        System.out.println("The number supplied is NEGATIVE");
        else
        System.out.println("The number supplied is POSITIVE");
    }
}

/*Output: run:
Please enter a number:
3
The number supplied is POSITIVE
BUILD SUCCESSFUL (total time: 6 seconds)
                or
Please enter a number:
-5
The number supplied is NEGATIVE
BUILD SUCCESSFUL (total time: 5 seconds)
*/
