package org.indranil.learning.topicwise.Multithreading_Enhancement;

public class ThreadGroupDemo1 {
    public static void main(String[]args)
    {
        ThreadGroup g = new ThreadGroup("First Group");
        System.out.println(g.getParent().getName());
        ThreadGroup g1 = new ThreadGroup(g,"Second Group");
        System.out.println(g1.getParent().getName());
    }    
}

/*
run:
main
First Group
BUILD SUCCESSFUL (total time: 0 seconds)
*/
