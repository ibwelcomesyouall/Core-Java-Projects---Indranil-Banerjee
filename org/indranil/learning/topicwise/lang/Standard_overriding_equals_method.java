package org.indranil.learning.topicwise.lang;

public class Standard_overriding_equals_method {
    String name;
    int rollno;

    public Standard_overriding_equals_method(String name, int rollno) {
        this.name=name;
        this.rollno=rollno;
    }
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        if(obj instanceof Overriding_equals_method1)
            {
                Overriding_equals_method1 s = (Overriding_equals_method1)obj;
                if(name.equals(s.name) && rollno==s.rollno)
                {
                return true;
                }
            else
            {
                return false;
            }
            }
            return false;
    }
    public static void main(String[]args)
    {
        Standard_overriding_equals_method s1 = new Standard_overriding_equals_method("Indranil",101);
        Standard_overriding_equals_method s2 = new Standard_overriding_equals_method("Satish",102);
        Standard_overriding_equals_method s3 = new Standard_overriding_equals_method("Indranil",101);
        Standard_overriding_equals_method s4 = s1;
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //true
        System.out.println(s1.equals("Indranil"));//false
        System.out.println(s1.equals(null)); //false
    }
    
}

//Simplified code
