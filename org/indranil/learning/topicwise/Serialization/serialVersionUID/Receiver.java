package org.indranil.learning.topicwise.Serialization.serialVersionUID;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver {
    public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();
        System.out.println(d2.i+ "------"+d2.j);
    }
    
}

/*
If we don't use serialVersionUID explicitly and change the class file after Serialization, then we will get the below error:

Exception in thread "main" java.io.InvalidClassException: Serialization.serialVersionUID.Dog; local class incompatible: stream classdesc serialVersionUID = 4674011629354704740, local class serialVersionUID = 3672920839428086852
	at java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:616)
	at java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:1630)
	at java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1521)
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:1781)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1353)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:373)
	at Serialization.serialVersionUID.Receiver.main(Receiver.java:13)
Java Result: 1
BUILD SUCCESSFUL (total time: 1 second)
*/
