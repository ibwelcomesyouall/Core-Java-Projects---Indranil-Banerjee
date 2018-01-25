package org.indranil.learning.topicwise.LambdaExpression.Learning1;

public class TypeInferenceExample {
    public static void main(String[]args)
    {
       StringLengthLamba myLambda = s -> s.length();
       System.out.println(myLambda.getLength("Hello Lambda"));
    }
}

interface StringLengthLamba{
    int getLength(String s);
}
