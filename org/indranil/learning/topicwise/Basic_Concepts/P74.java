
//Date     : 3rd Sept 2016.
/*Question : Write a program to read a String ans store it into character array without using any built in method.
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P74 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter five numbers:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        //while()
        //char ch[]=new char[];
        
    }
}
/*Output: run:
Please enter five numbers:
2
3
4
5
2
Occurance of 2:2
Occurance of 3:1
Occurance of 4:1
Occurance of 5:1
Occurance of 2:2
BUILD SUCCESSFUL (total time: 6 seconds)
*/

