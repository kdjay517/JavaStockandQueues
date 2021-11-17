package com.bridgelabz.stockandqueues;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		 Operations operate = new Operations();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to push the data into stack\n"+"Enter 2 pop operation \n"+
										"Enter 3 for peek of stock");
		switch (scanner.nextInt()) {
		case 1:
			operate.push();
			break;
		case 2:
			operate.pop();
			break;
		case 3:
			operate.peek();
			break;
		}
		scanner.close();
	}

}
