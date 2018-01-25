package org.indranil.learning.topicwise.Enum;

enum color
{
    GREEN,RED
            {
        public void info()
        {
            System.out.println("Dangerous color");
        }
    }, BLUE;
    public void info()
    {
        System.out.println("Universal color");
    }
}
public class Enum_Case3 {
    public static void main(String[]args)
    {
        color c [] = color.values();
        for(color c1:c)
        {
            c1.info();
        }
        
    }   
}

/*
O/P:
Universal color
Dangerous color
Universal color
*/

