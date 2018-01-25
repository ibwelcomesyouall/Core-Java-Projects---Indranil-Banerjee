package org.indranil.learning.topicwise.Basic_Concepts;

/**
 * This program is to illustrate all the operator avaliable in Java
 * 
 */
public class Learning {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c,d;
        long e;
        boolean f=true;
        System.out.println("Uniary opeartor Demo");
        c=-b;
        d=+(-a);
        System.out.println("The value of c:"+c+"\nThe value of d:" +d);
        System.out.println("My answer: The value of c:-20\nThe value of d:-10");
        a=a++;
        b=--b;
        System.out.println("The value of a:"+a+"\nThe value of b:" +b);
        System.out.println("My answer: The value of a:10\nThe value of b:19");
        e=a;
        System.out.println("The value of e:" +e);
        System.out.println("My answer: The value of e: 10");
        c=(int)e;
        System.out.println("The value of c after explicit type casting:" +c);
        System.out.println(" My answer: The value of c after explicit type casting: 10");
        c=~a;
        System.out.println("The value of c:" +c);
        System.out.println("My answer: The value of c: 4");
        System.out.println("The value of f after using !:" +!f);
        System.out.println("My answer: The value of f after using !: false");
        c=a&b;
        System.out.println("The value of c:" +c);
        c=a|b;
        System.out.println("The value of c:" +c);
        c=a^b;
        System.out.println("The value of c:" +c);
        d=a>>3;
        System.out.println("The value of d:" +d);
        d=b<<6;
        System.out.println("The value of d:" +d);
        d=a>>>3;
        System.out.println("The value of d:" +d);
    }
    
}
