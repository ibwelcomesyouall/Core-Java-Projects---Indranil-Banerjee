package org.indranil.learning.topicwise.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo5 {
    public static void main(String[] args)
    {
        TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new myComparatorForTreeSetDemo5());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        System.out.println(t); //[A, K, L, Z]
        
    }
    
}

class myComparatorForTreeSetDemo5 implements Comparator<Object>
{
   public int compare(Object obj1, Object obj2)
   {
       String s1= obj1.toString();
       String s2= obj2.toString();
       return s1.compareTo(s2);
   }
}
