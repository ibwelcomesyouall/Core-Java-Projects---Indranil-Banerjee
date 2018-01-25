
//Date     : 3rd Sept 2016.
/*Question : Write a program to read five numbers,store in integer array and display the occurrence of each number.
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P73 {
    public static void main(String[] args) throws IOException {
        int arr[] = new int[5];
        int arr1[] = new int[5];
        int count=0;
        System.out.println("Please enter five numbers:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
       for(int j=0;j<5;j++)
       {
           System.out.print("Occurance of "+arr[j]+":");
           for (int k=0;k<5;k++)
           {
               if(arr[j]==arr[k])
               {
                   count++;
               }
           }
           System.out.println(count);
           count=0;
       }
    }
}
/*Output: run:
Please enter five numbers:
2
3
4
5
2
Occurance of 2:2
Occurance of 3:1
Occurance of 4:1
Occurance of 5:1
Occurance of 2:2
BUILD SUCCESSFUL (total time: 6 seconds)
*/

