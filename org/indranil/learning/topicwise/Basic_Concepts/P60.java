
//Date     : 3rd Sept 2016.
/*Question : Write a program to display the following pattern.
                1
                12
                123
                1234    
                12345
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.IOException;
public class P60 {
    public static void main(String[] args) throws IOException {
        for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j);
                    }
                    System.out.println();
                }
    }
}
/*Output: run:
1
12
123
1234
12345
BUILD SUCCESSFUL (total time: 1 second)
*/

