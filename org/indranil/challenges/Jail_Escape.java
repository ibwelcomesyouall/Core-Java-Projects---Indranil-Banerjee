package org.indranil.challenges;

import java.io.IOException;
import java.util.Scanner;

public class Jail_Escape {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3_size = 0;
        ip3_size = Integer.parseInt(in.nextLine().trim());
        int[] ip3 = new int[ip3_size];
        int ip3_item;
        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
            ip3_item = Integer.parseInt(in.nextLine().trim());
            ip3[ip3_i] = ip3_item;
        }
        output = GetJumpCount(ip1,ip2,ip3);
        System.out.println(String.valueOf(output));
    }

    private static int GetJumpCount(int ip1, int ip2, int[] ip3) {
        int no_of_walls = ip3.length;
        int no_of_jumps=0;
        int ip3_copy;
        for(int i=0;i<no_of_walls;i++)
        {
            ip3_copy=ip3[i];
            if(ip3[i]<=ip1)
            {
                no_of_jumps++;
            }
            else
            {
                int jump_height=Math.abs(ip1-ip2);
                do
                {
                    no_of_jumps++;
                    ip3_copy=ip3_copy-jump_height;
                    if(ip3_copy<=ip1)
                    {
                        no_of_jumps++;
                        ip3_copy=0;
                    }  
                }
                while(ip3_copy!=0);
            }
        }
        return no_of_jumps;
    }
}
