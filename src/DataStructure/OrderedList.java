package DataStructure;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import UtilityPackage.Utility;

public class OrderedList{
	
	Node head = null;
		
	public class Node{
		int value;
		Node next;
			
		Node(int item){
			this.value = item;
			this.next = head;
			head = this;
		}
	}
		
	public void add(int item) {
		new Node(item); 
	}
		
	public void remove(int item) {
		Node current = head;
		Node temp = null;
		
		if(current != null && current.value == item) {
			head = current.next;
			return;
		}
		
		while (current != null && current.value != item) {
			temp = current;
			current = current.next;
		}
		
		if(temp == null) {
			return;
		}
		temp.next = current.next;
	}
	
	public void sortList(Node head) {
		
		int temp;
		
		for (Node z = head; z!=null; z = z.next) {
			for (Node y = z.next; y != null; y = y.next) {
				if (z.value > y.value) {
					temp = z.value;
					z.value = y.value;
					y.value = temp;
				}
			}
		}
	}
		
	
	public boolean search(Node head,int key) {	
	Node z = head;		
		while (z != null) {
			if(z.value == (key)) {
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
			System.out.print(z.value + "  ");
		}
	}

	public static void main(String[] args) throws IOException {
		
		OrderedList o = new OrderedList();
		Utility utility = new Utility();
		String Path = "/home/admin1/Desktop/Integer.txt";
		File file = new File(Path);
		Scanner scanner = new Scanner(new File(Path));
		
		while (scanner.hasNext()) {
			o.add(scanner.nextInt());
		}
		
		System.out.println("Before Swapping");
		o.display();
		System.out.println();
		System.out.println("After Swapping");
		o.sortList(o.head);
		o.display();
		System.out.println();
		
		System.out.println("Enter The Number to search in list");
		int key = utility.readInteger();
		
		boolean status = o.search(o.head,key);
		
		if(status == true) {
			System.out.println("Element Present");
			o.remove(key);
			o.display();
			System.out.println();
			System.out.println("Element Deleted Successfully...");
		}
		else {
			System.out.println("Element Not Present");
			o.add(key);
			o.sortList(o.head);
			o.display();
			System.out.println();
			System.out.println("Element Inserted Successfully...");
		}
	}

}