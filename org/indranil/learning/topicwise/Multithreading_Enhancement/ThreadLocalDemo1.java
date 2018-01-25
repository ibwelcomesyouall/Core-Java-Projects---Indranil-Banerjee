package org.indranil.learning.topicwise.Multithreading_Enhancement;
//Overriding of initialValue() method
public class ThreadLocalDemo1 {
    public static void main(String[]args)
    {
        ThreadLocal tl = new ThreadLocal()
        {
            public Object initialValue()
            {
                return "abc";
            }
        };
        System.out.println(tl.get());
        tl.set("indranil");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());
    }
    
}
/*
run:
abc
indranil
abc
BUILD SUCCESSFUL (total time: 0 seconds)
*/
