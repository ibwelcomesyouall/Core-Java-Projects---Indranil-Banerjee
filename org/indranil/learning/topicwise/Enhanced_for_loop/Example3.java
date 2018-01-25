package org.indranil.learning.topicwise.Enhanced_for_loop;

public class Example3 {
    public static void main(String[]args)
    {
        int [][][]x = {{{10,20},{30,40}},{{50,60,70},{80,90}}};
        for(int[][] x1:x)
        {
            for(int[] x2:x1)
            {
                for(int x3: x2)
                {
                    System.out.println(x3);
                }
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
60
70
80
90
BUILD SUCCESSFUL (total time: 0 seconds)
*/
