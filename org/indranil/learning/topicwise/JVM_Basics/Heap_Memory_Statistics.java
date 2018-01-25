package org.indranil.learning.topicwise.JVM_Basics;

public class Heap_Memory_Statistics {
    public static void main(String[]args)
    {
        double mb=1024*1024;
        Runtime r = Runtime.getRuntime();
        System.out.println("Max Memory: "+r.maxMemory()/mb+" MB");
        System.out.println("Initial Memory: "+r.totalMemory()/mb+" MB");
        System.out.println("Free Memory: "+r.freeMemory()/mb+" MB");
        System.out.println("Consumed Memory: "+(r.totalMemory()-r.freeMemory())/mb+" MB");
    }
    
}
/*run:
run:
Max Memory: 892.5 MB
Initial Memory: 61.5 MB
Free Memory: 60.53981018066406 MB
Consumed Memory: 0.9601898193359375 MB
BUILD SUCCESSFUL (total time: 0 seconds)*/
