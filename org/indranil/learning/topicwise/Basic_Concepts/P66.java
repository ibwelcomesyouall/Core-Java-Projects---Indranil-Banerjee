
//Date     : 3rd Sept 2016.
/*Question : Write a program to print the table from 2 to N in following format:
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P66 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N=br.readLine();
        int n=Integer.parseInt(N);
        for (int i=2;i<=n;i++)
        {
            for (int j=1;j<=10;j++)
            {
                System.out.print(i*j);
                System.out.print('\t');                
            }
            System.out.println();
        }      
    }
}
/*Output: run:
Please enter a value
6
2	4	6	8	10	12	14	16	18	20	
3	6	9	12	15	18	21	24	27	30	
4	8	12	16	20	24	28	32	36	40	
5	10	15	20	25	30	35	40	45	50	
6	12	18	24	30	36	42	48	54	60	
BUILD SUCCESSFUL (total time: 2 seconds)
*/

