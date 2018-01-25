package org.indranil.learning.topicwise.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchDemo1 {
    public static void main(String[]args)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println(l);//[15, 0, 20, 10, 5]
        Collections.sort(l, new MyComparator3());
        System.out.println(l);//[20, 15, 10, 5, 0]
        System.out.println(Collections.binarySearch(l,10,new MyComparator3())); //2
        System.out.println(Collections.binarySearch(l,13, new MyComparator3())); //-3
        System.out.println(Collections.binarySearch(l,12)); //6
    }
}

class MyComparator3 implements Comparator<Object>{
    public int compare(Object obj1,Object obj2)
    {
        Integer i1 = (Integer)obj1;
        Integer i2= (Integer)obj2;
        return i2.compareTo(i1);
    }
}
