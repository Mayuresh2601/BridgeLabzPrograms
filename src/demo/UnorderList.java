package demo;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class UnorderList {
	private Node head;
	
	public class Node{
		private int value;
		private Node next;
	}
	
	public void insertLast(int item) {
		Node node = new Node();
		node.value = item;
		node.next = null;
		Node z = head;
		
		if(head == null) {
			head = node;
		}
		else {
			while(z.next != null) {
				z = z.next;
			}
			z.next = node;
		}
	}
	
	public void DeleteFirst() {
		Node z = head;
		Node temp = null;
		
		head = z.next;
	}
	
	public void display() {
		Node z = head;
		while(z.next != null) {
			System.out.println(z.value);
			z = z.next;
		}
		System.out.println(z.value);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
//		Iterator li = new Iterator();
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		String ch[] = str.split("x");
		System.out.println("Enter the word to search:");
		String word = sc.next();
		
		for (String string : ch) {
			if(str.contains(word)) {
				al.remove(word);
			}
			else {
				al.add(string);
			}
		}
		
		
		
		
		
//		UnorderList uo = new UnorderList();
//		uo.insertLast(23);
//		uo.insertLast(26);
//		uo.insertLast(65);
//		uo.insertLast(78);
//		uo.DeleteFirst();
//		uo.display();
	}

}
