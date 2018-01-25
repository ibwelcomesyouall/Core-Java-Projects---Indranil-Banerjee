package org.indranil.learning.topicwise.Multithreading;

class MyThread7 extends Thread
{
   public void run () 
   {
      for (int i=0;i<10000;i++)
      {
          System.out.println(" I am lazy thread -" +i);
          
      }
          try
          {
              System.out.println("I am entering in the sleeping state");
              Thread.sleep(10000);
          }
          catch (InterruptedException e)
          {
              System.out.println("I got interrupted");
          }
      }
   }

public class ThreadInterruptDemo1 {
    
    public static void main (String [] args)
    {
        MyThread7 t=new MyThread7();
        t.start();
        t.interrupt();
        System.out.println("End of main thread");
    }
}
