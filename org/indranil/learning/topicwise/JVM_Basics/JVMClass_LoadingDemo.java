package org.indranil.learning.topicwise.JVM_Basics;

public class JVMClass_LoadingDemo {
    public static void main(String[]args)
    {
        JVMClass_LoadingDemo jld = new JVMClass_LoadingDemo();
        Class<? extends JVMClass_LoadingDemo> c1 = jld.getClass();
        JVMClass_LoadingDemo jld1 = new JVMClass_LoadingDemo();
        Class<? extends JVMClass_LoadingDemo> c2 = jld1.getClass();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1==c2);
    }
    
}
/*run:
1311053135
1311053135
true
BUILD SUCCESSFUL (total time: 1 second)
*/
