
//Date     : 22nd Aug 2016.
/*Question : Write a program to read a char and check the following:
**         a) Upper Case Alphabet.
**         b) Lower Case Alphabet.
**         c) Digit.
**         d) Special Character. */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P22 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a character value::");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input_char=(char)br.read();
        int input_int=(int)input_char;
        if((input_int>47) && (input_int<=57))
            System.out.println("The supplied char is a digit");
                else if ((input_int>64) && (input_int<=90))
                    System.out.println("The supplied char is an uppercase character");
                        else if((input_int>96) && (input_int<=122))
                            System.out.println("The supplied char is a lowercase character");
        else
        System.out.println("The supplied char is a special symbol");
    }
}
// Note: The ASCII of lowercase alphabet is 97 to 122. i.e. ASCII of a is 97 and ASCII of z is 122.
// Note: The ASCII of uppercase alphabet is 65 to 90. i.e. ASCII of A is 65 and ASCII of Z is 90.
// Note: The ASCII of digits is 48 to 57. i.e. ASCII of 0 is 48 and ASCII of 9 is 57.

/*Output: run:
Please enter a character value::
A
The supplied char is an uppercase character
BUILD SUCCESSFUL (total time: 4 seconds)
              or
Please enter a character value::
g
The supplied char is a lowercase character
BUILD SUCCESSFUL (total time: 2 seconds)
               or
Please enter a character value::
3
The supplied char is a digit
BUILD SUCCESSFUL (total time: 5 seconds)
                or
Please enter a character value::
%
The supplied char is a special symbol
BUILD SUCCESSFUL (total time: 4 seconds)
*/

