package org.indranil.learning.topicwise.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args)
    {
        TreeSet<String> t = new TreeSet<String>(new myComparatorForTreeSetDemo3());
        t.add("A");
        t.add("Z");
        t.add("K");
        t.add("B");
        t.add("a");
        System.out.println(t); //[a, Z, K, B, A]
        
    }
    
}

class myComparatorForTreeSetDemo3 implements Comparator<Object>
{
   public int compare(Object obj1, Object obj2)
   {
       String s1= (String)obj1;
       String s2= (String)obj2;
       return -s1.compareTo(s2);
   }
}
