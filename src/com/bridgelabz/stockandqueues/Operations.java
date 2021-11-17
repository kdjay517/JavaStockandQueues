package com.bridgelabz.stockandqueues;

public class Operations {
	
	StockAndQueues sq = new StockAndQueues(5);
	public void push() {
		sq.push(70);
		sq.push(30);
		sq.push(56);
		sq.show();
	}

}
