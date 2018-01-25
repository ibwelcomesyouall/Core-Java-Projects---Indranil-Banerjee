
//Date     : 22nd Aug 2016.
/*Question : Write a program to read a number and display all the possible permutations.
             123
             123  213  321  132 231  312 */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P38 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int num1=num;
        int count=0,j=0;
        do{
            num=num/10;
            count++;
        }
        while(num!=0); 
        num=num1;
        int[] sequence = new int[count];
        do{
            sequence[j]=num%10;
            num=num/10;
            j++;
        }while(num!=0);
 
        System.out.println("The original sequence is: ");
        for (int i = 0; i < count; i++)
            System.out.print(sequence[i]);
 
        System.out.println("\nThe permuted sequences are: ");
        permute(sequence, 0);
    }
    static void permute(int[] a, int k) 
    {
        if (k == a.length) 
        {
            for (int i = 0; i < a.length; i++) 
            {
                System.out.print(a[i]);
            }
            System.out.print(" ");
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                permute(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
}
/*Output: run:
Please enter a number:
123
The original sequence is: 
321
The permuted sequences are: 
321 312 231 213 123 132 BUILD SUCCESSFUL (total time: 4 seconds)
*/

