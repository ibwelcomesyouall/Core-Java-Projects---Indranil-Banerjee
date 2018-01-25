package org.indranil.learning.topicwise.JVM_Basics;

public class JVMClassLoaderDemo {
    public static void main(String[]args)
    {
        System.out.println(String.class.getClassLoader());
        System.out.println(JVMClassLoaderDemo.class.getClassLoader());
        System.out.println(Customer.class.getClassLoader());
    }
    
}
class Customer
{
    
}

/*
run:
null
sun.misc.Launcher$AppClassLoader@6d06d69c
BUILD SUCCESSFUL (total time: 1 second)
*/
