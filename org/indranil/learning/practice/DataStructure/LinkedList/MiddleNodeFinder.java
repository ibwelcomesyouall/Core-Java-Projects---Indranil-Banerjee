
// Time Complexity: O(n) 
// Space Complexity: O(1)

package org.indranil.learning.practice.DataStructure.LinkedList;

import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SLLNode;
import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SinglyLinkedList;

public class MiddleNodeFinder {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.dumpValue();
		System.out.println("The list is: " + list);
		System.out.println("The Middle node (using two-scan) is: " + findMiddleNode(list.getHead()).getData());
		System.out.println("The Middle node (using one-scan) is: " + findMiddle(list.getHead()).getData());
	}

	private static SLLNode findMiddle(SLLNode head) {
		SLLNode ptr1x, ptr2x;
		ptr1x = head;
		ptr2x = head;
		int i=0;
		while(ptr1x.getNext() != null) {
			if(i == 0) {
				ptr1x = ptr1x.getNext();
				i=1;
			}
			else if(i == 1) {
				ptr1x = ptr1x.getNext();
				ptr2x = ptr2x.getNext();
				i=0;
			}
		}
		return ptr2x;
	}

	private static SLLNode findMiddleNode(SLLNode head) {
		SLLNode current = head;
		int length = 0;
		int mid = 0;
		
		while(current!= null) {
			length++;
			current = current.getNext();
		}
		if(length % 2 == 0)
				mid = length/2 - 1;
		else
			mid = length/2;
		
		current = head;
		for(int i=0;i< mid;i++)
			current = current.getNext();
		
		return current;
		

	}

}
