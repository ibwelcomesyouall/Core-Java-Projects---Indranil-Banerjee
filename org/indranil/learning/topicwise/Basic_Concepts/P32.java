//******************* Unable to run this program *************************
//Date     : 22nd Aug 2016.
//Question : Write a program to find sum of given Command Line Arguments.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.IOException;
public class P32 {
    public static void main(String[] args) throws IOException {
        int sum=0;
        for (int i=0;i<args.length;i++)
        sum=sum+Integer.parseInt(args[i]);
        System.out.println("The sum of the arguments is:"+sum);
    }
}

/*Output: run:
Please enter a number(Value of N):
56
The sum of first 56 natural number is:1596
BUILD SUCCESSFUL (total time: 4 seconds)
*/

