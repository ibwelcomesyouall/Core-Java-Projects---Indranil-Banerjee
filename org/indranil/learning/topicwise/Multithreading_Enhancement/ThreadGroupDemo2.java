
package org.indranil.learning.topicwise.Multithreading_Enhancement;

public class ThreadGroupDemo2 {
    public static void main(String[] args)
    {
        ThreadGroup g = new ThreadGroup("tg");
        Thread t1 = new Thread(g,"First Thread");
        Thread t2 = new Thread(g,"Second Thread");
        g.setMaxPriority(3);
        Thread t3 = new Thread(g,"Third Thread");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
    }
    
}
/*
run:
5
5
3
BUILD SUCCESSFUL (total time: 0 seconds)
*/
