package com.bridgelabz.sampleprograms;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to 
 */

public class GenericQueue<T extends Object> {
	private int front;
	private int rear;
	private int length;
	private int size;
	private T[] queue;
	
	public GenericQueue() {
		front = 0;
		rear = 0;
		length=0;
		size=50;
		queue = (T[]) new Object[size];
	}
	
	public GenericQueue(int size) {
		front = 0;
		rear = 0;
		length = 0;
		this.size = size;
		queue = (T[]) new Object[this.size];
	}
	
	public boolean enQueue(T item) {
		if(!isFull()) {
			length++;
			queue[rear] = item;
			rear = (rear+1)%size;
			return true;
		}
		else {
			return false;
		}

	}
	
	public int size() {
		
		return length;
	}

	public boolean isFull() {
		if(size == length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public T deQueue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		else {
			length--;
			T element = queue[front];
			front = (front+1)%size;
			return element;
		}
	}

	public boolean isEmpty() {
		if(front == 0 && rear == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void display() {
		
		for (int i = 0; i < length; i++) {
			System.out.println(queue[i]);
		}

	}

	public static void main(String[] args) throws Exception{
		GenericQueue queue = new GenericQueue(12);
		queue.enQueue(20);
		queue.enQueue(10);
		queue.enQueue("Mayuresh");
		queue.enQueue("Hie");
		queue.deQueue();
		queue.display();
		System.out.println(queue.size());
	}

}
