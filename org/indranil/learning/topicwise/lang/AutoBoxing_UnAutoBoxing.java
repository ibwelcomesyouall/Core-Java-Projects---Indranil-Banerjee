package org.indranil.learning.topicwise.lang;

public class AutoBoxing_UnAutoBoxing {
    static Integer I=10; //AutoBoxing
    public static void main(String[]args)
    {
        int i=I; //AutoUnBoxing
        m1(i); //AutoBoxing
    }
    public static void m1(Integer K)
    {
        //int m=K; //AutoUnBoxing
        System.out.println(K);
    }
}

// It is valid in 1.5 but invalid in 1.4 version

//10