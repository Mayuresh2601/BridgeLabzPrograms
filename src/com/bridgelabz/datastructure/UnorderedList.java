package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utilitypackage.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to read from the file and search the element by putting in generic linked list
 * and check the Element is present or not.
 */

public class UnorderedList<T> {
	
 Node head = null;
	
	public class Node{
		 T value;
		 Node next;
		
		Node(T item){
			this.value = item;
			this.next = head;
			head = this;
		}
	}
	
	public void add(T item) {
		new Node(item); 
	}
	
	public void remove(T item) {
		Node z = head;
		
		while (z.next != null) {
			if (z.value == item) {
				
			}
			z = z.next;
		}
		z.next = null;
	}
	
	public boolean search(T key) {
		
		Node z = head;
		
		while (z != null) {
			if(z.value.equals(key)) {
				return true;
			}
			else {
				z = z.next;
			}
		}
		return false;

	}
	
	public void display() {
		
		for (Node z = head; z != null; z=z.next) {
			System.out.println(z.value + "  ");
		}

	}

public static void main(String[] args) throws IOException{
		
		UnorderedList unorder = new UnorderedList();
		Utility utility = new Utility();
		
		//Path of File to read from it
		String Path = "C:\\Users\\Home\\eclipse-workspace\\BridgeLabzProgram\\src\\com\\DataStructure\\String.txt";
		BufferedReader br = new BufferedReader(new FileReader(Path));
		String str="";
		
		//Adding data of file into LinkedList
		while((str = br.readLine())!=null) {
			unorder.add(str);
		}
		
		unorder.display();
		
		System.out.println("Enter the Element to Search in the File: ");
		String key = utility.readString();
	
		boolean  status = unorder.search(key);
		if(status==true) {
			System.out.println("Element is Present");
			
		}
		else {
			System.out.println("Element Not Present");
			
		}
		
	}

}
