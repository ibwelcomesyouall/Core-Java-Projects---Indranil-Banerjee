package org.indranil.learning.topicwise.lang;

class A
{
    int j;

    public A(int j) {
        this.j=j;
    }
    
}

public class Shallow_Cloning_Demo implements Cloneable {
    int i=10;
    A a;
    public static void main(String[]args) throws CloneNotSupportedException
    {
        A a = new A(20);
        Shallow_Cloning_Demo c = new Shallow_Cloning_Demo(a,10);
        Shallow_Cloning_Demo c1 = (Shallow_Cloning_Demo)c.clone();
        c1.i=999;
        c1.a.j=888;
        System.out.println(c.i + "....."+c.a.j);//10.....888
    }
    public Object clone() throws CloneNotSupportedException
            {
                return super.clone();
            }

    public Shallow_Cloning_Demo(A a, int i) {
        this.a=a;
        this.i=i;
    }
    
}
