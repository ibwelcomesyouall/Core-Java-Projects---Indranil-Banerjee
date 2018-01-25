package org.indranil.learning.topicwise.lang;

public class AutoBoxing_UnAutoBoxing2 {
    public static void main(String[]args)
    {
    Integer x =10;
    Integer y =x;
    x++;
    System.out.println(x);
    System.out.println(y);
    System.out.println(x==y);
    }
    
}
// All wrapper classes are immutable. i.e. once we create wrapper class object, we can't perform any changes in that objects. IF we are trying to perform
// any changes, with those changes a new object will be created.

/*run:
11
10
false
BUILD SUCCESSFUL (total time: 4 seconds)*/