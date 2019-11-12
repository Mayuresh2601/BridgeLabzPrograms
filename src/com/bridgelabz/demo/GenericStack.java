package com.bridgelabz.demo;

public class GenericStack<T extends Object> {

	private int size;
	private int top;
	private int length;
	private T[] stack;
	
	public GenericStack() {
		size = 50;
		top = -1;
		length = 0;
		stack = (T[])new Object[size];
	}
	
	public GenericStack(int size) {
		this.size = size;
		top = -1;
		length = 0;
		stack = (T[])new Object[this.size];
	}
	
	public boolean push(T item) {
		if(!isFull()) {
			top++;
			stack[top] = item;
			length++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public T pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		else {
			T element = this.stack[top--];
			length--;
			return element;
		}
	}
	
	public T peek() {
		
		return stack[top];
	}
	
	public boolean isEmpty() {
		
		return top == -1;
	}

	public boolean isFull() {
		
		return (top == stack.length-1);
	}
	
	public int size() {
		
		return length;

	}
	
	public void display() {
		
		for (int i = 0; i < length; i++) {
			System.out.println(stack[i]);
		}

	}

	public static void main(String[] args) throws Exception {
		GenericStack stack = new GenericStack(12);
		stack.push(12);
		stack.push(23);
		stack.push(32);
		stack.push("ad");
		stack.push(13);
		stack.push("weq");
		stack.push('A');
		stack.push("yh");
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Peek Element is: "+stack.peek());
		System.out.println("Size of Stack is: "+ stack.size());
		stack.display();
	}

}
