package org.indranil.learning.topicwise.lang;

public class HashCodeDemo {
    public static void main(String[]args)
    {
        String s1 = new String("Indranil");
        String s2 = new String("Indranil");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.hashCode());//188487971
        System.out.println(s2.hashCode());//188487971
    }
    
}

/* In String class .equals() method is overriden  for content comparision and hence hashCode() method is also overriden to generate hashCode based on content
*/