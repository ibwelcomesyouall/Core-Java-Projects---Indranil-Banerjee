/** Problem -2 : Given an array, check whether the array is sorted order with recursion
 * 
*/

package org.indranil.learning.topicwise.DataStructure.Recursion_Backtracking;

public class SortedArrayChecker
{
	public static void main(String[] args){
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = {3,5,7,8,2,1,5,9,1,7,8};
		
		System.out.println(isArrayinSortedOrder(a, a.length));
		System.out.println(isArrayinSortedOrder(b, b.length));
	
	}
	
	static boolean isArrayinSortedOrder(int[] A, int index){
		// when there is only one element , then return true as it already sorted.
		if(A.length==1 || index == 1)
			return true;
		// checking the last and second last element and if the last is less than second last return false else checking for the next set(i.e. second last and third last)
		return (A[index-1] < A[index-2]?false:isArrayinSortedOrder(A, index-1));
	}
	
}