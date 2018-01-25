package org.indranil.learning.topicwise.Other;
import java.lang.reflect.*;
public class FindMethod {
    
    public static void main(String [] args) throws Exception
    {
        Class<?> c = Class.forName("java.lang.Object");
        Method[] m=c.getDeclaredMethods();
        for (Method m1:m)
        {
            System.out.println(m1.getName());
        }
    }
    
}
