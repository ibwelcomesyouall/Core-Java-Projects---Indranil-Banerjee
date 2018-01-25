package org.indranil.learning.topicwise.Multithreading_Enhancement;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Object>
{
   int num;
   MyCallable(int num)
   {
       this.num=num;
   }
   public Object call()throws Exception
   {
       System.out.println(Thread.currentThread().getName()+"is ... responsible to find sum of first"+num+"numbers");
       int sum=0;
       for(int i=1;i<=num;i++)
       {
           sum=sum+i;
       }
       return sum;
   }
}

public class CallableDemo {
    public static void main(String[]args) throws Exception
    {
        MyCallable[] jobs={new MyCallable(10),
            new MyCallable(20),
            new MyCallable(30),
            new MyCallable(40),
            new MyCallable(50),
            new MyCallable(60)};
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(MyCallable job: jobs)
        {
            Future<?> f = service.submit(job);
            System.out.println(f.get());
        }
        service.shutdown();
    }
    
    
}
/*
run:
pool-1-thread-1is ... responsible to find sum of first10numbers
55
pool-1-thread-2is ... responsible to find sum of first20numbers
210
pool-1-thread-3is ... responsible to find sum of first30numbers
465
pool-1-thread-1is ... responsible to find sum of first40numbers
820
pool-1-thread-2is ... responsible to find sum of first50numbers
1275
pool-1-thread-3is ... responsible to find sum of first60numbers
1830
BUILD SUCCESSFUL (total time: 0 seconds)
*/
