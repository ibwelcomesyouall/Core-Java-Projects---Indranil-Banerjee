package org.indranil.learning.topicwise.Regular_Expression;
import java.util.StringTokenizer;
/* The deault regular Expression for String Tokenizer is space.
 * StringTokenizer st =new StringTokenizer("target");
 * StringTokenizer st1 =new StringTokenizer("target","delimiter"); 
*/
public class StringTokenizerDemo {
    public static void main (String[] args)
    {
    StringTokenizer st =new StringTokenizer("Indranil Banerjee");
    StringTokenizer st1 =new StringTokenizer("11-11-1989","-");
    while(st.hasMoreTokens())
    {
        System.out.println(st.nextToken());
    }
    while(st1.hasMoreTokens())
    {
        System.out.println(st1.nextToken());
    }
    }
}
