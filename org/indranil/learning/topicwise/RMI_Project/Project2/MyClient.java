package org.indranil.learning.topicwise.RMI_Project.Project2;
import java.util.*;
import java.rmi.*;
public class MyClient{
public static void main(String args[])throws Exception{
Bank b=(Bank)Naming.lookup("rmi://localhost:6666/javatpoint");

List<Customer> list=b.getCustomers();
for(Customer c:list){
System.out.println(c.getAcc_no()+" "+c.getFirstname()+" "+c.getLastname()+" "+c.getEmail()+" "+c.getAmount());
}

}}