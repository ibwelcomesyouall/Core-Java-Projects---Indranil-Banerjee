package org.indranil.learning.topicwise.DataStructure.LinkedList;

class DLLNode {
	
	private int data;
	private DLLNode prev;
	private DLLNode next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DLLNode getPrev() {
		return prev;
	}
	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}
	public DLLNode getNext() {
		return next;
	}
	public void setNext(DLLNode next) {
		this.next = next;
	}
	
	public void displayNode() {
		System.out.print("{"+ data + "}");
	}
} 

public class DoublyLinkedList{
	private DLLNode head;
	private DLLNode tail;

	public DoublyLinkedList() {
		this.head = null; 
		this.tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insertAtBegin(int data) {
		DLLNode newNode = new DLLNode();
		newNode.setData(data);
		
		if(isEmpty())
			tail = newNode;
		else
			head.setPrev(newNode);
		
		newNode.setNext(head);
		this.head = newNode;
	}
	
	public void insertAtEnd(int data) {
		DLLNode newNode = new DLLNode();
		newNode.setData(data);
		
		if(isEmpty())
			head = newNode;
		else {
			tail.setNext(newNode);
			newNode.setPrev(tail);
		}
		
		tail = newNode;
	}
	
	public DLLNode deleteFromBegin() {
		DLLNode temp = head;
		if(head.getNext() == null) // there is only one item in the list
			tail = null;
		else
			head.getNext().setPrev(null); // the list's first node will point to null
		
		head = head.getNext();
		return temp;
	}
	
	public DLLNode deleteFromEnd() {
		DLLNode temp = tail;
		if(head.getNext() == null)
			head = null;
		else
			tail.getPrev().setNext(null);
		
		tail = tail.getPrev();
		return temp;
	}
	
	public boolean insertAfter(int key, int data) {
		DLLNode current = head;
		while(current.getData()!= key) {
			current = current.getNext();
			if(current == null)
				return false;
		}
		
		DLLNode newNode = new DLLNode();
		newNode.setData(data);
		
		if(current == tail) {
			current.setNext(null);
			tail = newNode;			
		}
		else {
			newNode.setNext(current.getNext());
			current.getNext().setPrev(newNode);
		}
		
		newNode.setPrev(current);
		current.setNext(newNode);	
		
		return true;
	}
	
	public DLLNode deleteKey(int key) {
		DLLNode current = head;
		while(current.getData() != key) {
			current = current.getNext();
			if(current == null)
				return null;
		}
		
		if(current == head)
			head = current.getNext();
		else
			current.getPrev().setNext(current.getNext());
		
		if(current == tail)
			tail = current.getPrev();
		else
			current.getNext().setPrev(current.getPrev());
		
		return current;
			
	}
	
	public void displayForward() {
		System.out.println("Doubly Linked List (start --> end)");
		DLLNode current = head;
		while(current != null) {
			current.displayNode();
			current = current.getNext();
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.println("Doubly Linked List (end --> start)");
		DLLNode current = tail;
		while(current != null) {
			current.displayNode();
			current = current.getPrev();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtBegin(22);
		list.insertAtBegin(44);
		list.insertAtBegin(66);
		list.insertAtEnd(11);
		list.insertAtEnd(33);
		list.insertAtEnd(55);
		list.displayForward();
		list.displayBackward();
		list.deleteFromBegin();
		list.deleteFromEnd();
		list.deleteKey(11);
		list.displayForward();
		list.insertAfter(22, 77);
		list.insertAfter(33, 88);
		list.displayForward();
	}
} 