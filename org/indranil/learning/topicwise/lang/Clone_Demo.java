package org.indranil.learning.topicwise.lang;

public class Clone_Demo implements Cloneable {
    int i=88;
    int j=99;
    public static void main(String[]args) throws CloneNotSupportedException
    {
        Clone_Demo c = new Clone_Demo();
        Clone_Demo c1 = (Clone_Demo)c.clone();
        c1.i=999;
        c1.j=888;
        System.out.println(c1.i + "....."+c1.j);//999.....888
    }
    
}
