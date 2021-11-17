package com.bridgelabz.stockandqueues;

public class StockAndQueues {
	private int [] stock;
	private int top;
	
	public StockAndQueues(int size) {
		super();
		this.stock = new int [size];
		this.top = 0;
	}
	
	public void push (int data) {
		stock[top] = data;
		top++;
	}
	
	public void show() {
		for(int n: stock) {
			System.out.println(n+" ");
		}
	}

}
