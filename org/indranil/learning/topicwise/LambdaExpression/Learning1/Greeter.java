package org.indranil.learning.topicwise.LambdaExpression.Learning1;

public class Greeter {
    
    public void greet(Greeting greeting){
         greeting.perform();
        }
    public static void main(String[]args)
    {
        Greeter greeter = new Greeter();
        Greeting lambaGreeting = () -> System.out.println("Hello World!");
        Greeting innerClassGreeting = new Greeting(){
          public void perform(){
              System.out.println("Hello World!");
          }  
        };
        greeter.greet(lambaGreeting);
        greeter.greet(innerClassGreeting);
    }
}