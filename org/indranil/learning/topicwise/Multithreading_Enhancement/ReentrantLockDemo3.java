package org.indranil.learning.topicwise.Multithreading_Enhancement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread301 extends Thread
{
    static ReentrantLock l = new ReentrantLock();
    MyThread301(String name)
    {
        super(name);
    }
    public void run()
    {
        do
        {
            try {
                if(l.tryLock(5000, TimeUnit.MILLISECONDS))
                {
                    System.out.println(Thread.currentThread().getName()+"... got lock and performing safe operations");
                    try{
                        Thread.sleep(30000);
                    }
                    catch(InterruptedException e) {  }
                    l.unlock();
                    System.out.println(Thread.currentThread().getName()+"... release the lock");
                    break;
                }
                else
                {
                    System.out.println(Thread.currentThread().getName()+"... unable to get lock and will try again");
                }
            } catch (InterruptedException ex) { }
        }
        while(true);
    }
}

public class ReentrantLockDemo3 {
    public static void main(String[]args)
    {
        MyThread301 t1 = new MyThread301("First Thread");
        MyThread301 t2 = new MyThread301("Second Thread");
        t1.start();
        t2.start();
        
    }
    
}
/*
run:
Second Thread... got lock and performing safe operations
First Thread... unable to get lock and will try again
First Thread... unable to get lock and will try again
First Thread... unable to get lock and will try again
First Thread... unable to get lock and will try again
First Thread... unable to get lock and will try again
Second Thread... release the lock
First Thread... got lock and performing safe operations
First Thread... release the lock
BUILD SUCCESSFUL (total time: 1 minute 0 seconds)
*/
