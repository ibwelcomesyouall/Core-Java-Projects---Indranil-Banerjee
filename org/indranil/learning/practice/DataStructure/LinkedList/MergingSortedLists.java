
// Time Complexity: O(n)

package org.indranil.learning.practice.DataStructure.LinkedList;

import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.HardCodedSortedLinkedList;
import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SLLNode;

public class MergingSortedLists {
	
	SLLNode head;
	
	static HardCodedSortedLinkedList list1 = new HardCodedSortedLinkedList(10);
	static HardCodedSortedLinkedList list2 = new HardCodedSortedLinkedList(100);
	static MergingSortedLists list = new MergingSortedLists();
	
	public static void main(String[] args) {
		System.out.println("List1 is: " + list1);
		System.out.println("List2 is: " + list2);
		list.setHead(mergeTwoLists(list1.getHead(), list2.getHead()));
		System.out.println("Merged List (Using recursion) is: " + list);	
		list.setHead(mergeTwoLists_WithoutRecursion(list1.getHead(), list2.getHead()));
		System.out.println("Merged List (Without using recursion) is: " + list);
	}
	
	public void setHead(SLLNode head) {
		this.head = head;
	}
	
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
	
	public static SLLNode mergeTwoLists(SLLNode head1, SLLNode head2) {
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
		SLLNode head = new SLLNode();
		head.setData(0);
		if(head1.getData() <= head2.getData()) {
			head = head1;
			head.setNext(mergeTwoLists(head1.getNext(),head2));
		}
		else {
			head = head2;
			head.setNext(mergeTwoLists(head2.getNext(),head1));
		}
		return head;
	}
	
	public static SLLNode mergeTwoLists_WithoutRecursion(SLLNode head1, SLLNode head2) {
		SLLNode head = new SLLNode();
		head.setData(0);
		SLLNode current = head;
		while(head1 !=null && head2 != null) {
			if(head1.getData() <= head2.getData()) {
				current.setNext(head1);
				head1 = head1.getNext(); // -- Not working as expected
			}
			else {
				current.setNext(head2);
				head2 = head2.getNext();
			}
		}
		if(head1 != null)
			current.setNext(head1);
		else if(head2 != null)
			current.setNext(head2);
		return head.getNext();
	}
}
