package com.bridgelabz.stockandqueues;

public class Queue {
	private int [] queue;
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	public Queue(int size) {
		super();
		this.queue = new int[size];
		this.front = 0;
		this.rear = -1;
		this.capacity = size;
	}
	
	public void enQueue (int data){
		if(isFull()) {
			System.out.println("overflow");
			return;
		}
		System.out.println("inserting into queue");
		rear = (rear + 1)%capacity;
		queue[rear] = data;
		count++;	
	}

	private boolean isFull() {
		
		return size() == capacity;
	}

	private int size() {
		return count;
	}
	
	public void show() {
		System.out.println("Elements: ");
		for (int i:queue) {
			System.out.print(i);
		}
	}
}
