package org.indranil.learning.topicwise.Multithreading_Enhancement;

public class ThreadGroupDemo {
    public static void main(String[]args)
    {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
    }
    
}
/*
run:
main
system
BUILD SUCCESSFUL (total time: 0 seconds)
*/
