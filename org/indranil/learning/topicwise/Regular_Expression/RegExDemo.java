package org.indranil.learning.topicwise.Regular_Expression;
import java.util.regex.*;
/* public static Pattern compile(String re)
 * public Matcher matcher (String target)
 * boolean find()
 * int start()
 * int end (): return end+1 index of the match
 * String group()
 * Pattern & Matcher classes present in java.util.regex package and introduced in Java 1.4 version
 * Character classes below:
 * [abc] => Either 'a' or 'b' or 'c'
 * [^abc] => Except 'a' and 'b' and 'c'
 * [a-z] => Any lower case alphabet symbol from a to z
 * [A-Z] => Any upper case alphabet symbol from A to Z
 * [a-zA-Z] => Any alphabet symbol
 * [0-9] => Any digit from 0 to 9
 * [0-9a-zA-Z] => Any alphanumeric symbol
 * [^0-9a-zA-Z] => Except alphanumeric characters i.e. special character
 * Predefined Character classes below:
 * \s => To search for space characters
 * \S => Except space character
 * \d => Any digit from o to 9; alternative for [0-9]
 * \D => Except digit any character; alternative for [^0-9]
 * \w => Any word character [0-9a-zA-Z]
 * \W => Except word characters i.e. special characters
 * . => Any characters
 * Quantifiers below:
 * a+ => Atleast one 'a'
 * a* => Any number of a's including zero number
 * a? => Atmost one 'a'
 * Short form of mobile number validation:
 * [7-9][0-9]{9} instead of [789][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
 * 0?[7-9][0-9]{9} or (0|91)?[7-9][0-9]{9} to represent 10 or 11 or 12 digit valids mobile numbers.
 * Reg Ex for valid e-mail id
 * [0-9a-zA-Z][0-9a-zA-Z_.]*@[0-9a-zA-Z]+([.][a-zA-Z]+)+
*/

public class RegExDemo {
    public static void main(String[]args)
    {
        int count=0;
        
        //Pattern p = Pattern.compile("ab"); // simple regex Demo
        Pattern p = Pattern.compile("[ab\\s]");// Using Character classes
        Matcher m = p.matcher("abbabbba ");
        Pattern p1 = Pattern.compile("\\s");
        String s[] = p1.split("Indranil Banerjee");
        String ph = "9199454193923";
        while (m.find())
        {
          count++;
          System.out.println("Found the pattern \n Start Index: " + m.start()+"End Index: " + m.end()+ "Pattern matched: " + m.group());
        }
        System.out.println("Total number of occurance:" + count);
        for (String s1:s)
        {
            System.out.println(s1);
        }
        
        // Program to check if the mobile number provided is valis or not
        Pattern p2 = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m1 = p2.matcher(ph);
        if (m1.find() && m1.group().equals(ph))
        {
            System.out.println("Valid mobile number");
        }
        else
            System.out.println("Invalid mobile number");
    }
    
}
