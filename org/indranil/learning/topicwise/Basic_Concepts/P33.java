
//Date     : 22nd Aug 2016.
/*Question : Write a program to read a number and display each digit of number in words.
                123
                one two three */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P33 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int i,j=0,num1;
        num1=num;
        do
        {
        j++;
        num=num/10;
        }
        while(num!=0);
        num=num1;
        do
        {
            i=num/((int)Math.pow(10d,(j-1)));
            num=num%((int)Math.pow(10d,(j-1)));
            switch(i)
            {
                case 1: System.out.print("One ");
                    break;
                case 2: System.out.print("Two ");
                    break;
                case 3: System.out.print("Three ");
                    break;
                case 4: System.out.print("Four ");
                    break;
                case 5: System.out.print("Five ");
                    break;
                case 6: System.out.print("Six ");
                    break;
                case 7: System.out.print("Seven ");
                    break;
                case 8: System.out.print("Eight ");
                    break;
                case 9: System.out.print("Night ");
                    break;
            }   
            j--;
        }while(num!=0);
    }
}

/*Output: run:
Please enter a number:
83559265
Eight Three Five Five Night Two Six Five BUILD SUCCESSFUL (total time: 3 seconds)
*/

