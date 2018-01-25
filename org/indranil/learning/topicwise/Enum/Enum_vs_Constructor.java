package org.indranil.learning.topicwise.Enum;

enum FISH {
    STAR,GUPPY,GOLD;
    FISH()
    {
     System.out.println("constructor");   
    }
}

public class Enum_vs_Constructor
{
    public static void main(String[]args)
    {
        FISH f = FISH.GOLD;
        System.out.println("ENUM MAIN METHOD");
    }
    
}
/*
O/p:
constructor
constructor
constructor
ENUM MAIN METHOD
*/
