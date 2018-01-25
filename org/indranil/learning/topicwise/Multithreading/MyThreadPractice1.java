package org.indranil.learning.topicwise.Multithreading;

import static java.lang.Thread.*;


class Duplicate1 implements Runnable
{
public void run()
{
    int j=0;
for(int i=0;i<1000;i++)
    {
    try {
        sleep(10);
        j=i;
    } catch (Exception ex) {
        
    }
        
    }
System.out.println(j);
}
}

public class MyThreadPractice1 {
    private static int l;
    public static void main(String[]args) throws InterruptedException
    {   
        Duplicate1 d = new Duplicate1();
        Thread t = new Thread(d);
        t.start();
    for(int k=0;k<1000;k++)
    {
        sleep(10);
        l=k;
    }
    System.out.println(l);
    }
}
/*999
999
BUILD SUCCESSFUL (total time: 31 seconds)

999
999
BUILD SUCCESSFUL (total time: 15 seconds)*/
