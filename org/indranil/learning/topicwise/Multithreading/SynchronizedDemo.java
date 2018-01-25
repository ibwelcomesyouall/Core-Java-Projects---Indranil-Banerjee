package org.indranil.learning.topicwise.Multithreading;

class Display1
{
    public synchronized void displayn()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {}
        }
    }
    public synchronized void displayc()
    {
        for(int i=65;i<=75;i++)
        {
            System.out.print((char)i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {}
        }
    }
}
class MyThread111 extends Thread
{
    Display1 d;
    MyThread111(Display1 d)
    {
        this.d=d;
    }  
    public void run()
    {
        d.displayn();
    }
}
class MyThread222 extends Thread
{
    Display1 d;
    MyThread222(Display1 d)
    {
        this.d=d;
    }
    public void run()
    {
        d.displayc();
    }
}
class SynchronizedDemo
{
    public static void main(String []args)
    {
        Display1 d = new Display1();
        MyThread111 t1 = new MyThread111(d);
        MyThread222 t2 = new MyThread222(d);
        t1.start();
        t2.start();
    }
}