package org.indranil.learning.topicwise.Multithreading_Enhancement;

class CustomerThread extends Thread
{
    static Integer custId=0;
    private static ThreadLocal<?> tl = new ThreadLocal<Object>()
    {
      protected Integer initialValue()
      {
          return ++custId;
      }
    };
    CustomerThread(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" executing with customer id:"+tl.get());
    }
}

public class ThreadLocalDemo2 {
    public static void main(String[]args)
    {
        CustomerThread c1 = new CustomerThread("Customer Thread-1");
        CustomerThread c2 = new CustomerThread("Customer Thread-2");
        CustomerThread c3 = new CustomerThread("Customer Thread-3");
        CustomerThread c4 = new CustomerThread("Customer Thread-4");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
    
}
/*
run:
Customer Thread-1 executing with customer id:1
Customer Thread-3 executing with customer id:3
Customer Thread-2 executing with customer id:2
Customer Thread-4 executing with customer id:4
BUILD SUCCESSFUL (total time: 0 seconds)
In the above program for every customer thread a seperate customer id will be maintained by thread local object.
*/

