package org.indranil.learning.topicwise.Collection;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args)
    {
        ArrayList<Comparable> a = new ArrayList<Comparable>();
        a.add("A");
        a.add(10);
        a.add("A");
        a.add(null);
        System.out.println(a); //[A,10,A,null]
        a.remove(2);
        System.out.println(a); //[A,10,null]
        a.add(2,"M");
        a.add("N");
        System.out.println(a); // [A,10,M,null,N]
    }
    
    
}
