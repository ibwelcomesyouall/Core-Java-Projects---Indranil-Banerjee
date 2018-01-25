
//Date     : 3rd May 2017.
/*Question : Write a program to read a decimal number and convert it to binary number without using any built in method.
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P69 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N=br.readLine();
        int n=Integer.parseInt(N);
        int n1=n;
        long n2=0;
        int i=0;
        long power=1;
        do
        {
            for(int j=0;j<i;j++)
            {
                power = power*10;
            }
            n2=n2+(n1%2*power);
            n1=n1/2;
            i++;
            power=1;
        }
        while(n1!=0);
        System.out.println(n2);
    }
}
/*Output: run:
Please enter a value
3456
110110000000
BUILD SUCCESSFUL (total time: 3 seconds)
*/

