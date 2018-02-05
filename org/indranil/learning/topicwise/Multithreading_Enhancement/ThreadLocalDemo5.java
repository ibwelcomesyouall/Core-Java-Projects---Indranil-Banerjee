package org.indranil.learning.topicwise.Multithreading_Enhancement;

class ParentThread2 extends Thread
{
    public static InheritableThreadLocal<Object> tl = new InheritableThreadLocal<Object>()
    {
      public Object childValue(Object p)
      {
          return "CC";
      }
    };
    public void run()
    {
        tl.set("PP");
        System.out.println("Parent Thread Value:"+tl.get());
        ChildThread2 ct = new ChildThread2();
        ct.start();
    }
}
class ChildThread2 extends Thread
{
    public void run()
    {
        System.out.println("Child Thread Value:"+ParentThread2.tl.get());
    }
}
public class ThreadLocalDemo5 {
    public static void main(String[] args)
    {
        ParentThread2 pt = new ParentThread2();
        pt.start();
    }
    
}
/*
run:
Parent Thread Value:PP
Child Thread Value:CC
BUILD SUCCESSFUL (total time: 0 seconds)
In the above program, if we replace InheritableThreadLocal with ThreadLocal and if we are not overriding childValue() method, then the output is
Parent Thread Value:PP
Child Thread Value:null
In the above program, if we are maintaining InheritableThreadLocal and if we are not overriding childValue() method, then the output is
Parent Thread Value:PP
Child Thread Value:PP
*/
