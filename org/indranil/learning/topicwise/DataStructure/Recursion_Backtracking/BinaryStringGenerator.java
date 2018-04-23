/** Problem -3 : Generate all binary strings from given pattern
* Given a string containing of ‘0’, ‘1’ and ‘?’ wildcard characters, generate all binary strings that can be formed by replacing 
* each wildcard character by ‘0’ or ‘1’.

* Input str = "1??0?101"
* Output: 
        10000101
        10001101
        10100101
        10101101
        11000101
        11001101
        11100101
        11101101
*/

package org.indranil.learning.topicwise.DataStructure.Recursion_Backtracking;

public class BinaryStringGenerator
{
	static String str = "1??0?101";
	static char[] A = str.toCharArray();
	
	public static void main(String[] args){
		binary(0);	
	}
	
	public static void binary(int index)
    {
        if (index == A.length)
        {
            System.out.println(A);
            return;
        }
 
        if (A[index] == '?')
        {
            // replace '?' by '0' and recurse
            A[index] = '0';
            binary(index + 1);
             
            // replace '?' by '1' and recurse
            A[index] = '1';
            binary(index + 1);
             
            // NOTE: Need to backtrack as string is passed by reference to the function
            A[index] = '?';
        }
        else
        	binary(index + 1);
    }
	
}

// Let T(n) be the running time of binary(n). Using Subtraction and Conquer Master theorem, we get T(n)=O(2^n).