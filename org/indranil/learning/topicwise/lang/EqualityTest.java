package org.indranil.learning.topicwise.lang;

public class EqualityTest {
    public static void main(String[]args)
    {
        String s1= new String ("Indranil");
        String s2= new String ("Indranil");
        StringBuffer sb1= new StringBuffer ("Indranil");
        StringBuffer sb2= new StringBuffer ("Indranil");
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2)); //true
        System.out.println(sb1==sb2); //false
        System.out.println(sb1.equals(sb2));//false
        //System.out.println(s1==sb1); // CE: Incomparable types: String and StringBuffer
        System.out.println(s1.equals(sb1)); //false
    }
    
}
