package org.indranil.learning.topicwise.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal
{
    int i=10;
    Animal()
    {
        System.out.println("Animal Constructor called");
    }
}

class Dog2 extends Animal implements Serializable
{
  int j=20;
  Dog2()
  {
      System.out.println("Dog Constructor called");
  }
}
public class SerializationDemo4 {
    public static void main(String[]args) throws IOException, ClassNotFoundException
    {
        Dog2 d = new Dog2();
        d.i=888;
        d.j=999;
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        System.out.println("Deserialization Started");
        
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        
        Dog2 d1= (Dog2)ois.readObject();
        System.out.println(d1.i+"-------"+d1.j);
        
    }
    
}

/*
Animal Constructor called
Dog Constructor called
Deserialization Started
Animal Constructor called
10-------999
*/