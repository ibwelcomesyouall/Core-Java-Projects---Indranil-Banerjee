package org.indranil.learning.topicwise.Multithreading_Enhancement;

public class ThreadLocalDemo {
    public static void main(String[]args)
    {
        ThreadLocal<String> tl = new ThreadLocal<String>();
        System.out.println(tl.get());
        tl.set("indranil");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());
    }
    
}
/*run:
null
indranil
null
BUILD SUCCESSFUL (total time: 3 seconds)
*/
