package DataStructure;

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
		System.out.println("Enter the Number of People In Queue:");
		int num = sc.nextInt();
		CashCounter cc = new CashCounter(num);
		int people[] = new int[cc.size];
		int balance[] = new int[cc.size];
		int money=0,withdraw=0,deposit=0,c=0;
		
		System.out.println("Enter the Money of the people in queue:");
		for (int i = 0; i < cc.size; i++) {
			money = sc.nextInt();
			people[i] = money;
			cc.Enqueue(people[i]);
		}
		
		for (int i = 0; i < cc.size; i++) {
			do {
				System.out.println("Person "+(i+1)+": Choose 1 for Withdraw or 2 for Deposit The Money");
				c = sc.nextInt();
				switch(c) {
				case 1:
					do {
						System.out.println("Enter the Money in Rs. to Withdraw from your bank");
						withdraw = sc.nextInt();
						if(people[i] < withdraw) {
							System.out.println("You have Insufficient Balance in your account. Please Try Again ");
						}
						else {
							people[i] = people[i] - withdraw;
							System.out.println("After withdraw the total amount of "+(i+1)+" Person is: "+ people[i]);
						}
					}
					while(people[i] < withdraw);
				
					balance[i] = people[i];
					break;
				
				case 2:
					System.out.println("Enter the Money in Rs. to Deposit in your bank");
					deposit = sc.nextInt();
			
					people[i] = people[i] + deposit;
					System.out.println("After Deposit the total amount of "+(i+1)+" Person is: "+ people[i]);
					balance[i] = people[i];
					break;
				
				default: 
					System.out.println("invalid Choice..");
					break;
				}
			}
			while (c >= 3 || c <=0);
			
			cc.Dequeue();
		}
		for (int i = 0; i < balance.length; i++) {
			System.out.println("Balance of Person "+(i+1)+" is: "+balance[i]);
		}

	}

}
