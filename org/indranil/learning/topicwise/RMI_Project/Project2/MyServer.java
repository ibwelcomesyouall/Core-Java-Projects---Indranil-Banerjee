package org.indranil.learning.topicwise.RMI_Project.Project2;
import java.rmi.*;
public class MyServer{
public static void main(String args[])throws Exception{
Remote r=new BankImpl();
Naming.rebind("rmi://localhost:6666/javatpoint",r);
}}