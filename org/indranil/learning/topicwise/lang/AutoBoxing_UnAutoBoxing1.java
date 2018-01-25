package org.indranil.learning.topicwise.lang;

public class AutoBoxing_UnAutoBoxing1 {
    static Integer I;
    public static void main(String[]args)
    {
        int i=I;
        System.out.println(i);
    }
    
}
/*run:
Exception in thread "main" java.lang.NullPointerException
	at lang.AutoBoxing_UnAutoBoxing1.main(AutoBoxing_UnAutoBoxing1.java:7)
Java Result: 1
BUILD SUCCESSFUL (total time: 2 seconds)

Note:- On null reference if we are trying to form AutoUnboxing, then we will get Run-time exception saying Null pointer exception
*/