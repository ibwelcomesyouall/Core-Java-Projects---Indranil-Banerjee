package org.indranil.learning.topicwise.LambdaExpression.Learning1;
public class Test {
    
    MyLambdaAdd addLambda= (a, b) -> a+b;
    
    public static void main(String[]args)
    {
        Test t = new Test();
        System.out.println(t.addLambda.foo(3, 5));
        
    }
    
}

interface MyLambdaAdd
{
    int foo(int a, int b);
}
