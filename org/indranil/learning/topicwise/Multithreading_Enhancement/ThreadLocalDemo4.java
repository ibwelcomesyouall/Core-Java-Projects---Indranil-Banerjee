package org.indranil.learning.topicwise.Multithreading_Enhancement;

class ParentThread1 extends Thread
{
    public static InheritableThreadLocal<String> tl = new InheritableThreadLocal<String>();
    public void run()
    {
        tl.set("PP");
        System.out.println("Parent Thread Value:"+tl.get());
        ChildThread1 ct = new ChildThread1();
        ct.start();
    }
}
class ChildThread1 extends Thread
{
    public void run()
    {
        System.out.println("Child Thread Value:"+ParentThread1.tl.get());
    }
}
public class ThreadLocalDemo4 {
    public static void main(String[] args)
    {
        ParentThread1 pt = new ParentThread1();
        pt.start();
    }
    
}
/*
run:
Parent Thread Value:PP
Child Thread Value:PP
BUILD SUCCESSFUL (total time: 0 seconds)
*/
