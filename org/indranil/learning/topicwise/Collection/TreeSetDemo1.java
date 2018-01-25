package org.indranil.learning.topicwise.Collection;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args)
    {
        TreeSet<StringBuffer> t = new TreeSet<StringBuffer>();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("B"));
        System.out.println(t); //java.lang.ClassCastException
    }  
}
