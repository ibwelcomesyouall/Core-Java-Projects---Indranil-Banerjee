
//Date     : 22nd Aug 2016.
//Question : Write a program to read a String value from User and display it.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a String:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());
    }    
}

/*Output: run:
Please enter a String:
Hello!! My name is Indranil.
Hello!! My name is Indranil.
BUILD SUCCESSFUL (total time: 10 seconds)
*/
