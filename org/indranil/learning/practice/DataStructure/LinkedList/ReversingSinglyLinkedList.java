package org.indranil.learning.practice.DataStructure.LinkedList;

import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SLLNode;
import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SinglyLinkedList;

public class ReversingSinglyLinkedList {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.dumpValue();
		System.out.println("Original List: " + list);
		list.setHead(reverseListIterative(list.getHead()));
		System.out.println("Reversed List using Iterative: " + list);
		
		SinglyLinkedList list1 = new SinglyLinkedList();
		list1.dumpValue();
		System.out.println("Original List: " + list1);
		list1.setHead(reverseLinkedListRecursive(list1.getHead()));
		System.out.println("Reversed List using Recursive: " + list1);
	}

	private static SLLNode reverseListIterative(SLLNode head) {
		SLLNode current = head;
		SLLNode previous = null;
		
		while(current != null) {
			SLLNode next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		return previous;
	}
	
	private static SLLNode reverseLinkedListRecursive(SLLNode head) {
		SLLNode current = head;
		if(current == null)
			return null;
		SLLNode next = current.getNext();
		if(next == null) {
			head = current;
			return current;
		}
		reverseLinkedListRecursive(next); // ---- not working as expected.
		next.setNext(current);
		current.setNext(null);	
		
		return current;
	}

}
