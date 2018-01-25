package org.indranil.learning.topicwise.Multithreading;

class MyThread1 extends Thread
{
   @Override
   public void run()
   {
       System.out.println(Thread.currentThread().getThreadGroup());
   }
}

public class MultithreadingDemo2 {
    public static void main(String[]args)
    {
        System.out.println(Thread.currentThread().getName());
        MyThread1 t=new MyThread1();
        t.start();
        int a = t.getPriority();
        t.setPriority(10);
        System.out.println(t.getName());
        t.setName("Indranil");
        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(a);
        System.out.println(t.getThreadGroup());
        
         
    }
}
