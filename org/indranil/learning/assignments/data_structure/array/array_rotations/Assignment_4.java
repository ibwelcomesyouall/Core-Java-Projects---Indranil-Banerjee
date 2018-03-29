/*
 * Given an array, cyclically rotate the array clockwise by one.

Examples:

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
 */
package org.indranil.learning.assignments.data_structure.array.array_rotations;

import java.util.Arrays;

//Time Complexity: O(n)
//Auxiliary Space: O(1)
public class Assignment_4 {
	
	    static int arr[] = new int[]{1, 2, 3, 4, 5};
	     
	    // Method for rotation
	    static void rotate()
	    {
	       int x = arr[arr.length-1], i;
	       for (i = arr.length-1; i > 0; i--)
	          arr[i] = arr[i-1];
	       arr[0] = x;
	    }
	     
	    /* Driver program */
	    public static void main(String[] args) 
	    {
	        System.out.println("Given Array is");
	        System.out.println(Arrays.toString(arr));
	         
	        rotate();
	         
	        System.out.println("Rotated Array is");
	        System.out.println(Arrays.toString(arr));
	    }
}
