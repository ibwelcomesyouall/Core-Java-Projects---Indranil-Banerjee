
//Date     : 3rd Sept 2016.
/*Question : Write a Java program to read a number and display in word.
                23456
                Twenty Three Thousand Four Hundred Fifty Six.
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P98 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int number =Integer.parseInt(br.readLine());
        do{
        int number1=number%10;
        number=number/10;
        }
       while(number==0);
        
        
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

