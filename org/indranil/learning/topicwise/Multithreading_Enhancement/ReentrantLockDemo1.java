package org.indranil.learning.topicwise.Multithreading_Enhancement;

import java.util.concurrent.locks.ReentrantLock;

/*class Display
{
    public synchronized void wish(String name)
    {
        for(int i=0;i<10;i++)
        {
            System.out.print("Good Morning: ");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e) {  }
            System.out.println(name);
        }
    }
}
################## used synchronized ####################
*/
/*
################## used ReentrantLock in place of synchronized ####################
*/
class Display
{
    ReentrantLock l = new ReentrantLock();
    public void wish(String name)
    {
        l.lock(); //------> 1
        for(int i=0;i<10;i++)
        {
            System.out.print("Good Morning: ");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e) {  }
            System.out.println(name);
        }
        l.unlock(); //------> 2
    }
}

class MyThread204 extends Thread
{
    Display d;
    String name;
    MyThread204(Display d, String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
    
}
public class ReentrantLockDemo1 {
    
    public static void main(String[]args)
    {
        Display d = new Display();
        MyThread204 t1 = new MyThread204(d,"Dhoni");
        MyThread204 t2 = new MyThread204(d,"Yuvraj");
        t1.start();
        t2.start();
    }
    
}

/*
run:
Good Morning: Dhoni
Good Morning: Dhoni
Good Morning: Dhoni
Good Morning: Dhoni
Good Morning: Dhoni
Good Morning: Dhoni
Good Morning: Dhoni
Good Morning: Dhoni
Good Morning: Dhoni
Good Morning: Dhoni
Good Morning: Yuvraj
Good Morning: Yuvraj
Good Morning: Yuvraj
Good Morning: Yuvraj
Good Morning: Yuvraj
Good Morning: Yuvraj
Good Morning: Yuvraj
Good Morning: Yuvraj
Good Morning: Yuvraj
Good Morning: Yuvraj
BUILD SUCCESSFUL (total time: 40 seconds

If we comment line 1 and 2, then the threads will execute simultaneously and we will get irregular output, if we are not commenting lnes 1 and 2, then 
the threads will  be executed one by one and we will get regular output.
*/
