/*
 * Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
 * Example:
 * Input:  arr[] = [1, 2, 3, 4, 5, 6, 7]
 * d = 2
 * Output: arr[] = [3, 4, 5, 6, 7, 1, 2] 
 */

/*
 * Block swap Algorithm :
 * -------------------------
 * Initialize A = arr[0..d-1] and B = arr[d..n-1]
 * 1) Do following until size of A is equal to size of B
 * a)  If A is shorter, divide B into Bl and Br such that Br is of same length as A. Swap A and Br to change ABlBr into BrBlA. Now A is at its final place, so recur on pieces of B.
 * b)  If A is longer, divide A into Al and Ar such that Al is of same length as B Swap Al and B to change AlArB into BArAl. Now B is at its final place, so recur on pieces of A.
 * 2)  Finally when A and B are of equal size, block swap them.
 */

package org.indranil.learning.practice;

public class Assignment_3 {

}
