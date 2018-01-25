package org.indranil.learning.topicwise.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<=10;i++)
        {
            l.add(i);
        }
        System.out.println(l); //[0,1,2,3,4,5,6,7,8,9,10]
        Iterator<Integer> itr = l.iterator();
        while(itr.hasNext())
        {
            Integer i = (Integer)itr.next();
            if(i%2==0) //0 2 4 6 8 10
            {
                System.out.println(i);
            }
            else
            {
                itr.remove();
            }
        }
        System.out.println(l); //[0,2,4,6,8,10]
    }
    
}
