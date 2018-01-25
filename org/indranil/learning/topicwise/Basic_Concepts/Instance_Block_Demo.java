package org.indranil.learning.topicwise.Basic_Concepts;

public class Instance_Block_Demo {
    static int count=0;
    {
       count++; 
    }
    Instance_Block_Demo() {
    }
    
    Instance_Block_Demo(int i){
    }
    
    Instance_Block_Demo(double d){
    } 
    
    public static void main(String[]args)
    {
        Instance_Block_Demo i = new Instance_Block_Demo();
        Instance_Block_Demo i1 = new Instance_Block_Demo(10);
        Instance_Block_Demo i2 = new Instance_Block_Demo(10.5);
        System.out.println("The number of objects created: "+count);
    }
    
}
