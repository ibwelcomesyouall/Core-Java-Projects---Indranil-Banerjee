
//Date     : 22nd Aug 2016.
//Question : Write a program to read two numbers and display all the Prime numbers in the given range.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P42 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter two numbers:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int num1=Integer.parseInt(br.readLine());
        int i,checkbit=0;
        if(num>num1)
        {
            i=num;
            num=num1;
            num1=i;
        }   
        num1++;
        System.out.print("The prime numbers between "+num+"and"+(num1-1)+" are:");
            do{
                for(int k=2;k<num;k++)
                {
                    if(num%k==0)
                    {
                        checkbit=1;
                        break;
                    }
                }
                if(checkbit==0){
                        System.out.print(num+ " ");}
                    num++;
                    checkbit=0;
            }while(num!=num1);
    }
}
/*Output: run:
Please enter two numbers:
2
5
The prime numbers between 2and5 are:2 3 5 BUILD SUCCESSFUL (total time: 3 seconds)
                or
run:
Please enter two numbers:
3
87
The prime numbers between 3and87 are:3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 BUILD SUCCESSFUL (total time: 5 seconds)
*/

