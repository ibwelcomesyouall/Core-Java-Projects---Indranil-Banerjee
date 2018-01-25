package org.indranil.learning.topicwise.RMI_Project.Project1;

import java.rmi.*;
import java.io.*;

public class MyClient{

public static void main(String args[]){
try{

Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");
System.out.println("Welcome to my program!!");
System.out.println("Enter first number:");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a = Integer.parseInt(br.readLine());
System.out.println("Enter second number:");
int b = Integer.parseInt(br.readLine());
System.out.println(stub.add(a,b));

}catch(Exception e){System.out.println(e);}
}

}
