package org.indranil.learning.topicwise.DataStructure.stack_problems;

import java.util.Scanner;

public class Stack  {
	int size=60;
	int top=-1;
	DataType[] stack = new DataType[size];
	
	boolean stackempty(){
		if(top==-1)//stack empty
			return true;
		else
			return false;
	}
	
	boolean stackfull() {
		if(top >= size-1)//stack full
			return true;
		else
			return false;
	}
	
	void push(DataType item) {
		
		//Step 1: [Check for stack overflow] 
		if(stackfull())
			System.out.println("Stack is overflow");
		else
		{
			//Step 2: [Increment the pointer value by one] 
			top = top + 1;
			//Step 3: [Perform insertion] 
			stack[top]=item;
		}
	}
	
	void pop() {
		DataType item;
		//Step 1: [Check for stack underflow] 
		if (stackempty())
			System.out.println("Stack is underflow");
		else
		{
			//Step 2: [Perform deletion] 
			item = stack[top]; 
			//Step 3: [Decrement the pointer value by one] 
			top = top - 1;
		}
	}
	
	void traverse() {
		if(stackempty())
			System.out.println("Stack is empty");
		else
		{
			System.out.println("Traverse the Element");
			for (int i=top;i>=0;i--)
			{
				if(stack[i]!=null)
				{
					//stack[i];
				}
			}
		}
		
	}
}
	

