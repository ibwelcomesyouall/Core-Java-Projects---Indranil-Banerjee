/*
 * Given an array, only rotation operation is allowed on array. We can rotate the array as many times as we want. Return the maximum possbile of summation of i*arr[i].
 * Example:
 * Input: arr[] = {1, 20, 2, 10}
 * Output: 72
 * We can 72 by rotating array twice.
 * {2, 10, 1, 20}
 * 20*3 + 1*2 + 10*1 + 2*0 = 72
 * Input: arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
 * Output: 330
 * We can 330 by rotating array 9 times.
 * {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 * 0*1 + 1*2 + 2*3 ... 9*10 = 330
*/
package org.indranil.learning.assignments.data_structure.array.array_rotations;

/*
 * 1) Compute sum of all array elements. Let this sum be 'arrSum'.
 * 2) Compute R0 by doing i*arr[i] for given array. 
 * Let this value be currVal.
 * 3) Initialize result: maxVal = currVal // maxVal is result.
 * This loop computes Rj from  Rj-1 
 * 4) Do following for j = 1 to n-1
 * a) currVal = currVal + arrSum-n*arr[n-j];
 * b) If (currVal > maxVal)
 * maxVal = currVal   
 * 5) Return maxVal
 */
//Time Complexity: O(n)
//Auxiliary Space: O(1)
public class Assignment_7 {
	static int arr[] = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    
    // Returns max possible value of i*arr[i]
    static int maxSum()
    {
        // Find array sum and i*arr[i] with no rotation
        int arrSum = 0;  // Stores sum of arr[i]
        int currVal = 0;  // Stores sum of i*arr[i]
        for (int i=0; i<arr.length; i++)
        {
            arrSum = arrSum + arr[i];
            currVal = currVal+(i*arr[i]);
        }
      
        // Initialize result as 0 rotation sum
        int maxVal = currVal;
      
        // Try all rotations one by one and find
        // the maximum rotation sum.
        for (int j=1; j<arr.length; j++)
        {
            currVal = currVal + arrSum-arr.length*arr[arr.length-j];
            if (currVal > maxVal)
                maxVal = currVal;
        }
      
        // Return result
        return maxVal;
    }
     
    // Driver method to test the above function
    public static void main(String[] args) 
    {
        System.out.println("Max sum is " + maxSum());
    }

}
