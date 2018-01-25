package org.indranil.learning.topicwise.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog3 implements Serializable
{
  int dogint=10;
}
class Cat3 implements Serializable
{
  int catint=20;
}
class Rat3 implements Serializable
{
  int ratint=30;
}
public class SerializationDemo5 {
    public static void main(String[]args) throws IOException, ClassNotFoundException
    {
        Dog3 d = new Dog3();
        Cat3 c = new Cat3();
        Rat3 r = new Rat3();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        oos.writeObject(c);
        oos.writeObject(r);
        
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Dog3 d1=(Dog3)ois.readObject();
        Cat3 c1=(Cat3)ois.readObject();
        Rat3 r1=(Rat3)ois.readObject();
        System.out.println("Dogint:"+d1.dogint+" Catint:"+c1.catint+" Ratint:"+r1.ratint);
             
    }
}

