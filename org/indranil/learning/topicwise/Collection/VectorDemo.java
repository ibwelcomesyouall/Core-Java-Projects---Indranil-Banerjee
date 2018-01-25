package org.indranil.learning.topicwise.Collection;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args)
    {
        Vector<Comparable> v = new Vector<Comparable>();
        System.out.println(v.capacity()); //10
        for(int i=1;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println(v.capacity()); //10
        v.addElement("A");
        System.out.println(v.capacity()); //20
        System.out.println(v); //[1,2,3,4,5,6,7,8,9,10,A]
        System.out.println(v.size()); //11
        v.removeElement(9);
        v.removeElementAt(3);
        v.removeAllElements();
        System.out.println(v); //[]
    }
    
    
}
