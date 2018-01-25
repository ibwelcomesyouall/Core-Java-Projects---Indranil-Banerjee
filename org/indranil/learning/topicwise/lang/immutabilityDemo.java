package org.indranil.learning.topicwise.lang;

final public class immutabilityDemo {
    
    private int i;

    immutabilityDemo(int i) {
        this.i=i;
    }
    public immutabilityDemo modify(int i)
    {
     if(this.i==i)
     {
         return this;
     }
     else
     {
         return (new immutabilityDemo(i));
     }
    } 
    public static void main(String[]args)
    {
        immutabilityDemo t1 = new immutabilityDemo(10);
        immutabilityDemo t2 = t1.modify(100);
        immutabilityDemo t3 = t1.modify(10);
        System.out.println(t1==t2); //false
        System.out.println(t1==t3); //true
    }
}

//Once we create a Test object, we can't perform any change in the existing object. if we are trying to perform any change and if there is a change in the content
//then with those changes a new object will be created and if there is no change in the content then exiting object will be reused.
