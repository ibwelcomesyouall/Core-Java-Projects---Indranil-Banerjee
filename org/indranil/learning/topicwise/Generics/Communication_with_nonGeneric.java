package org.indranil.learning.topicwise.Generics;

import java.util.ArrayList;

public class Communication_with_nonGeneric {
    
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();
        l.add("Indranil");
        l.add("Satish");
        m1(l);
        //l.add(10.5); // CE
        System.out.println(l); //[Indranil, Satish, 10, 10.5, true]
    }
    static void m1(ArrayList l)
    {
        l.add(10);
        l.add(10.5);
        l.add(true);
    }
}
