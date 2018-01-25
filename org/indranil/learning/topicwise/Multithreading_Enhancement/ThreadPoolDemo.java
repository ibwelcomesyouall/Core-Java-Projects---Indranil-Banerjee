package org.indranil.learning.topicwise.Multithreading_Enhancement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable
{
    String name;
    PrintJob(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println(name+"... Job Started by Thread:"+Thread.currentThread().getName());
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){ }
        System.out.println(name+"... Job completed by Thread:"+Thread.currentThread().getName());
    }
}
public class ThreadPoolDemo {
    public static void main(String[] args)
    {
        PrintJob[] jobs={new PrintJob("durga"),
            new PrintJob("Indranil"),
            new PrintJob("Twinkle"),
            new PrintJob("Ravi"),
            new PrintJob("Satish"),
            new PrintJob("Harsh")};
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(PrintJob job:jobs)
        {
            service.submit(job);
        }
        service.shutdown();
    }
    
}
/*
run:
Twinkle... Job Started by Thread:pool-1-thread-3
durga... Job Started by Thread:pool-1-thread-1
Indranil... Job Started by Thread:pool-1-thread-2
durga... Job completed by Thread:pool-1-thread-1
Indranil... Job completed by Thread:pool-1-thread-2
Twinkle... Job completed by Thread:pool-1-thread-3
Satish... Job Started by Thread:pool-1-thread-1
Ravi... Job Started by Thread:pool-1-thread-2
Harsh... Job Started by Thread:pool-1-thread-3
Satish... Job completed by Thread:pool-1-thread-1
Ravi... Job completed by Thread:pool-1-thread-2
Harsh... Job completed by Thread:pool-1-thread-3
BUILD SUCCESSFUL (total time: 11 seconds)
*/
