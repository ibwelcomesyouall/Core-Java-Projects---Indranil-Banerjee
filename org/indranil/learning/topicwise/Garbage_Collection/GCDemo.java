package org.indranil.learning.topicwise.Garbage_Collection;

public class GCDemo {
    static  int count=0;
    public static void main(String[]args)
    {
        for(int i=0;i<10;i++) // If we keep on increasing this number at certain point memory problem will be raised. Then JVM runs GC.
        {                     // GC calls finalize() method on every object seperately and destroys that object. (change the i value to 1000000 to see the result) 
            GCDemo g = new GCDemo();
            g=null;
        }
    }
    public void finalize()
    {
        System.out.println("Finalize mthod called" + ++count);
    }
}
