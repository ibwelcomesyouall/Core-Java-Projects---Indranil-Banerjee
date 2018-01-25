package org.indranil.learning.topicwise.Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[]args)
    {
        LinkedList<String> l = new LinkedList<String>();
        l.add("Indranil");
        l.add("Banerjee");
        l.add("Twinkle");
        l.add("Ghosal");
        System.out.println(l); //[Indranil, Banerjee, Twinkle, Ghosal]
        ListIterator<String> ltr = l.listIterator();
        while(ltr.hasNext())
        {
            String s = (String)ltr.next();
            if(s.equals("Banerjee"))
            {
                ltr.remove();
            }
            if(s.equals("Ghosal"))
            {
                ltr.set("Das");
            }
            if(s.equals("Twinkle"))
            {
                ltr.add("John");
            }
        }
         System.out.println(l);// [Indranil, Twinkle, John, Das]
    }
    
}
