/**
 * MemeoryLess Approach.
 * This problem was solved by Floyd.
 * Solution is named as Floyd cycle finding algorithm.
 * It uses two pointers moving at different speeds to walk the linked list. 
 * Once they enter the loop they are expected to meet, which denotes that there is a loop.
 */

// Time Complexity: O(n) and Space Complexity: O(1) -- findIfLoopExistsUsingFloyds
// Time Complexity: O(n) and Space Complexity: O(1) -- findBeginOfLoop

package org.indranil.learning.practice.DataStructure.LinkedList;

import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.HardCodedCyclicList;
import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SLLNode;
import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SinglyLinkedList;

public class Linear_Or_Cyclic_Finder {
	
	public static void main(String[] args) {
		
		HardCodedCyclicList cyclic = new HardCodedCyclicList();
		SinglyLinkedList linear = new SinglyLinkedList();
		linear.dumpValue();
		
		System.out.println("Hard Coded Cyclic List contains loop? : " + findIfLoopExistsUsingFloyds(cyclic.getHead()));
		if(findIfLoopExistsUsingFloyds(cyclic.getHead())) {
			System.out.println("The loop exist at : " + findBeginOfLoop(cyclic.getHead()).getData());
			System.out.println("Length of the loop is : " + findLengthOfTheLoop(cyclic.getHead()));
		}
		System.out.println("Singly Linked List contains loop? : " + findIfLoopExistsUsingFloyds(linear.getHead()));
		System.out.println("Hard Coded Sorted Linked List contains loop? : " + findIfLoopExistsUsingFloyds(linear.getHead()));
	}

	private static boolean findIfLoopExistsUsingFloyds(SLLNode head) {
		SLLNode fastPtr = head;
		SLLNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.getNext()!=null) {
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			if(slowPtr == fastPtr)
				return true;			
		}
		return false;
	}
	
	private static SLLNode findBeginOfLoop(SLLNode head) {
		SLLNode fastPtr = head;
		SLLNode slowPtr = head;
		boolean loopExists = false;
		
		while(fastPtr != null && fastPtr.getNext()!=null) {
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			if(slowPtr == fastPtr) {
				loopExists = true;
				break;
			}			
		}
		if(loopExists) {
			slowPtr = head;
			while(slowPtr != fastPtr) {
				slowPtr = slowPtr.getNext();
				fastPtr = fastPtr.getNext();
			}
			return fastPtr;
		}
		else
			return null;
	}
	
	private static int findLengthOfTheLoop(SLLNode head) {
		SLLNode fastPtr = head;
		SLLNode slowPtr = head;
		boolean loopExists = false;
		
		while(fastPtr != null && fastPtr.getNext()!=null) {
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			if(slowPtr == fastPtr) {
				loopExists = true;
				break;
			}			
		}
		int length = 0 ;
		if(loopExists) {
			do {
				slowPtr = slowPtr.getNext();
				length++;
			}
			while(slowPtr != fastPtr);		
		}
		return length;
	}

}
