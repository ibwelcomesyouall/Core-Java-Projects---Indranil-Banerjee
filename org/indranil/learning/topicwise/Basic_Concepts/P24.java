
//Date     : 22nd Aug 2016.
//Question : Write a program to read a char and display its upper case character.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P24 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a char value::");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The uppercase character of the supplied character is: "+br.readLine().toUpperCase());
    }
}

/*Output: run:
Please enter a char value::
a
The uppercase character of the supplied character is: A
BUILD SUCCESSFUL (total time: 2 seconds)
*/

