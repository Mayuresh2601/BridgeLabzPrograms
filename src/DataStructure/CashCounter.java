package DataStructure;

import java.util.Scanner;

import UtilityPackage.Utility;



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
		
		Utility utility = new Utility();
		System.out.println("Enter the Number of People In Queue:");
		int num = utility.readInteger();
		
		CashCounter cc = new CashCounter(num);
		
		int people[] = new int[cc.size];
		int balance[] = new int[cc.size];
		
		int money=0,withdraw=0,deposit=0,c=0;
		
		System.out.println("Enter the Money of the people in queue:");
		//Define the Money of Each Person in Queue
		for (int i = 0; i < cc.size; i++) {
			money = utility.readInteger();
			people[i] = money;
			cc.Enqueue(people[i]);
		}
		
		//Traverse till the end of Queue
		for (int i = 0; i < cc.size; i++) {
			
			do {  //If Person Choose Invalid choice He can try the Process Again
				System.out.println("Person "+(i+1)+": Choose 1 for Withdraw or 2 for Deposit The Money");
				c = utility.readInteger();
				switch(c) {
				case 1:
					do {  //If In case Insufficient amount in balance then person can try another amount
						System.out.println("Enter the Money in Rs. to Withdraw from your bank");
						withdraw = utility.readInteger();
						if(people[i] < withdraw) {
							System.out.println("You have Insufficient Balance in your account. Please Try Again ");
						}
						else {
							people[i] = people[i] - withdraw;
							System.out.println("After withdraw the total amount of "+(i+1)+" Person is: "+ people[i]);
							System.out.println();
						}
					}
					while(people[i] < withdraw);
				
					balance[i] = people[i];
					break;
				
				case 2:
					System.out.println("Enter the Money in Rs. to Deposit in your bank");
					deposit = utility.readInteger();
			
					people[i] = people[i] + deposit;
					System.out.println("After Deposit the total amount of "+(i+1)+" Person is: "+ people[i]);
					balance[i] = people[i];
					System.out.println();
					break;
				
				default: 
					System.out.println("Invalid Choice.. Please Enter the Valid Choice");
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