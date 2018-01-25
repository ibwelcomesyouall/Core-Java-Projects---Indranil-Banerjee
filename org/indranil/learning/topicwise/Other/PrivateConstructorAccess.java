
package org.indranil.learning.topicwise.Other;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateConstructorAccess {
    
    public static void main(String[]args) throws ClassNotFoundException,InstantiationException,IllegalAccessException,InvocationTargetException
    {
     //Test_withPrivateConstructor pt = new Test_withPrivateConstructor(); //Not possible as the constructor is private.   
        Class<?> c=Class.forName("learning.Test_withPrivateConstructor");
        Constructor<?> con[]=c.getDeclaredConstructors();
        con[0].setAccessible(true);
        con[0].newInstance(true);
                
    }
    
}
