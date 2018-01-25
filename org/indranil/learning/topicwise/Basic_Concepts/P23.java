
//Date     : 22nd Aug 2016.
/*Question : Write a program to read three subjects marks of a student perform the following:
**         a) Display the total marks scored.
**         b) Display the average of marks.
**         c) Display the Grade and Remarks as per the following criteria.
**         Marks            Grade           Remarks
           >=80             A               Excellent
           >=70             B               Very Good
           >=60             C               Good
           >=50             D               Satisfactory
           <50              E               Failure, Try Again!!! */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P23 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter three subjects marks::");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int marks1=Integer.parseInt(br.readLine());
        int marks2=Integer.parseInt(br.readLine());
        int marks3=Integer.parseInt(br.readLine());
        System.out.println("The Total Marks Scored: "+(marks1+marks2+marks3));
        System.out.println("Your Average is: "+((marks1+marks2+marks3)/3));
        if (((marks1+marks2+marks3)/3)>=80)
            System.out.println("Your Grade is A and Remarks is Excellent");
        else if ((((marks1+marks2+marks3)/3)>=70) && (((marks1+marks2+marks3)/3)<80))
            System.out.println("Your Grade is B and Remarks is Very Good");
        else if ((((marks1+marks2+marks3)/3)>=60) && (((marks1+marks2+marks3)/3)<70))
            System.out.println("Your Grade is C and Remarks is Good");
        else if ((((marks1+marks2+marks3)/3)>=50) && (((marks1+marks2+marks3)/3)<60))
            System.out.println("Your Grade is D and Remarks is Satisfactory");
        else
           System.out.println("Your Grade is E and Remarks is Failure, Try Again!!!"); 
    }
}

/*Output: Please enter three subjects marks::
70
50
80
The Total Marks Scored: 200
Your Average is: 66
Your Grade is C and Remarks is Good
BUILD SUCCESSFUL (total time: 6 seconds)
              or
Please enter three subjects marks::
90
90
80
The Total Marks Scored: 260
Your Average is: 86
Your Grade is A and Remarks is Excellent
BUILD SUCCESSFUL (total time: 8 seconds)
               or
Please enter three subjects marks::
10
30
20
The Total Marks Scored: 60
Your Average is: 20
Your Grade is E and Remarks is Failure, Try Again!!!
BUILD SUCCESSFUL (total time: 6 seconds)
*/

