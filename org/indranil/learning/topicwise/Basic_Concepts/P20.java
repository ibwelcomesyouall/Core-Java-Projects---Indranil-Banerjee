
//Date     : 22nd Aug 2016.
//Question : Write a program to read a char and display whether it is lowercase alphabet or not.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P20 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a character value::");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input_char=(char)br.read();
        int input_int=(int)input_char; 
        if((input_int>96) && (input_int<=122))
        System.out.println("The supplied char is a lowercase alphabet");
        else
        System.out.println("The supplies char is not a lowercase alphabet");
    }
}
// Note: The ASCII of lowercase alphabet is 97 to 122. i.e. ASCII of a is 97 and ASCII of z is 122.

/*Output: run:
Please enter a character value::
R
The supplies char is not a lowercase alphabet
BUILD SUCCESSFUL (total time: 3 seconds)
              or
Please enter a character value::
g
The supplied char is a lowercase alphabet
BUILD SUCCESSFUL (total time: 2 seconds)
*/

