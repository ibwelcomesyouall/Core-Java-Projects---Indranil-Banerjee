
//Date     : 3rd Sept 2016.
/*Question : Write a program to read a number in terms of String and convert it to integer without using any built in method.
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P68 {
    public static void main(String[] args) throws IOException {
        int n=0;
        boolean isNegative=false;
        System.out.println("Please enter a integer value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N=br.readLine();
        int length=N.length();
        if(N.charAt(0)=='-')
        {
            isNegative=true;
            for (int i=1;i<length;i++)
            {
                n=n+(N.charAt(i)-'0')*power(length-i-1);
            }
            if (isNegative==true)
            {
                n=-n;
            }
        }
        else
        {
          for (int i=0;i<length;i++)
            {
                n=n+(N.charAt(i)-'0')*power(length-i-1);
            }  
        }
        
        System.out.println("The integer value after converting it fom String is:"+n);
    }
    public static int power(int y)
    {
        int result=1;
        for(int a=1;a<=y;a++)
        {
            result=result*10;
        }
        return result;
    }
}
/*Output: run:
Please enter a integer value
-94842
The integer value after converting it fom String is:-94842
BUILD SUCCESSFUL (total time: 5 seconds)
            or
Please enter a integer value
3453
The integer value after converting it fom String is:3453
BUILD SUCCESSFUL (total time: 4 seconds)
*/

