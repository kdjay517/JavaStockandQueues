package com.bridgelabz.stockandqueues;

public class StockAndQueues {
	private int [] stock;
	private int top;
	
	public StockAndQueues(int size) {
		super();
		this.stock = new int [size];
		this.top = -1;
	}
	
	public boolean push(int data) {
		if (isFull()) {
			System.out.println("stock is overflow");
			return false;
		}
		stock[++top] = data;
		System.out.println("data is pushed into stack");
		return true;
	}
	
	public boolean isFull() {
		// TODO Auto-generated method stub
		return top >= stock.length-1;
	}

	public int pop () {
		if (isEmpty()) {
			System.out.println("stock is underflow");
			return 0;
		}else {
			int data = stock[top--];
			stock[++top] = 0;
			return data;
		}
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top < 0;
	}
	
	public int size() {
		if(isEmpty()){
			return 0;
		}
		return ++top;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("stock is underflow");
			return 0;
		}
		int data = stock[top];
		return data;
	}
	
	public void show() {
		for(int n: stock) {
			System.out.print(n+" ");
		}
	}

}
