package org.indranil.learning.topicwise.Multithreading;

class MyThread2 extends Thread{
    public void run()
    {
        for (int i=0;i<=10;i++)
        {
            System.out.println("Child Thread");
            Thread.yield();
        } 
    }
}
public class ThreadYieldDemo
{
    public static void main (String[] args)
    {
        MyThread2 t=new MyThread2(); // Thread instantiation
        t.start(); //Starting of a thread
        for(int i=0;i<=10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
