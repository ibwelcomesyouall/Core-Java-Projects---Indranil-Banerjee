package org.indranil.learning.topicwise.lang;

public class HashCodeDemo1 {
    public static void main(String[]args)
    {
        StringBuffer sb1 = new StringBuffer("Indranil");
        StringBuffer sb2 = new StringBuffer("Indranil");
        System.out.println(sb1.equals(sb2)); //false
        System.out.println(sb1.hashCode());//118352462
        System.out.println(sb2.hashCode());//1550089733
    }
    
}
/* In StringBuffer .equals() method is not overriden for content comparision and hence hashCode() method is also not overriden 
*/