package org.indranil.learning.topicwise.Multithreading;

/* Here child thread calls join method on main thread object, 
hence child has to wait to wait until the completion of the main thread.
*/

class MyThread4 extends Thread{
    static Thread mt;
    public void run() 
    {
        try{
            mt.join();
        }
        catch (InterruptedException e){}
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
public class ThreadJoinDemo1
{
    public static void main (String[] args)throws InterruptedException
    {
        MyThread4.mt = Thread.currentThread();
        MyThread4 t=new MyThread4();
        t.start();
        for(int i=0;i<=10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
