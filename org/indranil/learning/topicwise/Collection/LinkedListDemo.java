package org.indranil.learning.topicwise.Collection;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList<Comparable> l = new LinkedList<Comparable>();
        l.add("Indranil");
        l.add(30);
        l.add(null);
        l.add("Indranil");
        System.out.println(l); //[Indranil,30,null,Indranil]
        l.set(0,"Software");
        l.add(0,"Banerjee");
        l.removeLast();
        l.addFirst("Hello");
        System.out.println(l); //[Hello,Banerjee,Software,30,null]
    }
    
    
}
