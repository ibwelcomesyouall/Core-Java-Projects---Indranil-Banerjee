// Time Complexity: O(n)
// Space Complexity: O(n) -> for Stack

package org.indranil.learning.practice.DataStructure.LinkedList;

import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SLLNode;
import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SinglyLinkedList;

public class PrintingSinglyLinkedListFromEnd {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.dumpValue();
		System.out.println("The orginal list: " + list);
		System.out.println("Printing from End:: ");
		printListFromEnd(list.getHead());
	}

	private static void printListFromEnd(SLLNode head) {
		if(head == null)
			return;
		printListFromEnd(head.getNext());
		System.out.print(head.getData()+ " ");		
	}

}
