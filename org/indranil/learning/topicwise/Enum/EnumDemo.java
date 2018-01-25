package org.indranil.learning.topicwise.Enum;

enum Beer
{
    KF,RC,FO;
}

public class EnumDemo {
    public static void main(String[]args)
    {
        Beer b = Beer.RC;
        System.out.println(b); //RC
    }
    
}
//; is optional