package org.indranil.learning.topicwise.Basic_Concepts;

public class StarDemo implements Cloneable {
    public static void main(String[]args) throws Exception
    {
       StarDemo ob1 = new StarDemo();
       Object ob2 = ob1.clone();
       System.out.println("ok");
    }
}
