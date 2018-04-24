package org.indranil.learning.topicwise.DataStructure.Stack;

public class FixedSizeArrayStack {
	
	protected int capacity;
	protected int[] stack;
	
	protected int top = -1;
	
	// Default Array capacity
	public static final int CAPACITY = 10;
	
	public FixedSizeArrayStack(int capacity) {
		this.capacity=capacity;
		stack = new int[capacity];
	}
	
	public FixedSizeArrayStack() {
		this(CAPACITY);
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public void push(int data) throws Exception{
		if(size() == capacity)
			throw new Exception("Stack is full !!");
		stack[++top] = data;
		System.out.println(data + " is pushed");
	}
	
	public int top() throws Exception{
		if(isEmpty())
			throw new Exception("Stack is empty !!");
		return stack[top];
	}
	
	public int pop() throws Exception{
		int data;
		if(isEmpty())
			throw new Exception("Stack is empty !!");
		data = stack[top];
		stack[top--] = Integer.MIN_VALUE;
		System.out.println(data + " is poped");
		return data;
	}
	
	@Override
	public String toString() {
		String s = "[";
		if(size() > 0)
			s += stack[0];
		if(size() > 1)
			for(int i = 1; i<= size()-1;i++)
				s += ", " + stack[i];
		return s + "]";
	}
	
		
	public static void main(String[] args){
		FixedSizeArrayStack stack = new FixedSizeArrayStack(); // 10 is the fixed size of the stack
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		try {
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
			System.out.println("Top element now is : " + stack.top());
			//stack.push(1100); // stack will throw exception here
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
			//stack.pop(); // stack with throw exception here
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("List: "+ stack);
	}

}
