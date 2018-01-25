
package org.indranil.learning.topicwise.Multithreading_Enhancement;

class MyThread extends Thread
{
    MyThread(ThreadGroup g, String name)
    {
        super(g,name);
    }
    public void run()
    {
        System.out.println("Child Thread");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){ }
    }
}

public class ThreadGroupDemo3 {
    public static void main(String[] args) throws InterruptedException
    {
        ThreadGroup pg = new ThreadGroup("Parent Group");
        ThreadGroup cg = new ThreadGroup(pg,"Child Group");
        MyThread t1 = new MyThread(pg,"Child Thread1");
        MyThread t2 = new MyThread(pg,"Child Thread2");
        t1.start();
        t2.start();
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
        Thread.sleep(10000);
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
    }
    
}
/*
run:
2
Child Thread
Child Thread
1
java.lang.ThreadGroup[name=Parent Group,maxpri=10]
    Thread[Child Thread1,5,Parent Group]
    Thread[Child Thread2,5,Parent Group]
    java.lang.ThreadGroup[name=Child Group,maxpri=10]
0
1
java.lang.ThreadGroup[name=Parent Group,maxpri=10]
    java.lang.ThreadGroup[name=Child Group,maxpri=10]
BUILD SUCCESSFUL (total time: 10 seconds)
*/
