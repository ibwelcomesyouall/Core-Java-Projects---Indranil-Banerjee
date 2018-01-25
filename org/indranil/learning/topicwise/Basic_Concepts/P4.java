
//Date     : 22nd Aug 2016.
//Question : Write a program to read one char value from user and display it.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter one char value:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println((char)br.read());
        }  
    }

/*Output: run:
Please enter one char value:
r
r
BUILD SUCCESSFUL (total time: 3 seconds)
*/
