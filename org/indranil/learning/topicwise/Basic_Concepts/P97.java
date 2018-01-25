
//Date     : 20th Feb 2017.
/*Question : Write a Java program to sort a given list of names in ascending order
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P97 {
    public static void main(String[] args) throws IOException {
       ArrayList<String> al = new ArrayList<String>();
       System.out.println("How many names you want to add to the list");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int size = Integer.parseInt(br.readLine());
       System.out.println("Please enter "+size+"names");
       for(int i=0;i<size;i++)
       {
           al.add(br.readLine());
       }
       System.out.println("You have inserted\n"+al);
       Collections.sort(al);
       
       System.out.println("Sorted List\n"+al);
        
    }
}
/*Output: run:
How many names you want to add to the list
7
Please enter 7names
Indranil
Twinkle
Satish
Bipin
Bhuka
Harsh
Sandip
You have inserted
[Indranil, Twinkle, Satish, Bipin, Bhuka, Harsh, Sandip]
Sorted List
[Bhuka, Bipin, Harsh, Indranil, Sandip, Satish, Twinkle]
BUILD SUCCESSFUL (total time: 25 seconds)
*/

