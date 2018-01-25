package org.indranil.learning.topicwise.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account2 implements Serializable
{
  String username="Indranil";
  transient String password="Banerjee";
  transient int pin=123456;
  //ObjectInputStream ois;
  private void writeObject(ObjectOutputStream oos) throws Exception
  {
      oos.defaultWriteObject();
      String epwd = "123"+password;
      oos.writeObject(epwd);
      int epin=4444+pin;
      oos.writeInt(pin);
  }
  private void readObject(ObjectInputStream ois) throws Exception
  {
      ois.defaultReadObject();
      String epwd = (String)ois.readObject();
      password=epwd.substring(3);
      int epin= ois.readInt();
      pin=epin-4444;
      
      
  }
}

public class SerializationDemo7 {
    public static void main(String[]args) throws IOException, ClassNotFoundException
    {
        Account2 a1 = new Account2();
        System.out.println(a1.username+"------"+a1.password+"------"+a1.pin);//Indranil------Banerjee------123456
        
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);
        
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Account2 a2=(Account2)ois.readObject();
        System.out.println(a2.username+"------"+a2.password+"------"+a1.pin); //Indranil------Banerjee------123456   
    }
}
