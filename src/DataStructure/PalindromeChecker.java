package DataStructure;

import UtilityPackage.Utility;

public class PalindromeChecker {
	
	private int size;
	private int rear;
	private int front;
	private int total;
	private char[] queue;
	
	public PalindromeChecker() {
		rear = 0;
		front = 0;
		total = 0;
		size = 10;
		queue = new char[size];
	}
	
	PalindromeChecker(int size) {
		this.size = size;
		rear = 0;
		front = 0;
		total = 0;
		queue = new char[this.size];
	}
	
	public boolean Enqueue(char item) {
		
		if(!isFull()) {
			total++;
			queue[rear] = item;
			rear++;
			return true;
		}
		else {
			return false;
		}

	}
	
	public char Dequeue() {
		
		total--;
		char item = queue[front];
		front++;
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
		String result="";
		System.out.println("Enter the String");
		String Input = utility.readString();
		PalindromeChecker palindrome = new PalindromeChecker();
		
		char[] ch1 = Input.toLowerCase().toCharArray();
		char[] ch2 = new char[ch1.length];
		
		//Enqueue All Element in the Queue
		for (int i = 0; i < ch1.length; i++) {
			palindrome.Enqueue(ch1[i]);
		}
		
		//Dequeue All Element in the Queue and Store it in String variable
		for (int j = 0; j < ch2.length; j++) {
			ch2[j] = palindrome.Dequeue();
			result = ch2[j] + result;
		}
		
		boolean status = Input.equalsIgnoreCase(result);
		
		if(status) {
			System.out.println(status);
		}
		else {
			System.out.println(status);
		}

	}

}
