
//Date     : 3rd Sept 2016.
/*Question : Write a program to display max element of an array..
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.IOException;
public class P87 {
    public static void main(String[] args) throws IOException {
        int arr[] ={1,2,3,4,5};
        int arrr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            arrr[i]=arr[arr.length-i];
        }
        for(int i=0;i<arrr.length;i++)
        {
            arr[i]=arrr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            //System.out.println(arr[i])
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

