
//Date     : 3rd Sept 2016.
/*Question : Write a program to display the following pattern.
                1
                23
                456
                78910    
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.IOException;
public class P61 {
    public static void main(String[] args) throws IOException {
        int k=1;
        for(int i=1;i<=4;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(k);
                        k++;
                    }
                    System.out.println();
                }
    }
}
/*Output: run:
1
23
456
78910
BUILD SUCCESSFUL (total time: 0 seconds)
*/

