/** Problem -4 : Print all possible strings of length k that can be formed from a set of n characters
 * Given a set of characters and a positive integer k, print all possible strings of length k that can be formed from the given set.

Examples:

Input: 
set[] = {'a', 'b'}, k = 3

Output:
aaa
aab
aba
abb
baa
bab
bba
bbb


Input: 
set[] = {'a', 'b', 'c', 'd'}, k = 1
Output:
a
b
c
d
*/

package org.indranil.learning.topicwise.DataStructure.Recursion_Backtracking;

public class KaryStringGenerator
{
	public static void main(String[] args){
		System.out.println("First Test");
	    char[] set1 = {'a', 'b'};
	    int k = 3;
	    k_string(set1, k);
	     
	    System.out.println("\nSecond Test");
	    char[] set2 = {'a', 'b', 'c', 'd'};
	    k = 1;
	    k_string(set2, k); 
	}
	
	// The method that prints all possible strings of length k. It is mainly a wrapper over recursive function printAllKLengthRec()
	static void k_string(char[] set, int k)
	{
	    int n = set.length; 
	    k_stringRec(set, "", n, k);
	}
	 
	// The main recursive method to print all possible strings of length k
	static void k_stringRec(char[] set, String prefix, int n, int k)
	{
	     
	    // Base case: k is 0, print prefix
		if (k == 0) 
	    {
	        System.out.println(prefix);
	        return;
	    }
	 
	    // One by one add all characters from set and recursively call for k equals to k-1
	    for (int i = 0; i < n; ++i)
	    {
	 
	        // Next character of input added
	        String newPrefix = prefix + set[i]; 
	         
	        // k is decreased, because we have added a new character
	        k_stringRec(set, newPrefix, n, k - 1); 
	    }
	}
	
}

// Let T(n) be the running time of k_string(n). Using Subtraction and Conquer Master theorem, we get T(n)=O(k^n).