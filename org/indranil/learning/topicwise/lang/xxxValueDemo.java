package org.indranil.learning.topicwise.lang;

public class xxxValueDemo {
    public static void main(String[]args)
    {
        Integer i = new Integer(130);
        Character ch = new Character('a');
        Boolean b = new Boolean("Indranil");
        System.out.println(i.byteValue());
        System.out.println(i.shortValue());
        System.out.println(i.intValue());
        System.out.println(i.longValue());
        System.out.println(i.floatValue());
        System.out.println(i.doubleValue());
        System.out.println(ch.charValue());
        System.out.println(b.booleanValue());
        
    }
    
}
/*run:
-126
130
130
130
130.0
130.0
a
false
BUILD SUCCESSFUL (total time: 2 seconds)
*/