package org.indranil.learning.practice;

import java.io.*;

public class Fliping_the_bits {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a binary number");
        String input1=br.readLine();
        System.out.println("Enter input2");
        int input2=Integer.parseInt(br.readLine());
        System.out.println("Enter input3");
        int input3=Integer.parseInt(br.readLine());
        System.out.println(Fliping_the_bits.nochange_bits(input1,input2,input3));

    }
    public static int nochange_bits(String input1,int input2,int input3)
    {
        int result=0;
        char[] ch = input1.toCharArray();  
        char[] ch1 = input1.toCharArray(); 
        if(input2<=0 || input3 <=0)
        {
            return -1;
        }
        else
        {
            for(int i=0;i<ch.length;i++)
            {
                if((i+1)%input2==0)
                {
                    if(ch[i]=='0')
                    {
                        ch[i]='1';
                    }
                    if(ch[i]=='1')
                    {
                        ch[i]='0';
                    }
                }
            }
            for(int i=0;i<ch.length;i++)
            {
                if((i+1)%input3==0)
                {
                    if(ch[i]=='0')
                    {
                        ch[i]='1';
                    }
                    if(ch[i]=='1')
                    {
                        ch[i]='0';
                    }
                }
            }
            for(int j=0;j<ch.length;j++)
            {
              if(ch[j]==ch1[j])
              {
                  result++;
              }
            }
            return result;
        }   
    }
    
}
