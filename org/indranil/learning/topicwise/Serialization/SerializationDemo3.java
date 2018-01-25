package org.indranil.learning.topicwise.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account1 implements Serializable
{
  String username="Indranil";
  transient String password="Banerjee";
  //ObjectInputStream ois;
  private void writeObject(ObjectOutputStream oos) throws Exception
  {
      oos.defaultWriteObject();
      String epwd = "123"+password;
      oos.writeObject(epwd);
  }
  private void readObject(ObjectInputStream ois) throws Exception
  {
      ois.defaultReadObject();
      String epwd = (String)ois.readObject();
      password=epwd.substring(3);
      
  }
}

public class SerializationDemo3 {
    public static void main(String[]args) throws IOException, ClassNotFoundException
    {
        Account1 a1 = new Account1();
        System.out.println(a1.username+"------"+a1.password);//Indranil------Banerjee
        
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);
        
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Account1 a2=(Account1)ois.readObject();
        System.out.println(a2.username+"------"+a2.password); //Indranil------Banerjee     
    }
}
