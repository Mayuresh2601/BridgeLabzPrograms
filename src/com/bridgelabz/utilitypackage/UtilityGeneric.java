package com.bridgelabz.utilitypackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UtilityGeneric {
	
	Scanner scanner=new Scanner(System.in);

	/**
	 * @return return String input
	 */
	
	public String readString()
	{
		return scanner.nextLine();
	}
	
	/*********************************************************************/

	/**
	 * @return return Integer input
	 */
	
	public int readInteger()
	{
		return scanner.nextInt();
	}
	
   /***********************************************************************/

	/**
	 * @return return Double input
	 */
	public double readDouble()
	{
		return scanner.nextDouble();
	}
	
	/***********************************************************************/

	/**
	 * @return return Float input
	 */
	public float readFloat()
	{
		return scanner.nextFloat();
	}
	
	/***********************************************************************/

	/**
	 * @return return Long input
	 */
	public long readLong()
	{
		return scanner.nextLong();
	}

	/***********************************************************************/

	/**
	 * @return return Bubble Sorting Using Generics
	 */
	
	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
		T temp;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i].compareTo(array[j]) >=0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (T e : array) {
			System.out.print(e+ "  ");
		}
		System.out.println();
	}
	
	/***********************************************************************/

	/**
	 * @return return Insertion Sorting using Generics
	 */
	
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		T temp;
		
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			int j = i-1;
			while (j<=0 && array[j].compareTo(temp)>=0) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}
		
		for (T e : array) {
			System.out.print(e+ "  ");
		}
		System.out.println();
	}
	

	
	/*****************************DataStructure Programs*******************************************/
	/******************************************************************************************/
			/**
			 * @author Mayuresh Sunil Sonar
			 * @Modified on  26-10-2019
			 * @Purpose :-Data Structure Programs
			 */ 
	
	/***********************************************************************/
	
	/***********************************************************************/

	/**
	 * @return return Unorder List using Bubble sort to compare Element
	 */
	
	public static Node head;
	
		public class Node {
		
			private int value;
			private Node next;
			Node(int item) {
				this.value = item;
				this.next = head;
				head = this;
			}
		}
	

	public void add(int item) {
		new Node(item);
	}
	
	public static <T extends Comparable<T>> void unOrderList(ArrayList<T> arraylist,Object key) {
		
		boolean present = false;
		for (int i = 0; i < arraylist.size(); i++) {
			if (arraylist.get(i).compareTo((T) key)==0) {
				System.out.println("Element is Present");
				present = true;
			}
		}
		
		for (int i = 0; i < arraylist.size(); i++) {
			if(arraylist.get(i).compareTo((T) key) !=0) {
				System.out.println("Element Not Present");
				present = false;
			}
		}
		
		if(present==true) {
			arraylist.add((T) key);
		}
		
		for (Object t : arraylist) {
			System.out.println(t+ " ");
		}
		
		
	}
	/***********************************************************************/

	/**
	 * @return return ordered List using Bubble sort to compare Element
	 */

		

	/***********************************************************************/

	/**
	 * @return return Hashing Performed on ArrayList
	 */
	
	public static void hashing(int number,ArrayList<Integer> element) throws IOException {
		
		ArrayList<Integer> arraylist0 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist3 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist4 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist5 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist6 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist7 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist8 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist9 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist10 = new ArrayList<Integer>();
		
		ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
		
		Iterator iterator = element.iterator();

		int compare=0;
		while(iterator.hasNext()) {
			int num = (int)iterator.next();
			compare = num % 11;
			
			switch(compare) {
			case 0: arraylist0.add(num);
					break;
					
			case 1: arraylist1.add(num);
					break;
		
			case 2: arraylist2.add(num);
					break;
					
			case 3: arraylist3.add(num);
					break;
					
			case 4: arraylist4.add(num);
					break;
					
			case 5: arraylist5.add(num);
					break;
					
			case 6: arraylist6.add(num);
					break;
					
			case 7: arraylist7.add(num);
					break;
					
			case 8: arraylist8.add(num);
					break;
					
			case 9: arraylist9.add(num);
					break;
					
			case 10:arraylist10.add(num);
					break;		
			}
		}
		aList.add(arraylist0);
		aList.add(arraylist1);
		aList.add(arraylist2);
		aList.add(arraylist3);
		aList.add(arraylist4);
		aList.add(arraylist5);
		aList.add(arraylist6);
		aList.add(arraylist7);
		aList.add(arraylist8);
		aList.add(arraylist9);
		aList.add(arraylist10);
		
		int num = number % 11;
		
		for (int i = 0; i < aList.size(); i++) {
			if(!aList.contains(number)) {
				switch(num) {
				case 0: arraylist0.add(number);
						break;
						
				case 1: arraylist1.add(number);
						break;
			
				case 2: arraylist2.add(number);
						break;
						
				case 3: arraylist3.add(number);
						break;
						
				case 4: arraylist4.add(number);
						break;
						
				case 5: arraylist5.add(number);
						break;
						
				case 6: arraylist6.add(number);
						break;
						
				case 7: arraylist7.add(number);
						break;
						
				case 8: arraylist8.add(number);
						break;
						
				case 9: arraylist9.add(number);
						break;
						
				case 10:arraylist10.add(number);
						break;		
				}

				System.out.println("Element Added Successfully...");
				break;
			}
			else {
				aList.remove(new Integer(number));
				System.out.println("Element Removed...");
			}
		}
		
		for (int i = 0; i < aList.size(); i++) { 
			System.out.print(i +"    ");
            for (int j = 0; j < aList.get(i).size(); j++) { 
                System.out.print(aList.get(i).get(j) + "  "); 
            } 
            System.out.println(); 
        }

	}

}
