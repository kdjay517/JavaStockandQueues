package com.bridgelabz.stockandqueues;

public class Operations {
	
	Stock sq = new Stock(3);
	public void push() {
		sq.push(70);
		sq.push(30);
		sq.push(56);
		sq.show();
	}
	
	public void pop() {
		Stock sq = new Stock(3);
		sq.push(70);
		sq.push(30);
		sq.push(56);
		sq.show();
		System.out.println("\npoped element is:"+sq.pop());
		sq.show();
	}
	
	public void peek() {
		Stock sq = new Stock(2);
		sq.push(70);
		sq.push(30);
		sq.show();
		System.out.println("\npeek element is:"+sq.peek());
		System.out.println("\npoped element is:"+sq.pop());
		sq.show();
	}
	
	public void enQueueOfQueue() {
		Queue qe = new Queue(3);
		qe.enQueue(70);
		qe.enQueue(30);
		qe.enQueue(56);
		qe.show();
	}

}
