package org.indranil.learning.topicwise.lang;

public class Method_Chaining {
    
    public static void main(String[]args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Indranil").append("software").append("solutions").insert(2,"xyz").reverse().delete(2,10);
        System.out.println(sb); //snrawtfoslinardzyxnI
    }
    
}
