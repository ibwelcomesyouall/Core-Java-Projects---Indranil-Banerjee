package org.indranil.learning.topicwise.Collection;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args)
    {
        HashSet<Comparable> h = new HashSet<Comparable>();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z")); //false
        System.out.println(h); //[null, B, C, D, Z, 10]
    }  
}
