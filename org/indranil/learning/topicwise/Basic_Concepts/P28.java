
//Date     : 22nd Aug 2016.
/*Question : Write a program to read a number [0-6] and display corresponding weekday's name.
             1 Sunday
             2 Monday
             ...
             6 Saturday
             >6 Invalid Number */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P28 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number [0-6]::");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());
        switch(input){
                case 1: System.out.println("Sunday");
                break;
                case 2: System.out.println("Monday");
                break;
                case 3: System.out.println("Tuesday");
                break;
                case 4: System.out.println("Wednesday");
                break;
                case 5: System.out.println("Thrusday");
                break;
                case 6: System.out.println("Friday");
                break;
                case 7: System.out.println("Saturday");
                break;
                default: System.out.println("Invalid Number");
        }
    }
}

/*Output: run:
Please enter a number [0-6]::
9
Invalid Number
BUILD SUCCESSFUL (total time: 3 seconds)
                or
Please enter a number [0-6]::
3
Tuesday
BUILD SUCCESSFUL (total time: 2 seconds)
*/

