package demo;

import java.util.Scanner;

public class CashCounter {

	private int size;
	private int rear;
	private int front;
	private int total;
	private int[] queue;
	
	public CashCounter() {
		rear = 0;
		front = 0;
		total = 0;
		queue = new int[10];
	}
	
	CashCounter(int size) {
		this.size = size;
		rear = 0;
		front = 0;
		total = 0;
		queue = new int[this.size];
	}
	
	public boolean Enqueue(int item) {
		
		if(!isFull()) {
			total++;
			queue[rear] = item;
			rear = (rear + 1) % size;
			return true;
		}
		else {
			return false;
		}

	}
	
	public int Dequeue() {
		
		total--;
		int item = queue[front];
		front = (front + 1) % size;
		return item;
	}
	
	public boolean isEmpty() {
		if(rear == 0 && front ==0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean isFull() {
		if(size == total) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CashCounter cc = new CashCounter(4);
		int arr[] = new int[cc.size];
		int money=0,withdraw=0,deposit=0,c=0;
		System.out.println("Enter the Money of the people in queue:");
		
		
		for (int i = 1; i <= cc.size; i++) {
			
			money = sc.nextInt();
			
			cc.Enqueue(arr[i]);
			System.out.println("Person "+i+" Choose 1. for Withdraw or 2. for Deposit The Money");
			c = sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("Enter the Money in Rs. to Withdraw from your bank");
				withdraw = sc.nextInt();
				if(money < withdraw) {
					System.out.println("Money Exceed the Main balance");
				}
				else {
					money = money - withdraw;
				}
				
			case 2:
				System.out.println("Enter the Money in Rs. to Deposit in your bank");
				deposit = sc.nextInt();
			
				money = money + deposit;
			}
			System.out.println("The total amount of "+i+" Person is: "+ money);
			cc.Dequeue();
		}

	}

}
