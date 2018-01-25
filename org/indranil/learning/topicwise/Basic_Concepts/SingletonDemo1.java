package org.indranil.learning.topicwise.Basic_Concepts;

public class SingletonDemo1 {
    
    private static SingletonDemo1 s = null;
    static int count=0;
    {
        count++;
    }
    private SingletonDemo1()
            {
                
            }
    public static SingletonDemo1 getSingletonDemo()
    {
        if(s==null)
        {
            s=new SingletonDemo1();
        }
            return s;
    }
    
    public static void main(String[]args)
    {
        SingletonDemo1 s= SingletonDemo1.getSingletonDemo();
        SingletonDemo1 s1= SingletonDemo1.getSingletonDemo();
        
        System.out.println(count); // O/P is 1 
    }
    
}
