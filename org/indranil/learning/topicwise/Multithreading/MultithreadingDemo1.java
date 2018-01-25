package org.indranil.learning.topicwise.Multithreading;

class MyRunnable implements Runnable
{
    public void run()
    {
        for (int i=0;i<=10;i++)
        {
         System.out.println("child method");
        }
    }
}

public class MultithreadingDemo1 {
    public static void main(String[]args)
    {
        MyRunnable r= new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<=10;i++)
        {
            System.out.println("Main Method");
        }
    }
}
