
//Date     : 22nd Aug 2016.
//Question : Write a program to read a year and display whether it is leap year or not.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P26 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a year::");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if((Integer.parseInt(br.readLine())%4)==0)
        System.out.println("You have entered a Leap Year");
        else
            System.out.println("You have not entered a Leap Year");
    }
}

/*Output: run:
Please enter a year::
2014
You have not entered a Leap Year
BUILD SUCCESSFUL (total time: 3 seconds)
                or
Please enter a year::
2000
You have entered a Leap Year
BUILD SUCCESSFUL (total time: 8 seconds)

*/

