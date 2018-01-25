package org.indranil.learning.topicwise.log4jproject;

import org.apache.log4j.*;

public class Test {
    
    static{
        BasicConfigurator.configure();
    }
    static Logger log = Logger.getLogger("Test");
    public static void main(String[]args)
    {
        Logger root=Logger.getRootLogger();
        root.setLevel(Level.DEBUG);
        log.info("-Main Method Started-");
        log.debug("Values as CLA:" +args.length);
        for(int i=0;i<2;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        if (args.length==0)
        {
            log.warn("No command line argument Specified");
        }
        log.debug("1st Value in Main:"+args[0]);
        log.debug("2nd Value in Main:"+args[1]);
        log.info("Creating Testing class Object");
        Testing ts = new Testing();
        log.info("Testing Class Object created");
        log.info("Invoking the getRemainder() from Testing");
        int rem= ts.getRemainder(args[0],args[1]);
        System.out.println("Remainder in main:"+rem);
        log.info("-- Main Method Completes --");
        
    }
}
