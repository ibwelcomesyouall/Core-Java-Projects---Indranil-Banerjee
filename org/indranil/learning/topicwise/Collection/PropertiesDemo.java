package org.indranil.learning.topicwise.Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[]args) throws IOException
    {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("abc.properties");
        p.load(fis);
        System.out.println(p);//{user=scott, password=tiger, Indranil=8888}
        String s = p.getProperty("Indranil");
        System.out.println(s);//8888
        p.setProperty("Satish", "99999");
        FileOutputStream fos = new FileOutputStream("abc.properties");
        p.store(fos,"Updated by Indranil for Properties Demo Class");
    }  
}
