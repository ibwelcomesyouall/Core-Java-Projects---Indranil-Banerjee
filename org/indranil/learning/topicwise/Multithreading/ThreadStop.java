package org.indranil.learning.topicwise.Multithreading;
class MyThreadStop extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e) { }
        }
    }
}
public class ThreadStop {
    public static void main(String[]args)
    {
        MyThreadStop t = new MyThreadStop();
        t.start();
        System.out.println("End of Main Thread");
        t.stop();
    }
    
}
/*run:
End of Main Thread
Child Thread
BUILD SUCCESSFUL (total time: 2 seconds)
*/
