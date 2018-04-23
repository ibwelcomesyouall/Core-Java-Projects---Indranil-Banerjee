package org.indranil.learning.practice;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Helping_the_Soldiers {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output=0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        String ip3 = in.nextLine().trim();
        String ip4 = in.nextLine().trim();
        output = appearanceCount(ip1,ip2,ip3,ip4);
        System.out.println(String.valueOf(output));
    }
    public static int appearanceCount(int input1,int input2,String input3,String input4)
    {
            String subinput4;
            int count=0;
            for(int i=0;i<(input2-input1+1);i++)
            {
                subinput4=input4.substring(i,i+input1);
                System.out.println(permutation(subinput4));
                Iterator<?> itr = permutation(subinput4).iterator();
                while(itr.hasNext())
                {
                    if(itr.next().equals(input3))
                    {
                        count++;
                    }
                }
                
            }
            
            return count;
    }

public static HashSet<String> permutation(String s) {
    HashSet<String>res = new HashSet<String>();
    if (s.length() == 1) {
        res.add(s);
    } else if (s.length() > 1) {
        int lastIndex = s.length() - 1;
        String last = s.substring(lastIndex);
        String rest = s.substring(0, lastIndex);
        res = merge(permutation(rest), last);
    }
    return res;
}

public static HashSet<String> merge(HashSet<String> list, String c) {
    HashSet<String> res = new HashSet<String>();
    for (String s : list) {
        for (int i = 0; i <= s.length(); ++i) {
            String ps = new StringBuffer(s).insert(i, c).toString();
            res.add(ps);
        }
    }
    return res;
}
}  

