package org.indranil.learning.topicwise.lang;

public class Overriding_equals_method {
    String name;
    int rollno;

    public Overriding_equals_method(String name, int rollno) {
        this.name=name;
        this.rollno=rollno;
    }
    public boolean equals(Object obj)
    {
        try{
            //String name1= this.name;
            //int rollno1= this.rollno;
            Overriding_equals_method s = (Overriding_equals_method)obj;
            //String name2= s.name;
            //int rollno2= s.rollno;
            //if(name1.equals(name2)&& rollno1==rollno2)
            if(name.equals(s.name) && rollno==s.rollno)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(ClassCastException e)
        {
            return false;
        }
        catch(NullPointerException e)
        {
            return false;
        }
    }
    public static void main(String[]args)
    {
        Overriding_equals_method s1 = new Overriding_equals_method("Indranil",101);
        Overriding_equals_method s2 = new Overriding_equals_method("Satish",102);
        Overriding_equals_method s3 = new Overriding_equals_method("Indranil",101);
        Overriding_equals_method s4 = s1;
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //true
        System.out.println(s1.equals("Indranil"));//false
        System.out.println(s1.equals(null)); //false
    }
    
}

//Simplified code
