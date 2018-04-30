package org.indranil.learning.practice.DataStructure.LinkedList;

import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SLLNode;
import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SinglyLinkedList;

public class LinkedListEvenOrOdd {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.dumpValue();
		System.out.println("List: " + list);
		System.out.println("The supplied list is: " + (isLinkedListLengthhEven(list.getHead())?" EVEN ":" ODD "));
		
	}

	private static boolean isLinkedListLengthhEven(SLLNode head) {
		while(head != null && head.getNext()!= null) {
			head = head.getNext().getNext();
		}
		
		if(head == null)
			return true;
		return false;
	}
	

}
