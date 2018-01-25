package org.indranil.learning.topicwise.Collection;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[]args) throws InterruptedException
    {
        WeakHashMap<Temp, String> m = new WeakHashMap<Temp, String>();
        Temp t = new Temp();
        m.put(t,"Indranil");
        System.out.println(m); // {temp=Indranil}
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m); // {}
    }   
}

class Temp
{
    public String toString()
    {
        return "temp";
    }
    public void finalize()
    {
        System.out.println("finalize method called"); // finalize method called
    }
}
