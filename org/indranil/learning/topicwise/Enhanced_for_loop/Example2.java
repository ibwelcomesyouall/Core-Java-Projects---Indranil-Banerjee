package org.indranil.learning.topicwise.Enhanced_for_loop;

public class Example2 {
    public static void main(String[]args)
    {
        int [][]x = {{10,20,30},{40,50}};
        for(int[] x1:x)
        {
            for(int x2:x1)
            {
                System.out.println(x2);
            }
        }
    }  
}
/*run:
10
20
30
40
50
BUILD SUCCESSFUL (total time: 0 seconds)
*/
