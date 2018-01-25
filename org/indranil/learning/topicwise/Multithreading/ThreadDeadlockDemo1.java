package org.indranil.learning.topicwise.Multithreading;

public class ThreadDeadlockDemo1
{
    public static void main (String[] args)throws InterruptedException
    {
        Thread.currentThread().join();
    }
}
