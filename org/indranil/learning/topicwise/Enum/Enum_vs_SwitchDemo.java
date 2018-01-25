package org.indranil.learning.topicwise.Enum;

enum Beer1
{
    KF,KO,RC;
}
public class Enum_vs_SwitchDemo {
    public static void main(String[]args)
    {
        Beer1 b = Beer1.KF;
        switch(b)
        {
            case KF:
                System.out.println("It is a children's brand");
                break;
            case KO:
                System.out.println("It is too light");
                break;
            case RC:
                System.out.println("It is not for kick");
                break;
            default:
                System.out.println("Other brand");
                 
        }
    }
    
}

//O/p: It is a children's brand
