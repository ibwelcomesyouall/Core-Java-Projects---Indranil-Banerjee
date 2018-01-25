package org.indranil.learning.topicwise.RMI_Project.Project2;
import java.rmi.*;
import java.util.*;
interface Bank extends Remote{
public List<Customer> getCustomers()throws RemoteException;
}