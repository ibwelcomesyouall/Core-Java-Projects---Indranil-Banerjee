package org.indranil.learning.topicwise.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[]args)
    {
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("Indranil",700);
        m.put("Satish",800);
        m.put("Harsh",1000);
        m.put("Prabhakar",500);
        System.out.println(m); //{Satish=800, Prabhakar=500, Harsh=1000, Indranil=700}
        System.out.println(m.put("Indranil",1000)); //700
        Set<String> s = m.keySet();
        System.out.println(s); // [Satish, Prabhakar, Harsh, Indranil]
        Collection<Integer> c = m.values();
        System.out.println(c); // [800, 500, 1000, 1000]
        Set<?> s1 = m.entrySet();
        Iterator<?> itr = s1.iterator();
        while(itr.hasNext())
        {
            Map.Entry<?, Integer> m1 =(Map.Entry)itr.next();
            System.out.println(m1.getKey()+ "----"+m1.getValue());//Satish----800 Prabhakar----500 Harsh---1000 Indranil----1000
            if(m1.getKey().equals("Prabhakar"))
                m1.setValue(10000);
        }
        System.out.println(m);// {Satish=800, Prabhakar=10000, Harsh=1000, Indranil=1000}
    }
}
