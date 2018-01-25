package org.indranil.learning.topicwise.Garbage_Collection;

import java.util.Date;

public class Runtime_GC_Demo {
    public static void main(String[]args)
    {
       Runtime r = Runtime.getRuntime();
       System.out.println(r.totalMemory());
       System.out.println(r.freeMemory());
       for(int i=0; i<10000;i++)
       {
           Date d = new Date();
           d=null;
       }
       System.out.println(r.freeMemory());
       r.gc();
       System.out.println(r.freeMemory());
    }
    
}
/*
run:
64487424
63480592
63415144
64167192
BUILD SUCCESSFUL (total time: 2 seconds)
*/
