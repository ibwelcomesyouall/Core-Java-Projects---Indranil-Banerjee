
//Date     : 22nd Aug 2016.
//Question : Write a program to read a number and display its multiplication table.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P35 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        System.out.println("Below is the multiplication table of "+num);
        for (int i=1;i<11;i++)
            System.out.println(num+" * "+i+" = "+(num*i));
    }
}

/*Output: run:
Please enter a number:
13
Below is the multiplication table of 13
13 * 1 = 13
13 * 2 = 26
13 * 3 = 39
13 * 4 = 52
13 * 5 = 65
13 * 6 = 78
13 * 7 = 91
13 * 8 = 104
13 * 9 = 117
13 * 10 = 130
BUILD SUCCESSFUL (total time: 1 second)
*/

