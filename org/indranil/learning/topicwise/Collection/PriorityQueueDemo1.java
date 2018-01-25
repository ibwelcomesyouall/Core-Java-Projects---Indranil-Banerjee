package org.indranil.learning.topicwise.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[]args)
    {
        PriorityQueue<String> q = new PriorityQueue<String>(15,new MyComparator2());
        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");
        System.out.println(q);//[Z, B, L, A]
    }
}

class MyComparator2 implements Comparator<Object>
{
    public int compare(Object obj1, Object obj2)
    {
        String s1= (String)obj1;
        String s2= obj2.toString();
        return s2.compareTo(s1);
    }
}
