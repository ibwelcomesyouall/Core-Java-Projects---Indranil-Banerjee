package org.indranil.learning.practice.DataStructure.LinkedList;

import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.HardCodedMergingList;
import org.indranil.learning.practice.DataStructure.Underlying_Stuctures.SLLNode;

public class IntersectingNodeFinder {
	
	public static void main(String[] args) {
		HardCodedMergingList list = new HardCodedMergingList();
		System.out.println("The merging point is : "+ findIntersectingNode(list.getList1Head(),list.getList2Head()).getData());
	}

	private static SLLNode findIntersectingNode(SLLNode list1, SLLNode list2) {
		int l1 =0, l2=0, diff=0;
		SLLNode head1 = list1;
		SLLNode head2 = list2;
		while(head1 != null) {
			l1++;
			head1 = head1.getNext();
		}
		
		while(head2 != null) {
			l2++;
			head2 = head2.getNext();
		}
		
		if(l1 < l2) {
			head1 = list2;
			head2 = list1;
			diff = l2-l1;
		}
		else {
			head1 = list1;
			head2 = list2;
			diff = l1-l2;
		}
		
		for(int i=0;i<diff;i++)
			head1 = head1.getNext();
		while(head1 != null && head2 != null) {
			if(head1 == head2)
				return head1;
			head1 = head1.getNext();
			head2 = head2.getNext();
		}
		return null;
	}

}
