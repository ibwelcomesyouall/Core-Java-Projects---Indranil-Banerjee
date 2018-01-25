package org.indranil.learning.topicwise.lang;

public class BooleanClassDemo {
    public static void main(String[]args)
    {
        Boolean X = new Boolean("yes");
        Boolean Y = new Boolean("no");
        System.out.println(X);
        System.out.println(Y);
        System.out.println(X.equals(Y));
    }
}
/*run:
false
false
true
BUILD SUCCESSFUL (total time: 2 seconds)
*/