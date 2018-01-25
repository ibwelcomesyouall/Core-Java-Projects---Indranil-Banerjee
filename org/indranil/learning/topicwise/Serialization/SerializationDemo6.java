package org.indranil.learning.topicwise.Serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog4 implements Serializable
{
  int dogint=10;
}
class Cat4 implements Serializable
{
  int catint=20;
}
class Rat4 implements Serializable
{
  int ratint=30;
}
public class SerializationDemo6 {
    public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Dog4 d = new Dog4();
        Cat4 c = new Cat4();
        Rat4 r = new Rat4();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        oos.writeObject(c);
        oos.writeObject(r);
        
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Object o;
        while ((o=ois.readObject())!=null)
        {
            System.out.println(o);
            if(o instanceof Dog4)
            {
                Dog4 d1=(Dog4)o;
                System.out.println("Dogint:"+d1.dogint);
            }
            else if(o instanceof Cat4)
            {
                Cat4 c1=(Cat4)o;
                System.out.println("Catint:"+c1.catint);
            }
            else if(o instanceof Rat4)
            {
                Rat4 r1=(Rat4)o;
                System.out.println("Ratint:"+r1.ratint);
            } 
        } 
    }
}
/*
run:
Dogint:10
Catint:20
Ratint:30
Exception in thread "main" java.io.EOFException
	at java.io.ObjectInputStream$BlockDataInputStream.peekByte(ObjectInputStream.java:2626)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1321)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:373)
	at Serialization.SerializationDemo6.main(SerializationDemo6.java:37)
Java Result: 1
BUILD SUCCESSFUL (total time: 1 second)
*/