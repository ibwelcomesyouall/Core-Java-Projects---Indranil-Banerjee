package org.indranil.learning.topicwise.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable
{
  Cat c = new Cat();
}
class Cat implements Serializable
{
  Rat r = new Rat();
}
class Rat implements Serializable
{
  int j=20;
}
public class SerializationDemo1 {
    public static void main(String[]args) throws IOException, ClassNotFoundException
    {
        Dog1 d = new Dog1();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Dog1 d1=(Dog1)ois.readObject();
        System.out.println(d1.c.r.j);//20        
    }
}
/* In the above program whenever we are Serailizing a Dog object 
automatically Cat and Rat objects will be Serilized because these
are the part of object graph of Dog.

Among Dog,Cat and Rat if aleast one class is not Serializable
then we will get 
Run-time Exception: java.io.NotSerializableException. */
