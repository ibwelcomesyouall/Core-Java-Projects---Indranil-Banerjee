/*** 
 * Find nth node from the end of Linked List.
 * Sample :-
 * Linked List 56,49,87,43,65,22,99,66,44,99,33,77
 * implement a function int find(int pos_from_end)
 * NthNodeFromEnd(7).getData() ---- should return 22. 
 */

// Time Complexity: O(n)

// Here we are scanning the list two time, one during length calculation and second while finding the nth node.

package org.indranil.learning.practice.DataStructure.LinkedList;

import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SLLNode;
import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SinglyLinkedList;

public class NthNodeFinder {
	
	SLLNode current;
	SinglyLinkedList list;
	int counter=0;
	
	public NthNodeFinder(SinglyLinkedList list) {
		this.list=list;
	}
	
	public int getLength(SinglyLinkedList list) {
		int length = 0;
		SLLNode current = list.getHead();
		while(current != null) {
			current = current.getNext();
			length++;
		}
		return length;			
	}

	public SLLNode NthNodeFromEnd(int pos_from_end) {
		if(pos_from_end > getLength(list)) {
			System.out.println("Fewer number of nodes in the list !!");
			return null;
		}
		else {
			current = list.getHead();
			while(counter != getLength(list)-pos_from_end) {
				current = current.getNext();
				counter++;
			}
			return current;
		}
	}
	
	public SLLNode NthNodeFromEnd_Recursion(SLLNode head, int NthNode) {
		if(head !=null) {
			NthNodeFromEnd_Recursion(head.getNext(), NthNode);
			counter++;
			if(NthNode == counter) {
				return head; // ------ check how to resolve the null pointer exception
			}
		}
		return null;
	}
	
	public SLLNode NthNodeFromEnd_Efficient(SLLNode head, int NthNode) {
		SLLNode pTemp = head;
		SLLNode pNthNode = null;
		for(int count = 1; count<NthNode; count++) {
			if(pTemp != null)
				pTemp = pTemp.getNext();
		}
		while(pTemp != null) {
			if(pNthNode == null)
				pNthNode = head;
			else
				pNthNode = pNthNode.getNext();
			
			pTemp = pTemp.getNext();
		}
		if(pNthNode != null)
			return pNthNode;
		return null;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtBegin(77);
		list.insertAtBegin(33);
		list.insertAtBegin(99);
		list.insertAtBegin(44);
		list.insertAtBegin(66);
		list.insertAtBegin(99);
		list.insertAtBegin(22);
		list.insertAtBegin(65);
		list.insertAtBegin(43);
		list.insertAtBegin(87);
		list.insertAtBegin(49);
		list.insertAtBegin(56);
		
		System.out.println(list);
		
		NthNodeFinder finder = new NthNodeFinder(list);
		System.out.println("Using my approach : " + finder.NthNodeFromEnd(7).getData());
		
		NthNodeFinder  finder_Efficient = new NthNodeFinder(list);
		System.out.println("Using efficient approach : " + finder_Efficient.NthNodeFromEnd_Efficient(list.getHead(),7).getData());
		
		NthNodeFinder finder_recursion = new NthNodeFinder(list);
		System.out.println("Using recursion approach : " + finder_recursion.NthNodeFromEnd_Recursion(list.getHead(),7).getData());
		
	}

}
