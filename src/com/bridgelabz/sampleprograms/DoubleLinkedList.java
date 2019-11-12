package com.bridgelabz.sampleprograms;

public class DoubleLinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
	public class Node<T>{
		private T value;
		private Node<T> next;
		private Node<T> prev;
	}
	
	public void insertAtBegin(T item) {
		Node<T> node = new Node<T>();
		node.value = item;
		node.next = null;
		node.prev = null;
		
		if(head == null) {
			tail = node;
		}
		else {
			head.prev = node;
		}
		node.next = head;
		head = node;
	}
	
	public void insertAtPosition(T item,int index) {
		Node<T> node = new Node<T>();
		node.value = item;
		node.next = null;
		node.prev = null;

		
	
	}
	
	public void insertAtEnd(T item) {
		Node<T> node = new Node<T>();
		node.value = item;
		node.next = null;
		node.prev = null;
		Node<T> z = head;
		
		if(head == null) {
			head = node;
		}else {
			tail.next = node;
		}
		node.prev = tail;
		tail = node;
	}
	
	public void displayFromHead() {
		Node<T> temp = head;
		
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}

	}
	
	public void displayFromTail() {
		Node<T> temp = tail;
		
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.prev;
		}

	}

	public static void main(String[] args) {
		
		DoubleLinkedList d = new DoubleLinkedList();
		d.insertAtEnd(99); 
		d.insertAtEnd(29);
		d.insertAtEnd(79);
		d.insertAtEnd(49);
		d.insertAtBegin(23);
		d.insertAtBegin(65);
		d.displayFromHead();

	}

}
