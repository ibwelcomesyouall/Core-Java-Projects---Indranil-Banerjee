
//Date     : 3rd Sept 2016.
/*Question : Write a program to display the following pattern.
                1
                01
                101
                0101    
                10101
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
public class P59 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        if(i%2==0 && j%2!=0)
                        {
                          System.out.print("0");
                        }
                        else if(i%2==0 && j%2==0)
                        {
                          System.out.print("1");
                        }
                        else if(i%2!=0 && j%2!=0)
                        {
                          System.out.print("1");
                        }
                        else if(i%2!=0 && j%2==0)
                        {
                          System.out.print("0");
                        }
                    }
                    System.out.println();
                }     
    }
}
/*run:
1
01
101
0101
10101
BUILD SUCCESSFUL (total time: 1 second)
*/

