
//Date     : 3rd Sept 2016.
/*Question : Write a program to read a decimal number and convert it to hexadecimal number without using any built in method.
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P71 {
    public static void main(String[] args) throws IOException {
        int n;
        System.out.println("Please enter a value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N=br.readLine();
        //n=(int)N;
        //System.out.println(n);
    }
}
/*Output: run:
Please enter a value
6
2	3	4	5	6	
4	6	8	10	12	
6	9	12	15	18	
8	12	16	20	24	
10	15	20	25	30	
12	18	24	30	36	
14	21	28	35	42	
16	24	32	40	48	
18	27	36	45	54	
20	30	40	50	60	
BUILD SUCCESSFUL (total time: 1 second)
*/

