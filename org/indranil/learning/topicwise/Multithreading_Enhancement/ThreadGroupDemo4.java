package org.indranil.learning.topicwise.Multithreading_Enhancement;

public class ThreadGroupDemo4 {
    public static void main(String[]args)
    {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
        Thread[] t = new Thread [system.activeCount()];
        system.enumerate(t);
        for(Thread t1:t)
        {
            System.out.println(t1.getName()+"....."+t1.isDaemon());
        }
    }
    
}
/*
run:
Reference Handler.....true
Finalizer.....true
Signal Dispatcher.....true
Attach Listener.....true
main.....false
BUILD SUCCESSFUL (total time: 2 seconds)
*/
