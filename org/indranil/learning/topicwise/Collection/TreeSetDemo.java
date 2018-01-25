package org.indranil.learning.topicwise.Collection;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args)
    {
        TreeSet<String> t = new TreeSet<String>();
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");
        //t.add(new Integer(10)); //java.lang.ClassCastException
        //t.add(null); //java.lang.NullPointerException
        System.out.println(t); //[A, B, L, Z, a]
    }  
}
