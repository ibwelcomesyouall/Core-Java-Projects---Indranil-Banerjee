package org.indranil.learning.topicwise.Collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
    public static void main(String[]args)
    {
        int[] a={0,5,20,11,6};
        System.out.println("Primitive Array before sorting");
        for (int a1:a)
        {
            System.out.println(a1);
        }
        Arrays.sort(a);
        System.out.println("Primitive Array after sorting");
        for (int a1:a)
        {
            System.out.println(a1);
        }
        String [] s={"A","Z","B"};
        System.out.println("Object Array before sorting");
        for (String a2:s)
        {
            System.out.println(a2);
        }
        Arrays.sort(s);
        System.out.println("Object Array after sorting");
        for (String a2:s)
        {
            System.out.println(a2);
        }
        Arrays.sort(s,new MyComparator4());
        System.out.println("Object Array after sorting my Comparator");
        for (String a2:s)
        {
            System.out.println(a2);
        }
    } 
}

class MyComparator4 implements Comparator<Object>
{
   public int compare(Object o1, Object o2)
   {
       String s1= o1.toString();
       String s2=o2.toString();
       return s2.compareTo(s1);
   }
}
/*
Primitive Array before sorting
0
5
20
11
6
Primitive Array after sorting
0
5
6
11
20
Object Array before sorting
A
Z
B
Object Array after sorting
A
B
Z
Object Array after sorting my Comparator
Z
B
A
*/