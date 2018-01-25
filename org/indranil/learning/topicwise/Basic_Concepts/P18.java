
//Date     : 22nd Aug 2016.
//Question : Write a program to read a char and display whether it is digit or not.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P18 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a character value::");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input_char=(char)br.read();
        int input_int=(int)input_char; 
        if((input_int>47) && (input_int<=57))
        System.out.println("The supplied char is a digit");
        else
        System.out.println("The supplies char is not a digit");
    }
}
// Note: The ASCII of digits is 48 to 57. i.e. ASCII of 0 is 48 and ASCII of 9 is 57.

/*Output: run:
Please enter a character value::
5
The supplied char is a digit
BUILD SUCCESSFUL (total time: 1 second)
              or
Please enter a character value::
d
The supplies char is not a digit
BUILD SUCCESSFUL (total time: 4 seconds)
*/
