package org.indranil.learning.topicwise.lang;

public class HashCode_Demo1 {
    
    int i;

    public HashCode_Demo1(int i) {
        this.i = i;
    }
    public int hashCode()
    {
        return i;
    }
    
    public static void main(String[]args)
    {
        HashCode_Demo1 h = new HashCode_Demo1(10);
        HashCode_Demo1 h1 = new HashCode_Demo1(100);
        System.out.println(h);//lang.HashCode_Demo1@a
        System.out.println(h1);//lang.HashCode_Demo1@64
    }
        
}
