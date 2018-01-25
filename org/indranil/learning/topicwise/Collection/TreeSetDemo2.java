package org.indranil.learning.topicwise.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args)
    {
        TreeSet<Integer> t = new TreeSet<Integer>(new myComparator());
        t.add(20);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(10);
        System.out.println(t); //[20, 15, 10, 5, 0]
        
    }
    
}

class myComparator implements Comparator<Object>
{
   public int compare(Object obj1, Object obj2)
   {
       Integer i1= (Integer)obj1;
       Integer i2=(Integer)obj2;
       
       if(i1<i2)
            return +100;
       else if(i1>i2)
           return -100;
       else
           return 0;
   }
}
