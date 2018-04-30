package org.indranil.learning.practice.DataStructure.Underlying_Stuctures;

public class HardCodedSortedLinkedList {
	
	private SLLNode head;
	
	public HardCodedSortedLinkedList(int data){
		SLLNode n1 = new SLLNode();
		SLLNode n2 = new SLLNode();
		SLLNode n3 = new SLLNode();
		SLLNode n4 = new SLLNode();
		SLLNode n5 = new SLLNode();
		SLLNode n6 = new SLLNode();
		SLLNode n7 = new SLLNode();
		SLLNode n8 = new SLLNode();
		SLLNode n9 = new SLLNode();
		SLLNode n10= new SLLNode();
		
		head = n1;
		
		n1.setData(data*1); n2.setData(data*2); n3.setData(data*3); n4.setData(data*4);	n5.setData(data*5); n6.setData(data*6); 
		n7.setData(data*7); n8.setData(data*8); n9.setData(data*9); n10.setData(data*10);
		
		n1.setNext(n2); n2.setNext(n3); n3.setNext(n4);	n4.setNext(n5);	n5.setNext(n6);	n6.setNext(n7);	n7.setNext(n8);
		n8.setNext(n9);	n9.setNext(n10);
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
}
