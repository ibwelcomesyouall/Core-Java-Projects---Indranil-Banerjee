package org.indranil.learning.topicwise.Multithreading_Enhancement;

import java.util.concurrent.locks.ReentrantLock;

class MyThread300 extends Thread
{
    static ReentrantLock l = new ReentrantLock();
    MyThread300(String name)
    {
        super(name);
    }
    public void run()
    {
        if(l.tryLock())
        {
            System.out.println(Thread.currentThread().getName()+"... got lock and performing safe operations");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e) {  }
            l.unlock();
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+"... unable to get lock and hence performing alternative operations");
        }
    }
}

public class ReentrantLockDemo2 {
    public static void main(String[]args)
    {
        MyThread300 t1 = new MyThread300("First Thread");
        MyThread300 t2 = new MyThread300("Second Thread");
        t1.start();
        t2.start();
        
    }
    
}
/*
run:
Second Thread... unable to get lock and hence performing alternative operations
First Thread... got lock and performing safe operations
BUILD SUCCESSFUL (total time: 2 seconds)
*/
