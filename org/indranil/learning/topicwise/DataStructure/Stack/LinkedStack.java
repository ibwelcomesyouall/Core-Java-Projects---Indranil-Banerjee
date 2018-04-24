package org.indranil.learning.topicwise.DataStructure.Stack;

class StackNode{
	private int data;
	private StackNode next;
	
	public StackNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public StackNode getNext() {
		return next;
	}

	public void setNext(StackNode next) {
		this.next = next;
	}	
}

public class LinkedStack {
	private int length;
	private StackNode top;
	
	public LinkedStack() {
		length = 0;
		top = null;
	}
	
	public void push(int data) {
		StackNode temp = new StackNode(data);
		temp.setNext(top);
		top = temp;
		length ++;
		System.out.println(data + " is pushed");
	}
	
	public int pop() throws Exception{
		if(isEmpty())
			throw new Exception("Stack is empty !!");
		int result = top.getData();
		top = top.getNext();
		length--;
		System.out.println(result + " is poped");
		return result;
	}
	
	public int peek() throws Exception{
		if(isEmpty())
			throw new Exception("Stack is empty !!");
		return top.getData();
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int size() {
		return length;
	}
	
	@Override
	public String toString() {
		String result ="[";
		StackNode current = top;
		while(current != null) {
			result = result + current.getData()+",";
			current = current.getNext();
		}
		return result + "]";
	}
	
	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
			stack.push(100);
			stack.push(200);
			stack.push(300);
			stack.push(400);
			stack.push(500);
			stack.push(600);
			stack.push(700);
			stack.push(800);
			stack.push(900);
			stack.push(1000);
			stack.push(1100); 
			stack.push(1200);
			stack.push(1300);
			stack.push(1400);
			stack.push(1500);
			stack.push(1600);
			System.out.println("List: "+ stack);
			stack.push(1700);
			stack.push(1800);
			System.out.println("List: "+ stack);
			try {
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				System.out.println("List: "+ stack);
				stack.pop();
				stack.pop();
				stack.pop();
				//stack.pop();
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("List: "+ stack);
	}
}
