package org.indranil.learning.topicwise.Collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySearchDemo {
    public static void main(String[]args)
    {
        int[] a={0,5,20,11,6};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,6));//2
        System.out.println(Arrays.binarySearch(a,14));//-5
        
        String [] s ={"A","Z","B"};
        Arrays.sort(s);
        System.out.println(Arrays.binarySearch(s,"Z"));//2
        System.out.println(Arrays.binarySearch(s,"S"));//-3
        
        Arrays.sort(s,new MyComparator5());
        System.out.println(Arrays.binarySearch(s,"Z",new MyComparator5()));//0
        System.out.println(Arrays.binarySearch(s,"S",new MyComparator5()));//-2
        System.out.println(Arrays.binarySearch(s,"N"));//-4
    } 
}

class MyComparator5 implements Comparator<Object>
{
   public int compare(Object o1, Object o2)
   {
       String s1= o1.toString();
       String s2=o2.toString();
       return s2.compareTo(s1);
   }
}
