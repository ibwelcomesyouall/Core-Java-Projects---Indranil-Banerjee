
//Date     : 22nd Aug 2016.
//Question : Write a program to read month and year and display the number of days for that month.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P29 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a month (1 for January ... 12 for December etc) and year");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month=Integer.parseInt(br.readLine());
        int year=Integer.parseInt(br.readLine());
        int day;
        if ((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month == 10)||(month == 12))
            day = 31;
        else if((month==2))
        {
         if (year%4==0)
             day=29;
         else
             day=28;
        }
        else
            day = 30;
        System.out.println("Number of days in that month is: "+day);
    }
}

/*Output: run:
Please enter a month (1 for January ... 12 for December etc) and year
1
2011
Number of days in that month is: 31
BUILD SUCCESSFUL (total time: 16 seconds)
                or
Please enter a month (1 for January ... 12 for December etc) and year
2
2016
Number of days in that month is: 29
BUILD SUCCESSFUL (total time: 5 seconds)
*/

