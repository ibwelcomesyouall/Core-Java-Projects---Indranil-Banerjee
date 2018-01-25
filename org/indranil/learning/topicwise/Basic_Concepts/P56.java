
//Date     : 28th Aug 2016.
/*Question : Write a program to display the following pattern.
             *****
             ****
             ***
             **
             *    */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
public class P56 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=6-i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
    }
}
/*Output: run:
*****
****
***
**
*
BUILD SUCCESSFUL (total time: 1 second)
*/

