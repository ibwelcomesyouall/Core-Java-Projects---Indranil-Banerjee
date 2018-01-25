package org.indranil.learning.topicwise.Serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable {
    String s;
    int i;
    int j;
    
    ExternalizationDemo(String s, int i, int j)
    {
        this.s=s;
        this.i=i;
        this.j=j;
    }
    public ExternalizationDemo()
    {
        System.out.println("no argument Constructor");
    }
    public void writeExternal(ObjectOutput out) throws IOException
    {
        out.writeObject(s);
        out.writeInt(i);
    }
    
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
    {
       s=(String)in.readObject();
       i=in.readInt();
    }
    
    public static void main(String[]args) throws Exception
    {
        ExternalizationDemo t1 = new ExternalizationDemo("Indranil",10,20);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizationDemo t2 =(ExternalizationDemo)ois.readObject();
        System.out.println(t2.s+"-----"+t2.i+"------"+t2.j);
    } 
}
/*no argument Constructor
Indranil-----10------0
*/
