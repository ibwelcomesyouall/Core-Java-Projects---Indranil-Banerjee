package org.indranil.learning.topicwise.lang;

class A1
{
    int j;

    public A1(int j) {
        this.j=j;
    }
    
}

public class Deep_Cloning_Demo implements Cloneable {
    int i=10;
    A1 a;
    public static void main(String[]args) throws CloneNotSupportedException
    {
        A1 a = new A1(20);
        Deep_Cloning_Demo c = new Deep_Cloning_Demo(a,10);
        Deep_Cloning_Demo c1 = (Deep_Cloning_Demo)c.clone();
        c1.i=999;
        c1.a.j=888;
        System.out.println(c.i + "....."+c.a.j);//10.....20
    }
    public Object clone() throws CloneNotSupportedException
            {
                A1 a1 = new A1(a.j);
                Deep_Cloning_Demo d2 = new Deep_Cloning_Demo(a1,i);
                return d2;
            }

    public Deep_Cloning_Demo(A1 a, int i) {
        this.a=a;
        this.i=i;
    }
    
}
