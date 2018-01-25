package org.indranil.learning.topicwise.lang;

public class HashCode_Demo2 {
    
    int i;

    public HashCode_Demo2(int i) {
        this.i = i;
    }
    public int hashCode()
    {
        return i;
    }
    public String toString()
    {
        return i+" ";
    }
    
    public static void main(String[]args)
    {
        HashCode_Demo2 h = new HashCode_Demo2(10);
        HashCode_Demo2 h1 = new HashCode_Demo2(100);
        System.out.println(h);//10
        System.out.println(h1);//100
    }
        
}
