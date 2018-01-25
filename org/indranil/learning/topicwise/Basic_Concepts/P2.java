
//Date     : 22nd Aug 2016.
//Question : Write a program to read int value from User and display it.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter integer value:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(br.readLine()));
    }    
}

/*Output: run:
Please enter integer value:
2
2
BUILD SUCCESSFUL (total time: 3 seconds)
*/
