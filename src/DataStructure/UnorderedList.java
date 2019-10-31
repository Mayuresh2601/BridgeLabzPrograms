package DataStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
		
		String Path = "/home/admin1/Desktop/String.txt";
	
		BufferedReader br = new BufferedReader(new FileReader(Path));
		
		String str="";
		while((str = br.readLine())!=null) {
			unorder.add(str);
		}
		
		unorder.display();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Element to Search in the File: ");
		String key = scan.nextLine();
	
		boolean  status = unorder.search(key);
		if(status==true) {
			System.out.println("Element is Present");
			
		}
		else {
			System.out.println("Element Not Present");
			//System.out.println("Adding Element in List: ");
			//unorder.add(key);
			//unorder.display();
		}
		

		//utilityGen.unOrderList(arraylist, key);
	}

}
