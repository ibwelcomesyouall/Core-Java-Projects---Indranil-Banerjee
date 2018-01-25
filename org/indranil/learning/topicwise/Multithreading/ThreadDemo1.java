package org.indranil.learning.topicwise.Multithreading;

class MyThreads1 extends Thread
{
    public void run()
    {
            System.out.println("no-arg run");
    }
    public void run(int i)
    {
            System.out.println("int-arg run");
    }
}

public class ThreadDemo1 {
    
    public static void main (String [] args)
    {
        MyThreads1 t = new MyThreads1();
        t.start();
    }
    
}
