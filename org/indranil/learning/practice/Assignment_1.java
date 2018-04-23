/*
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * 1 2 3 4 5 6 7 
 * 
 * Rotation of the above array by 2 will make array
 * 3 4 5 6 7 1 2
 */

package org.indranil.learning.practice;

public class Assignment_1 {
	
	public static void main(String[] args) {
		
		int d=2; // Rotation count for the program
		int array1[] = {1,2,3,4,5,6,7};
		Assignment_1 assign1 = new Assignment_1();
		System.out.println("Array Before any rotation :-");
		assign1.displayArray(array1);
		array1 = assign1.rotate(array1,d,array1.length);
		System.out.println("Array After "+d+" rotations by using temp array :-");
		assign1.displayArray(array1);
		
		int array2[] = {1,2,3,4,5,6,7};
		Assignment_1 assign2 = new Assignment_1();
		System.out.println("Array Before any rotation :-");
		assign2.displayArray(array2);
		array2 = assign1.rotate(array2,d,array2.length);
		System.out.println("Array After "+d+" rotations by rotating the array one by one :-");
		assign2.displayArray(array2);
		
		int array3[] = {1,2,3,4,5,6,7};
		Assignment_1 assign3 = new Assignment_1();
		System.out.println("Array Before any rotation :-");
		assign3.displayArray(array3);
		array3 = assign1.rotate(array3,d,array3.length);
		System.out.println("Array After "+d+" rotations by using Juggling algorithm:-");
		assign3.displayArray(array3);
		
	}
	
	// Coded by me (METHOD 1 (Use temp array)) 
	//Time complexity O(n)
	//Auxiliary Space: O(d)
	
	public int[] rotate(int ar[], int d, int n) {
		
		int temp[] = new int[d];
		int finalarr[] = new int[n];
		
			for(int i=0; i<d;i++)
				temp[i] = ar[i];
			for(int i=d;i<n;i++)
				finalarr[i-d] = ar[i];
			for(int i=n-d;i<n;i++)
				finalarr[i]=temp[i-(n-d)];
			
		return finalarr;
		
	}
	
	//METHOD 2 (Rotate one by one)
	// Time complexity: O(n*d)
	// Auxiliary Space: O(1)
	public int[] leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            arr = leftRotatebyOne(arr, n);
        
        return arr;
    }
 
    public int[] leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
        
        return arr;
    }
    
    //METHOD 3 (A Juggling Algorithm)
    //Time complexity: O(n)
    //Auxiliary Space: O(1)
    public int[] leftRotate_jugglingAlgo(int arr[], int d, int n) 
    {
        int i, j, k, temp;
        for (i = 0; i < gcd(d, n); i++) 
        {
            temp = arr[i];
            j = i;
            while (true) 
            {
                k = j + d;
                if (k >= n) 
                    k = k - n;
                if (k == i) 
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return arr;
    }
    
    int gcd(int a, int b) 
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
	
	public void displayArray(int ar[]) {
		System.out.print("[ ");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.print(" ]");
		System.out.println();
	}

}
