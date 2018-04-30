package org.indranil.learning.topicwise.DataStructure.Queue;

public class DynamicArrayQueue {
	
	private int[] queue;
	private int size, front, rear;
	
	// Default Queue Size
	private static int CAPACITY = 16;
	public static int MINCAPACITY = 1<<15;
	
	public DynamicArrayQueue() {
		queue = new int[CAPACITY];
		size=0;
		front=0; 
		rear=0;
	}
	
	public DynamicArrayQueue(int capacity) {
		queue = new int[capacity];
		size=0;
		front=0; 
		rear=0;
	}
	
	public void enQueue(int data) throws NullPointerException, IllegalStateException {
		if(size == CAPACITY)
			expand();
		else {
			size++;
			queue[rear] = data;
			rear = (rear+1)%CAPACITY;
		}
	}
	
	public int deQueue() throws IllegalStateException {
		if(size == 0)
			throw new IllegalStateException("Queue is empty: Underflow");
		else {
			size--;
			int data = queue[front%CAPACITY];
			queue[front]= Integer.MIN_VALUE;
			front = (front+1)%CAPACITY;
			shrink();
			return data;
		}
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return size == CAPACITY;
	}
	
	public int size() {
		return size;
	}
	
	private void expand() {
		int length = size();
		int[] newQueue = new int[length<<1];
		
		for(int i=front; i<rear;i++)
			newQueue[i-front] = queue[i%CAPACITY];
		queue = newQueue;
		front=0;
		rear=size-1;
		CAPACITY *=2;
	}
	
	private void shrink() {
		int length = size;
		if(length <= MINCAPACITY || length<<2 >= length)
			return;
		if(length < MINCAPACITY)
			length = MINCAPACITY;
		
		int[] newQueue = new int[length];
		System.arraycopy(queue, 0, newQueue, 0, length +1);
		queue = newQueue;
					
	}
	
	@Override
	public String toString() {
		String result = "[";
		for(int i=0;i< size;i++) {
			result += Integer.toString(queue[(front+i)% CAPACITY]);
			if(i < size -1)
				result +=",";
		}
		result +="]";
		return result;
	}
	
	public static void main(String[] args) {
		DynamicArrayQueue queue = new DynamicArrayQueue();
		queue.enQueue(100);
		queue.enQueue(200);
		queue.enQueue(300);
		queue.enQueue(400);
		queue.enQueue(500);
		queue.enQueue(600);
		queue.enQueue(700);
		queue.enQueue(800);
		queue.enQueue(900);
		queue.enQueue(1000);
		queue.enQueue(1100);
		queue.enQueue(1200);
		queue.enQueue(1300);
		System.out.println(queue);
		queue.deQueue();
		System.out.println(queue);
		queue.enQueue(1400);
		queue.enQueue(1500);
		queue.enQueue(1600);
		queue.enQueue(1700);
		System.out.println(queue);
		queue.enQueue(1800); // break here
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		System.out.println(queue);	
		
	}

}
