
//Date     : 22nd Aug 2016.
//Question : Write a program to read a number and display whether it is Perfect Number or not.
//In number theory, a perfect number is a positive integer that is equal to the sum of its proper positive divisors, 
//that is, the sum of its positive divisors excluding the number itself (also known as its aliquot sum). 
//Equivalently, a perfect number is a number that is half the sum of all of its positive divisors 
//(including itself) i.e. σ1(n) = 2n.
//The first perfect number is 6, because 1, 2, and 3 are its proper positive divisors, and 1 + 2 + 3 = 6. 
//Equivalently, the number 6 is equal to half the sum of all its positive divisors: ( 1 + 2 + 3 + 6 ) / 2 = 6. The 
//next perfect number is 28 = 1 + 2 + 4 + 7 + 14. This is followed by the perfect numbers 496 and 8128
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P41 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int sum=0;
        for (int i=1;i<num;i++)
        {
            if(num%i==0)
            {
               sum=sum+i;
            }
        }
        if(num==sum)
            System.out.println("The number supplied is a perfect number");
        else
            System.out.println("The number supplied is not a perfect number");
        
    }
}
/*Output: run:
Please enter a number:
8128
The number supplied is a perfect number
BUILD SUCCESSFUL (total time: 3 seconds)
*/

