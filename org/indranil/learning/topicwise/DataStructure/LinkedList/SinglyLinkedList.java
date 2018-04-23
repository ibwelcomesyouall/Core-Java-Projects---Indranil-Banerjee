package org.indranil.learning.topicwise.DataStructure.LinkedList;

class Node{
	private int data;
	private Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}

public class SinglyLinkedList {
	
	// only field of the class which will hold the head of the list
	Node head;
	private int length = 0;
	
	// Default Constructor
	public SinglyLinkedList(){
		length = 0;
	}
	
	// Insert a node at the beginning of the list
	public synchronized void insertAtBegin(Node node) {
		node.setNext(head);
		head = node;
		length++;	
	}
	
	// Insert a node at the end of the list
	public synchronized void insertAtEnd(Node node) {
		if(head==null)
			head=node;
		else {
			Node temp = head;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
		length++;	
	}
	
	// Add a new value to the list at a given position
	public synchronized void insert(int data, int position) {
		if(position < 0)
			position=0;
		if(position > length) {
			position = length;
		}
		// if the list is empty
		if(head == null)
			head = new Node(data);
		// if adding at the front of the list
		else if(position == 0) {
			Node newNode = new Node(data);
			newNode.setNext(head.getNext());
			head = newNode;
		}
		else {
			Node temp = head;
			Node newNode = new Node(data);
			for(int i =1;i<position-1;i++) {
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		length++;		
		
	}
	
	// Remove and return the node at the head of the list
	public synchronized Node removeFromBegin() {
		Node temp = head;
		if(temp != null) {
			head = temp.getNext();
			temp.setNext(null);
		}
		length--;
		return temp;
	}
	
	// Remove and return the node at the end of the list
	public synchronized Node removeFromEnd() {
		if(head == null)
			return null;
		Node temp = head;
		Node previous =null;
		Node next = head.getNext();
		if(next == null) {
			head = null;
			return temp;
		}
		while((next = temp.getNext())!=null) {
			previous = temp;
			temp = next;
		}
		previous.setNext(null);
		length--;
		return temp;
	}
	
	// Remove a node matching the specified node from the list
	// It used equals() method instead of == for a matched node
	public synchronized void removeMatched(Node node) {
		if(head == null)
			return;
		if(node.equals(head)) {
			head = head.getNext();
			return;
		}
		Node temp = head;
		Node previous = null;
		while((previous = temp.getNext())!=null) {
			if(temp.equals(node)) {
				temp.setNext(previous.getNext());
				return;
			}
			temp = previous;
		}
		length--;
			
	}
	
	// Remove the value at a given position
	public synchronized void remove(int position) {
		if(position < 0)
			position = 0;
		if (position >= length)
			position = length-1;
		if(head == null)
			return;
		if(position == 0)
			head = head.getNext();
		else {
			Node temp = head;
			for(int i = 1;i<position;i++)
				temp = temp.getNext();
			temp.setNext(temp.getNext().getNext());
		}
		length--;
	}
	
	// Return the current length of the list.
	public int length() {
		return length;
	}
	
	// Find the position of the first value that is equal to a given value
	public int getPosition(int data) {
		Node temp = head;
		int pos = 0;
		while(temp != null) {
			if(temp.getData() == data)
				return pos;
			pos++;
			temp = temp.getNext();
		}
		return Integer.MIN_VALUE;
	}
	
	// Remove everything from the list
	public void clearList() {
		head=null;
		length=0;
	}
	
	@Override
	public String toString() {
		String result="[";
		if(head==null)
			return result+"]";
		result=result+head.getData();
		Node temp = head.getNext();
		while(temp!=null) {
			result= result+","+temp.getData();
			temp=temp.getNext();
		}
		return result+"]";
		
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtBegin(new Node(100));
		list.insertAtBegin(new Node(300));
		list.insertAtEnd(new Node(500));
		list.insertAtEnd(new Node(700));
		list.insert(999,3);
		list.insert(1000,0);
		System.out.println(list);
		System.out.println("Fist element removed : " + list.removeFromBegin().getData());
		System.out.println(list);
		System.out.println("Last element removed : " + list.removeFromEnd().getData());
		System.out.println(list);
		list.removeMatched(new Node(999)); // - not working
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.length());
		list.clearList();
		System.out.println(list.length());
	}
	
}
