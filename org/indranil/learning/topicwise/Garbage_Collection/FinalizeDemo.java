package org.indranil.learning.topicwise.Garbage_Collection;

public class FinalizeDemo {
    static FinalizeDemo s;
    public static void main(String []args) throws InterruptedException
    {
        FinalizeDemo f = new FinalizeDemo();
        System.out.println(f.hashCode());
        f=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());
        s=null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("End of Main");
    }
    public void finalize()
    {
        System.out.println("finalize method called");
        s=this;
    }
    
}
/*
run:
118352462
finalize method called
118352462
End of Main
BUILD SUCCESSFUL (total time: 15 seconds)
*/
