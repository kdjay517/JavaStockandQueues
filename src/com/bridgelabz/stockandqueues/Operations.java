package com.bridgelabz.stockandqueues;

public class Operations {
	
	StockAndQueues sq = new StockAndQueues(3);
	public void push() {
		sq.push(70);
		sq.push(30);
		sq.push(56);
		sq.show();
	}
	
	public void pop() {
		StockAndQueues sq = new StockAndQueues(3);
		sq.push(70);
		sq.push(30);
		sq.push(56);
		sq.show();
		System.out.println("\npoped element is:"+sq.pop());
		sq.show();
	}
	
	public void peek() {
		StockAndQueues sq = new StockAndQueues(2);
		sq.push(70);
		sq.push(30);
		sq.show();
		System.out.println("\npeek element is:"+sq.peek());
		System.out.println("\npoped element is:"+sq.pop());
		sq.show();
	}

}
