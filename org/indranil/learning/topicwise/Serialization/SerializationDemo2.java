package org.indranil.learning.topicwise.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
  String username="Indranil";
  transient String password="Banerjee";
}

public class SerializationDemo2 {
    public static void main(String[]args) throws IOException, ClassNotFoundException
    {
        Account a1 = new Account();
        System.out.println(a1.username+"------"+a1.password);//Indranil------Banerjee
        
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);
        
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Account a2=(Account)ois.readObject();
        System.out.println(a2.username+"------"+a2.password); //Indranil------null       
    }
}
