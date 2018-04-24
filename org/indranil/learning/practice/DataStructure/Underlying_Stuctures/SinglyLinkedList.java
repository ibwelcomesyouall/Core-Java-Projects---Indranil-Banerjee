package org.indranil.learning.practice.DataStructure.Underlying_Stuctures;

public class SinglyLinkedList {
	private SLLNode head;
	
	public void insertAtBegin(int data) {
		SLLNode newNode = new SLLNode();
		newNode.setData(data);
	    newNode.setNext(head);
		head = newNode;
	}
	
	public SLLNode getHead() {
		return head;
	}
	
	@Override
	public String toString() {
		SLLNode current = head;
		String result = "[";
		if(head == null)
			return result+"]";
		result = result+current.getData();
		current = current.getNext();
		while(current!= null) {
			result = result+","+current.getData();
			current = current.getNext();
		}
		
		return result = result+ "]";
	}
	
	public void dumpValue() {
		insertAtBegin(77);
		insertAtBegin(33);
		insertAtBegin(99);
		insertAtBegin(44);
		insertAtBegin(66);
		insertAtBegin(99);
		insertAtBegin(22);
		insertAtBegin(65);
		insertAtBegin(43);
		insertAtBegin(87);
		insertAtBegin(49);
		insertAtBegin(56);
		
	}

}
