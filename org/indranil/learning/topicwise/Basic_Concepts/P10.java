
//Date     : 22nd Aug 2016.
//Question : Write a program to covert Fahrenheit to Celsius.
//            c=(f-32)*5/9
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P10 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a temparature value in Fahrenheit:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float i= Float.parseFloat(br.readLine());
        System.out.println("The temparture value of "+i+"F is "+" "+(((i-32)*5)/9)+"C.");
    }
}

/*Output: run:
Please enter a temparature value in Fahrenheit:
1
The temparture value of 1.0F is  -17.222221C.
BUILD SUCCESSFUL (total time: 7 seconds)
*/
