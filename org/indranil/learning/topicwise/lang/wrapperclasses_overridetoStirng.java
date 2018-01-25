package org.indranil.learning.topicwise.lang;

public class wrapperclasses_overridetoStirng {
    
    public String toString()
    {
        return "This is our toString overriding";
    }
    public static void main(String[]args)
    {
        String s = new String("Indranil");
        System.out.println(s);
        Integer i = new Integer(93);
        System.out.println(i);
        wrapperclasses_overridetoStirng w = new wrapperclasses_overridetoStirng();
        System.out.println(w);
    }
    
}
/*run:
Indranil
93
This is our toString overriding
BUILD SUCCESSFUL (total time: 1 second)
*/
