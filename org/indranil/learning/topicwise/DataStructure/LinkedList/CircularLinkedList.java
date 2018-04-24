package org.indranil.learning.topicwise.DataStructure.LinkedList;

class CLLNode{
	private int data;
	private CLLNode next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public CLLNode getNext() {
		return next;
	}
	public void setNext(CLLNode next) {
		this.next = next;
	}
	
	public void displayNode() {
		System.out.println("{"+ data + "}");
	}
}

public class CircularLinkedList {
	private CLLNode head;
	private CLLNode tail;
	
	public CircularLinkedList() {
		head = null;
		tail = null;
	}
	
	private boolean isEmpty() {
		return head == null;
	}
	
	public void insertAtBegin(int data) {
		CLLNode newNode = new CLLNode();
		newNode.setData(data);
		
		if(isEmpty())
			tail = newNode;
		
		newNode.setNext(head);
		head = newNode;
	}
	
	public void insertAtEnd(int data) {
		CLLNode newNode = new CLLNode();
		newNode.setData(data);
		
		if(isEmpty())
			head = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	public int deleteFromBegin() {
		int temp = head.getData();
		
		if(head.getNext() == null)
			tail = null;
		
		head = head.getNext();
		return temp;
	}
	
	public void displayCLLList() {
		System.out.println("Circular Linked List (start --> end)");
		CLLNode current = head;
		while(current != null) {
			current.displayNode();
			current = current.getNext();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertAtBegin(100);
		list.insertAtBegin(50);
		list.insertAtBegin(99);
		list.insertAtBegin(88);
		list.insertAtEnd(99999);
		
		list.displayCLLList();
	}
	

}
