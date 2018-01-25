package org.indranil.learning.topicwise.Generics;

import java.util.ArrayList;

public class Generics_is_Compile_Time_Concept {
    
    public static void main(String[]args)
    {
     ArrayList l = new ArrayList();   
     l.add(10);
     l.add(10.5);
     l.add(true);
     System.out.println(l); //[10, 10.5, true]
    }    
}
