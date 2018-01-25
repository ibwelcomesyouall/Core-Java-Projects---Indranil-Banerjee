package org.indranil.learning.topicwise.Multithreading_Enhancement;

class ParentThread extends Thread
{
    public static ThreadLocal<String> tl = new ThreadLocal<String>();
    public void run()
    {
        tl.set("PP");
        System.out.println("Parent Thread Value:"+tl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}
class ChildThread extends Thread
{
    public void run()
    {
        System.out.println("Child Thread Value:"+ParentThread.tl.get());
    }
}
public class ThreadLocalDemo3 {
    public static void main(String[] args)
    {
        ParentThread pt = new ParentThread();
        pt.start();
    }
    
}
/*
run:
Parent Thread Value:PP
Child Thread Value:null
BUILD SUCCESSFUL (total time: 0 seconds)
*/
