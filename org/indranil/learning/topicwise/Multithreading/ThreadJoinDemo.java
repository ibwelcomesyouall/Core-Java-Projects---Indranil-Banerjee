package org.indranil.learning.topicwise.Multithreading;

class MyThread3 extends Thread{
    public void run()
    {
        for (int i=0;i<=10;i++)
        {
            System.out.println("Child Thread");
            try{
            Thread.sleep(2000);
            } 
            catch (InterruptedException e) {}
        } 
    }
}
public class ThreadJoinDemo 
{
    public static void main (String[] args)throws InterruptedException
    {
        MyThread3 t=new MyThread3();
        t.start();
        // t.join(); This will wait for child thread to complete.
        t.join(10000); //This will wait for child thread for 10000 millisecond and then will continue.
        for(int i=0;i<=10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
