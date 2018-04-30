package org.indranil.learning.practice.DataStructure.Underlying_Stuctures;

public class HardCodedMergingList {
	
	SLLNode n1 = new SLLNode();
	SLLNode n2 = new SLLNode();
	SLLNode n3 = new SLLNode();
	SLLNode n4 = new SLLNode();
	SLLNode n5 = new SLLNode();
	SLLNode n6 = new SLLNode();
	SLLNode n7 = new SLLNode();
	
	public HardCodedMergingList() {		
				
		n1.setData(100); n2.setData(200); n3.setData(300); n4.setData(400); n5.setData(500);
		n6.setData(600); n7.setData(700);
		
		n1.setNext(n2); n2.setNext(n6); 
		n3.setNext(n4); n4.setNext(n5); n5.setNext(n6);
		n6.setNext(n7);
		
	}
	
	public SLLNode getList1Head() {
		SLLNode head = n1;
		return head;
	}
	
	public SLLNode getList2Head() {
		SLLNode head = n3;
		return head;
	}

}
