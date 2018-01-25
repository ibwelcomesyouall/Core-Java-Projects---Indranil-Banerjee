package org.indranil.learning.topicwise.Collection;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable<Object> {
    
    int eid;
    
    Employee(int eid)
    {
        this.eid=eid;
    }
    public String toString()
    {
        return "E-"+eid;
    }
    public int compareTo(Object obj)
    {
        int eid1=this.eid;
        Employee e2= (Employee)obj;
        int eid2=e2.eid;
        if(eid1<eid2)
            return -1;
        else if (eid1>eid2)
            return +1;
        else
            return 0;
    }
}

public class TreeSetDemo6
{
    public static void main(String[]args)
    {
        Employee e1=new Employee(200);
        Employee e2=new Employee(100);
        Employee e3=new Employee(500);
        Employee e4=new Employee(500);
        Employee e5=new Employee(700);
        
        TreeSet<Employee> t1 = new TreeSet<Employee>();
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        
        System.out.println(t1); //[E-100, E-200, E-500, E-700]
        
        TreeSet<Employee> t2 = new TreeSet<Employee>(new myComparatorForTreeSetDemo6());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        
        System.out.println(t2); //[E-700, E-500, E-200, E-100] 
    }
}

class myComparatorForTreeSetDemo6 implements Comparator<Object>
{
    public int compare(Object obj1, Object obj2)
    {
        Employee e1 = (Employee)obj1;
        Employee e2=(Employee)obj2;
        return e2.compareTo(e1);
    }
}

