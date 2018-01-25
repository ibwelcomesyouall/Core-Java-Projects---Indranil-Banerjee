package org.indranil.learning.topicwise.lang;

public class toString_Demo {
    String name;
    int age;
    toString_Demo(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return name+"..."+age;
    }
    public static void main(String[]args)
    {
        toString_Demo ts = new toString_Demo("Indranil", 28);
        toString_Demo ts1 = new toString_Demo("Shawnik", 28);
        System.out.println(ts);
        System.out.println(ts.toString());
        System.out.println(ts1);
    }
    
    
}
/*
run:
Indranil...28
Indranil...28
Shawnik...28
BUILD SUCCESSFUL (total time: 1 second)
*/