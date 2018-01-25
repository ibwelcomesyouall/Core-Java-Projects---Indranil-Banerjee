
//Date     : 22nd Aug 2016.
//Question : Write a program to read a char and display whether it is uppercase alphabet or not.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P19 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a character value::");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input_char=(char)br.read();
        int input_int=(int)input_char; 
        if((input_int>64) && (input_int<=90))
        System.out.println("The supplied char is an uppercase alphabet");
        else
        System.out.println("The supplies char is not an uppercase alphabet");
    }
}
// Note: The ASCII of uppercase alphabet is 65 to 132. i.e. ASCII of A is 65 and ASCII of Z is 90.

/*Output: run:
Please enter a character value::
Z
The supplied char is an uppercase alphabet
BUILD SUCCESSFUL (total time: 2 seconds)
              or
Please enter a character value::
r
The supplies char is not an uppercase alphabet
BUILD SUCCESSFUL (total time: 3 seconds)
*/
