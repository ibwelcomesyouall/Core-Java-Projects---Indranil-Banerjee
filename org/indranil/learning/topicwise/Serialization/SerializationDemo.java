package org.indranil.learning.topicwise.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
   int i=10;
   int j =20;
}
public class SerializationDemo {
    public static void main(String[]args) throws IOException, ClassNotFoundException
    {
        Dog d1 = new Dog();
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();
        System.out.println(d1.i+ "------"+d2.j);//10------20
        
        
    }
}
