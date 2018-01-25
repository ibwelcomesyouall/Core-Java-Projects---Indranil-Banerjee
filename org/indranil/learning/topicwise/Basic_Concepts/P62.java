
//Date     : 3rd Sept 2016.
/*Question : Write a program to display the following pattern.
                *
               * *
              *   *
               * *
                *
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
public class P62 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++)
        {
            for(int k=1;k<=3-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                if(j==1 || j==2*i-1)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.println();
        }
         for(int i=1;i<=2;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=5-2*i;j++)
            {
                if(j==1 || j==5-2*i)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
/*Output: run:
  *
 * *
*   *
 * *
  *
BUILD SUCCESSFUL (total time: 1 second)
*/

