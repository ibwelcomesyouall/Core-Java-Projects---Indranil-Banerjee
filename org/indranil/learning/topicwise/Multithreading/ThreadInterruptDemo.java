package org.indranil.learning.topicwise.Multithreading;

class MyThread6 extends Thread
{
   public void run () 
   {
      
           try
           {
                for (int i=0;i<10;i++)
                {
                    System.out.println("I am a lazy thread");
                    Thread.sleep(2000);
                }
           }
           catch (InterruptedException e)
           {
               System.out.println("I got interrupted");
           }
       }
   }

public class ThreadInterruptDemo {
    
    public static void main (String [] args)
    {
        MyThread6 t=new MyThread6();
        t.start();
        t.interrupt();
        System.out.println("End of main thread");
    }
}
