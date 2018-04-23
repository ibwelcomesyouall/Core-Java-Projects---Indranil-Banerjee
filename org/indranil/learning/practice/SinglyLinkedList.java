package org.indranil.learning.practice;
public class SinglyLinkedList {
    int data;
    SinglyLinkedList next;

    public SinglyLinkedList() {
        next=null;
    }
    
    public static void main(String[] args) {
        SinglyLinkedList a = new SinglyLinkedList();
        SinglyLinkedList b = new SinglyLinkedList();
        SinglyLinkedList c = new SinglyLinkedList();
        a.data=10;
        b.data=20;
        c.data=30;
        a.next=b;
        b.next=c;
        
        System.out.println(a.next.next.data);
        
        
    }
    
}
