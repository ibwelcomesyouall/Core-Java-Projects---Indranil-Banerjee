
//Date     : 22nd Aug 2016.
//Question : Write a program to read a char and display whether it is vowel or consonant.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P27 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter an alphabet::");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input_char=(char)br.read();
        if((input_char =='a')||(input_char =='e')||(input_char =='i')||(input_char =='o')||(input_char =='u')||(input_char =='A')||(input_char =='E')||(input_char =='I')||(input_char =='O')||(input_char =='U'))
        System.out.println("You have supplied a vowel");
        else
            System.out.println("You have supplied a consonent");
    }
}

/*Output: run:
Please enter an alphabet::
U
You have supplied a vowel
BUILD SUCCESSFUL (total time: 2 seconds)
                or
Please enter an alphabet::
c
You have supplied a consonent
BUILD SUCCESSFUL (total time: 2 seconds)
*/

