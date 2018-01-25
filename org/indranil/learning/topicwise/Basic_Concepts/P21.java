
//Date     : 22nd Aug 2016.
//Question : Write a program to read a char and display whether it is special symbol or not.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P21 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a character value::");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input_char=(char)br.read();
        int input_int=(int)input_char;
        if(!(((input_int>47) && (input_int<=57))||((input_int>64) && (input_int<=90))||((input_int>96) && (input_int<=122))))
        System.out.println("The supplied char is a special symbol");
        else
        System.out.println("The supplies char is not a special symbol");
    }
}
// Note: The ASCII of lowercase alphabet is 97 to 122. i.e. ASCII of a is 97 and ASCII of z is 122.
// Note: The ASCII of uppercase alphabet is 65 to 90. i.e. ASCII of A is 65 and ASCII of Z is 90.
// Note: The ASCII of digits is 48 to 57. i.e. ASCII of 0 is 48 and ASCII of 9 is 57.

/*Output: run:
Please enter a character value::
#
The supplied char is a special symbol
BUILD SUCCESSFUL (total time: 1 second)
              or
Please enter a character value::
4
The supplies char is not a special symbol
BUILD SUCCESSFUL (total time: 2 seconds)
*/

