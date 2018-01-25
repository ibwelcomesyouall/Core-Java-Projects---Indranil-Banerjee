
//Date     : 22nd Aug 2016.
//Question : Write a program to read two numbers and display its remainder without using % Operator.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P37 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int divident=Integer.parseInt(br.readLine());
        int divisor=Integer.parseInt(br.readLine());
        int quotient=divident/divisor;
        System.out.println("Remainder:"+(divident-(quotient*divisor)));
    }
}
/*Output: run:
Please enter two numbers:
34
5
Remainder:4
BUILD SUCCESSFUL (total time: 2 seconds)
*/

