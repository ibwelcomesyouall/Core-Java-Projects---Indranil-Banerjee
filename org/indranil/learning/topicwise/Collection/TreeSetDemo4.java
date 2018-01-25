package org.indranil.learning.topicwise.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args)
    {
        TreeSet<CharSequence> t = new TreeSet<CharSequence>(new myComparatorForTreeSetDemo4());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCD");
        t.add("A");
        System.out.println(t); //[A, AA, XX, ABC, ABCD]
        
    }
    
}

class myComparatorForTreeSetDemo4 implements Comparator<Object>
{
   public int compare(Object obj1, Object obj2)
   {
       String s1= obj1.toString();
       String s2= obj2.toString();
       int l1=s1.length();
       int l2=s2.length();
       if (l1<l2)
           return -1;
       else if (l1>l2)
           return +1;
       else
           return s1.compareTo(s2);
   }
}
