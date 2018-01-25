
//Date     : 22nd Aug 2016.
//Question : Write a program to read a number and display whether the number is even or odd.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P13 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i= Integer.parseInt(br.readLine());
        if (i%2==0)
        System.out.println("The number supplied is an even number");
        else
            System.out.println("The number supplied is a odd number");
    }
}

/*Output: run:
Please enter a number:
3
The number supplied is a odd number
BUILD SUCCESSFUL (total time: 3 seconds)
                or
Please enter a number:
6
The number supplied is an even number
BUILD SUCCESSFUL (total time: 3 seconds)
*/
