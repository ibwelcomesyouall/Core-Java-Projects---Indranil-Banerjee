package org.indranil.learning.topicwise.DataStructure.stack_problems;
import java.util.Scanner;

class Student implements DataType
{
	private int rollno;
	private String name;
	private float marks;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public void traverseStrategy() {
		System.out.println("Roll No : "+this.rollno+" Name : "+this.name+" Marks : "+this.marks);
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Stack stack = new Stack();
		int choice=0,ichoice=2;
		do
		{
			System.out.print("1.Push\n2.Pop\n3.Traverse\n4.Exit\nEnter your Choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				do {
					Student item = new Student();
					System.out.println("Please Enter Student Details : ");
					System.out.print("Roll No : ");
					item.setRollno(sc.nextInt());
					System.out.print("Name : ");
					item.setName(sc.next());
					System.out.print("Marks : ");
					item.setMarks(sc.nextFloat());
					stack.push(item);
					System.out.println("Do you want to insert more student details (0 for No /1 for Yes)? ");
					ichoice=sc.nextInt();
					}
				while(ichoice==1);
				break;	
			case 2: 
				stack.pop();
				break;
			case 3: 
				stack.traverse();			
			
			}	
		}
		while(choice!=4);
		sc.close();
	}
	
}