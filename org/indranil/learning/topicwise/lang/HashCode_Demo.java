package org.indranil.learning.topicwise.lang;

public class HashCode_Demo {
    
    int i;

    public HashCode_Demo(int i) {
        this.i = i;
    }
    
    public static void main(String[]args)
    {
        HashCode_Demo h = new HashCode_Demo(10);
        HashCode_Demo h1 = new HashCode_Demo(100);
        System.out.println(h);//lang.HashCode_Demo@70dea4e
        System.out.println(h1);//lang.HashCode_Demo@5c647e05
    }
        
}
