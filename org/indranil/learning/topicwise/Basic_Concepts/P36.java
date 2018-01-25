
//Date     : 22nd Aug 2016.
//Question : Write a program to read two numbers and display its quotient without using / Operator.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P36 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1=Integer.parseInt(br.readLine());
        int num2=Integer.parseInt(br.readLine());
        System.out.print("The Quotient of "+num1+" and "+num2+" = ");
        divide(num1,num2);
    }
        public static void divide(int N, int D) {
        int result = 0;

        if (D == 0) {
            System.out.println("Cannot divide by 0");
        }
        else if (N == 0) {
            System.out.println(0);
        }
        else if (N == D) {
            System.out.println(1);
        }
        else if (N > 0 && D > 0 && N < D) {
            System.out.println(0);
        }
        else {
            // both negative
            if (N < 0 && D < 0) {
                while (N <= D) {
                    N += -1 * D;
                    result++;
                }
                System.out.println(result);
            }
            // either N or D negative
            else if (N < 0 || D < 0) {
                if (N < 0) {
                    N = -1 * N;
                }
                else {
                    D = -1 * D;
                }
                while (N >= D) {
                    N -= D;
                    result--;
                }
                System.out.println(result);
            }
            // both positive
            else {
                while (N >= D) {
                    N -= D;
                    result++;
                }
                System.out.println(result);
            }
        }
    }
}

/*Output: run:
Please enter two numbers:
22
11
The Quotient of 22 and 11 = 2
BUILD SUCCESSFUL (total time: 6 seconds)
*/

