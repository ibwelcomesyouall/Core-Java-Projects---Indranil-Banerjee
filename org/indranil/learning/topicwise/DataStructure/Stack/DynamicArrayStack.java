package org.indranil.learning.topicwise.DataStructure.Stack;

public class DynamicArrayStack {
	
	protected int capacity;
	protected int[] stack;
	
	protected int top = -1;
	
	// Default Array capacity
	public static final int CAPACITY = 16;
	public static int MINCAPACITY = 1<<15; // 0000 0000 0000 0001 << 15 = 1000 0000 0000 0000 = 32768
	
	public DynamicArrayStack(int capacity) {
		this.capacity=capacity;
		stack = new int[capacity];
	}
	
	public DynamicArrayStack() {
		this(CAPACITY);
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public void push(int data){
		if(size() == capacity)
			expand();
		stack[++top] = data;
		System.out.println(data + " is pushed");
	}
	
	private void expand() {
		int length = size();
		int[] newstack = new int[length<<1];
		System.arraycopy(stack, 0, newstack, 0, length);
		stack = newstack;
		this.capacity = this.capacity<<1;
		
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
		shrink();
		return data;
	}

	// dynamic array operation: shrinks to 1/2 if more than 3/4 empty
	private void shrink() {
		int length = top +1;
		if(length <= MINCAPACITY || top<<2 >= length)
			return;
		length = length + (top<<1); // still means shrink to at 1/2 or less of the heap
		if(top < MINCAPACITY) 
			length = MINCAPACITY;
		
		int[] newstack = new int[length];
		System.arraycopy(stack, 0, newstack, 0, top+1);
		stack = newstack;
		this.capacity = length;
		
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
		DynamicArrayStack stack = new DynamicArrayStack(); // 10 is the fixed size of the stack
		System.out.println(stack.capacity);
		System.out.println(MINCAPACITY);
		System.out.println(stack.isEmpty());
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
			System.out.println(stack.capacity);
			stack.push(1700);
			stack.push(1800);
			System.out.println("List: "+ stack);
			System.out.println(stack.capacity);
			try {
				stack.pop();
				stack.pop();
				stack.pop();
				System.out.println(stack.capacity);
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				System.out.println(stack.capacity);
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				System.out.println("List: "+ stack);
				stack.pop();
				stack.pop();
				stack.pop();
				System.out.println(stack.capacity);
				System.out.println(stack.capacity);
				//stack.pop();
			System.out.println(stack.capacity);
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("List: "+ stack);
		System.out.println(stack.capacity);
	}

}
