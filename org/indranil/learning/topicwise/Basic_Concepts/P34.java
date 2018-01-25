
//Date     : 22nd Aug 2016.
//Question : Write a program to read a number and display whether it is power of two or not.
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P34 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int num1=num;
        int i=0,x;
        do
        {
          num=num/2;
          x=num1%2;
          num1=num;
          if(x!=0)
          {
              i=1;
              break;
          }
        }while(num!=1);  
        if(i==1)
            System.out.println("The number suppiled is not a power of 2");
        else
            System.out.println("The number suppiled is a power of 2");              
    }
}

/*Output: run:
Please enter a number:
1024
The number suppiled is a power of 2
BUILD SUCCESSFUL (total time: 5 seconds)
                or
Please enter a number:
6754
The number suppiled is not a power of 2
BUILD SUCCESSFUL (total time: 3 seconds)

*/

