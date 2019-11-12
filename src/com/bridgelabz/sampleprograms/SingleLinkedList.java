package com.bridgelabz.sampleprograms;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Create a Generic Single Linked List
 */

public class SingleLinkedList<T> {
	
	public Node<T> head;
	
	public class Node<T> {
		
		private T value;
		private Node next;

	}
	
	public void insertAtBegin(T item) {
		
		Node<T> node = new Node<T>();
		node.value = item;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
	}
	
	public void insertAtPosition(T item,int index) {
		Node<T> node = new Node<T>();
		node.value = item;
		node.next = null;
		Node<T> z = head;
		
		if(head == null) {
			head = node;
		}
		else {
			if(index == 1) {
				insertAtBegin(item);
			}
			else {
			
				for (int i = 1; i < index-1; i++) {
					z =z.next;
				}
				node.next = z.next;
				z.next = node;
			}
		}
	}
	
	public void insertAtEnd(T item) {
		Node<T> node = new Node<T>();
		node.value = item;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			Node<T> z = head;
			while (z.next != null) {
				z = z.next;
			}
			z.next = node;
		}
	}
	
	public void deleteAtBegin() {
		Node<T> current = head;
		head = current.next;
	}
	
	public void deleteAtPosition(int index) {
		Node<T> previous = head;
		Node<T> temp;
		for (int i = 1; i < index-1; i++) {
			previous = previous.next;
		}
		temp = previous.next;
		previous.next = temp.next;
		
	}
	
	public void deleteAtMid() {
		Node<T> z = head;
		int count = 0;
		
		while (z.next != null) {
			count++;
			z = z.next;
		}
		int mid = count/2;
		z = head;
		Node<T> temp;
		for (int i = 1; i < mid; i++) {
			z = z.next;
		}
		temp = z.next;
		z.next = temp.next;

	}
	
	public void deleteAtEnd() {
		Node<T> z = head;
		
		while (z.next.next != null) {
			z = z.next;
		}
		z.next = null;
	}
	
	public void display() {
		
		Node<T> z = head;
		
		while (z != null) {
			System.out.println(z.value);
			z = z.next;
		}

	}

	public static void main(String[] args) {
		
		SingleLinkedList s = new SingleLinkedList();
		s.insertAtBegin("ss");
		s.insertAtEnd(75);
		s.insertAtBegin(12);
		s.insertAtEnd('A');
		s.insertAtBegin(1);
		s.insertAtPosition(99, 3);
		s.insertAtPosition(42, 1);
		s.deleteAtEnd();
		s.deleteAtBegin();
		s.deleteAtMid();
		s.deleteAtMid();
		s.deleteAtMid();
		
		s.display();

	}

}
