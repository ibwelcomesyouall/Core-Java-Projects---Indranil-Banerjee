package org.indranil.learning.topicwise.Basic_Concepts;

public class SingletonDemo {
    
    private static SingletonDemo s = new SingletonDemo();
    static int count=0;
    {
        count++;
    }
    private SingletonDemo()
            {
                
            }
    public static SingletonDemo getSingletonDemo()
    {
        return s;
    }
    
    public static void main(String[]args)
    {
        SingletonDemo s= SingletonDemo.getSingletonDemo();
        SingletonDemo s1= SingletonDemo.getSingletonDemo();
        
        System.out.println(count); // O/P is zero as no object is getting created and hence instance block is not called.
    }
    
}
