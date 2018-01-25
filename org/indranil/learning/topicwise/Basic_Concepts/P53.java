
//Date     : 28th Aug 2016.
//Question : Write a program to read two numbers and display all the Armstrong numbers between given two numbers.
/*An Armstrong number is a number such that the sum of its digits raised to the third power is equal to the number itself.  
For example, 371 is an Armstrong number, since 3**3 + 7**3 + 1**3 = 371.*/
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
public class P53 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int N1=Integer.parseInt(br.readLine());
        int N2,N3=0;
        System.out.println("Armstrong numbers between "+N+"and "+N1+" are:");
        for(int i=N;i<N1;i++)
        {
        checkArmStrongNumber(i);
        }
    }

    private static void checkArmStrongNumber(int i) {
        int N2=i;
        int N1=0;
        do{
            N1=N1+(int)pow((i%10),3);
            i=i/10;
        }while(i!=0);
        if(N2==N1)
            System.out.println(N2);
    }
}
/*Output: run:
Please enter two number:
1
1000
Armstrong numbers between 1and 1000 are:
1
153
370
371
407
BUILD SUCCESSFUL (total time: 4 seconds)
*/

