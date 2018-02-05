package org.indranil.learning.topicwise.Multithreading;

import java.io.File;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class FileSearch {
    public static void main(String[] args)
    {
        BasicConfigurator.configure();
        //FileSearch_in_Cdrive finc = new FileSearch_in_Cdrive();
        //Thread t1 = new Thread(finc);
        FileSearch_in_Fdrive finf = new FileSearch_in_Fdrive();
        Thread t2 = new Thread(finf);
        //t1.start();
        t2.start();      
    }           
}

class FileSearch_in_Cdrive implements Runnable
{
    @Override
    public void run()
    {
       File f = new File("C:\\");
       FileSearchUtility fsu = new FileSearchUtility();
       fsu.checkInsidefiles(f);   
    }
}
class FileSearch_in_Fdrive implements Runnable
{
    @Override
    public void run()
    {
       File f = new File("F:\\");
       FileSearchUtility fsu = new FileSearchUtility();
        fsu.checkInsidefiles(f);   
    }
}

class FileSearchUtility
{
    static Logger log = Logger.getLogger("File Search Program");
    void checkInsidefiles(File x) {
         if(x.listFiles()!=null)
        {
        displaytheFileList(x);
        File[] y =  x.listFiles();
        for(File w:y)
        {
            if(w.isDirectory())
            {
                checkInsidefiles(w);
            }
        }
        }
        else
        {
           log.debug("I am not able to access (Permission denied): "+x); 
        }
    }  
    void displaytheFileList(File f) {
       /*System.out.println("==============================================");
       System.out.println("Files under " +f.getName()+" are");
       System.out.println("==============================================");
               */
            File [] s = f.listFiles();       
            for(File f1:s)
            {
                if(f1.getName().toUpperCase().contains("wav".toUpperCase()))
                {
                    log.info("File found .... "+f1.getAbsolutePath());
                }
            }
        }
}
