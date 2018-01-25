package org.indranil.challenges;

import java.io.IOException;
import java.util.Scanner;

public class Magic_Soduku {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1_rows = 0;
        int ip1_cols = 0;
        ip1_rows = Integer.parseInt(in.nextLine().trim());
        ip1_cols = Integer.parseInt(in.nextLine().trim());
        
        int[][] ip1 = new int[ip1_rows][ip1_cols];
        for(int ip1_i=0; ip1_i<ip1_rows; ip1_i++) {
            for(int ip1_j=0; ip1_j<ip1_cols; ip1_j++) {
                ip1[ip1_i][ip1_j] = in.nextInt();
                
            }
        }
        output = SolveMagicSquare(ip1);
        System.out.println(String.valueOf(output));
    }
    public static int SolveMagicSquare(int[][] input1)
    {
	    int output=0;
            int no_of_digits=0;
            for(int i=0;i<input1.length;i++)
            {
                for(int j=0;j<input1.length;j++)
                {
                    for(int k=0;k<input1.length;k++)
                    {
                        System.out.println("Checking input1["+i+"]["+j+"]==input1["+i+"]["+k+"]");
                        if(input1[i][j]!=0 && input1[i][k]!= 0&& input1[i][j]==input1[i][k])
                        {
                            System.out.println("pass");
                            output++;
                        }
                    }
                    
                }
            }
            System.out.println("############################# row check complete, count = "+output+" #############################");
            for(int i=0;i<input1.length;i++)
            {
                for(int j=0;j<input1.length;j++)
                {
                    for(int k=0;k<input1.length;k++)
                    {
                        System.out.println("Checking input1["+j+"]["+i+"]==input1["+k+"]["+j+"]");
                        if(input1[j][i]!=0 && input1[k][j]!= 0&&input1[j][i]==input1[k][j])
                        {
                        System.out.println("pass");    
                            output++;
                        }
                    }
                    
                }
            }
            System.out.println("############################# column check complete, count = "+output+" #############################");
            int x=0;
            int sum=0;
            for(int j=0;j<Math.sqrt(input1.length);j++)
                {
                    for(int k=0;k<Math.sqrt(input1.length);k++)
                    {
                            sum = sum+input1[j][k];
                            System.out.println("Cell sum is:"+sum);
                    }
                    
                }
            System.out.println("############################# Calculation SUM is complete #############################");
            int cellsum=0;
            for(int i=0;i<input1.length;i++)
            {
                for(int j=0;j<input1.length;j++)
                {
                    for(int k=0;k<Math.sqrt(input1.length);k++)
                    {
                        System.out.println("Checking input1["+i+"]["+j+"]==input1["+i+"]["+k+"]");
                        if(input1[i][j]!=0 && input1[j][k]!= 0&&i+j<=(input1.length)*(input1.length) && input1[i][j]==input1[i][k])
                        {
                            System.out.println("pass");
                            cellsum=cellsum+input1[j][k];
                            output++;
                        }
                    }
                    if((j+1)%Math.sqrt(input1.length)==0)
                    {
                        System.out.println("Checking the sum, cellsum="+cellsum+"sum="+sum);
                        if(cellsum==sum)
                        {
                            output++;
                        }
                    }
                    
                }
            }
            System.out.println("############################# cell check complete, count = "+output+" #############################");
            System.out.println(output);
            for(int i=0;i<input1.length;i++)
            {
                for(int j=0;j<input1.length;j++)
                {
                    if(input1[i][j]!=0)
                    no_of_digits++;
                }
            }
            System.out.println("no of digits:"+no_of_digits);
            if(output==(no_of_digits*2+input1.length*2))
            {
                return 1;
            }
            else
            {
                return 0;
            }
    }
    
}
