package org.indranil.learning.topicwise.LambdaExpression.Learning;

public class Greeter {
    
    public void greet(Greeting greeting){
         greeting.perform();
        }
    public static void main(String[]args)
    {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
        
        MyLambda myLambaFunction = () -> System.out.println("Hello World!");
        MyAdd addFunction = (int a, int b) -> a+b;
    }
}

interface MyLambda
{
    void foo();
}

interface MyAdd
{
    int add(int x,int y);
}