package com.bridgelabz.datastructure;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program balance the paranthesis of a given Expression
 */

public class Paranthesis {

	private int top;
	private int size;
	private int[] stack;
	
	public Paranthesis(int size) {
		top= -1;
		this.size = size;
		stack = new int[this.size];
		
	}
	
	//Pushing Data in Stack
	public boolean push(int item) {
		if(!isFull()) {
			top++;
			stack[top] = item;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//Pop Data from Stack
	public int pop() {

		return stack[top--];
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	public boolean isFull() {
		
		return top == stack.length-1;
	}
	
	public static void main(String[] args) {
		
		Paranthesis p = new Paranthesis(12);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the expression: ");
		String str = scanner.next();
		
		//Convert the Expression into character Array
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			switch(ch[i]) {
			case '{':
				p.push('{');
				break;
				
			case '(':
				p.push('(');
				break;
				
			case '[':
				p.push('[');
				break;
				
			case '}':
				p.pop();
				break;
				
			case ')':
				p.pop();
				break;
				
			case ']':
				p.pop();
				break;
			}
			
		}
		
		if(p.isEmpty()) {
			System.out.println("The Expression "+ str +" is Balanced");
		}
		else {
			System.out.println("The Expression "+ str +" is Not Balanced");
		}
		
		}

	}
