package org.indranil.learning.topicwise.Multithreading_Enhancement;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[]args)
    {
    ReentrantLock l = new ReentrantLock();
    l.lock();
    l.lock();
    System.out.println(l.isLocked());
    System.out.println(l.isHeldByCurrentThread());
    System.out.println(l.getQueueLength());
    l.unlock();
    System.out.println(l.getHoldCount());
    System.out.println(l.isLocked());
    l.unlock();
    System.out.println(l.isLocked());
    System.out.println(l.isFair());
    }   
}
/*
run:
true
true
0
1
true
false
false
BUILD SUCCESSFUL (total time: 1 second)
*/
