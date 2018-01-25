package org.indranil.learning.topicwise.Collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args)
    {
        TreeMap<Integer, Comparable> m = new TreeMap<Integer, Comparable>();
        m.put(100,"zzz");
        m.put(103,"yyy");
        m.put(101,"xxx");
        m.put(104,106);
        m.put(107,null);
        //m.put("FFFF","XXX");//java.lang.ClassCastException
        //m.put(null,"XXX");//java.lang.NullPointerException
        System.out.println(m);//{100=zzz, 101=xxx, 103=yyy, 104=106, 107=null}
    }  
}
