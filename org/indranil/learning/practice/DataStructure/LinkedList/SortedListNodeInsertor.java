package org.indranil.learning.practice.DataStructure.LinkedList;

import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.HardCodedSortedLinkedList;
import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SLLNode;

public class SortedListNodeInsertor {
	
	public static void main(String[] args) {
		HardCodedSortedLinkedList list = new HardCodedSortedLinkedList(100);
		SLLNode newNode = new SLLNode();
		newNode.setData(777);
		InsertInSortedList(list.getHead(), newNode).getData();
		System.out.println(list);
	}

	private static SLLNode InsertInSortedList(SLLNode head, SLLNode newNode) {
		SLLNode current = head;
		SLLNode temp = null;
		if(head == null)
			return newNode;
		while(current != null && current.getData() < newNode.getData()) {
			temp = current;
			current = current.getNext();
		}
		newNode.setNext(current);
		temp.setNext(newNode);
		return head;
	}

}
