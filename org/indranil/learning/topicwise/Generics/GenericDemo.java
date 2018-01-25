
package org.indranil.learning.topicwise.Generics;

class Gen<T>
{
    T ob;
    Gen(T ob)
    {
        this.ob=ob;
    }
    public void show()
    {
        System.out.println(ob.getClass().getName());
    }
    public T get()
    {
        return ob;
    }
}

public class GenericDemo {
    public static void main(String[]args)
    {
        Gen<String> g = new Gen<String>("Indranil");
        g.show();
        System.out.println(g.get());
        Gen<Integer> g1 = new Gen<Integer>(10);
        g1.show();
        System.out.println(g1.get());
        Gen<Double> g2 = new Gen<Double>(19.23);
        g2.show();
        System.out.println(g2.get());
    }
    
}
