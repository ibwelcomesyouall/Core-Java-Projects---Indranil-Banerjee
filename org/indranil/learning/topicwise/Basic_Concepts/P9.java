
//Date     : 22nd Aug 2016.
//Question : Write a program to read two numbers and display sum without using + Operator.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P9 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers::");
        System.out.println("Please enter first number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i= Integer.parseInt(br.readLine());
        System.out.println("Please enter second number:");
        int j= Integer.parseInt(br.readLine());
        System.out.println("The value first number is:"+i+ " and the Second number is:"+j);
        System.out.println("The  sum of "+i+ " and "+j+" = "+ add(i,j));
    }
    public static int add(int a, int b){
        if(b == 0) return a;
        int sum = a ^ b; //SUM of two integer is A XOR B
        int carry = (a & b) << 1;  //CARRY of two integer is A AND B
        return add(sum, carry);
    }
}

/*Output: run:
Please enter two numbers::
Please enter first number:
45
Please enter second number:
34
The value first number is:45 and the Second number is:34
The  sum of 45 and 34 = 79
BUILD SUCCESSFUL (total time: 4 seconds)
*/
