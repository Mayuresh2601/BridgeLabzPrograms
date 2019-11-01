package UtilityPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import AlgorithmPrograms.Generics;
import DataStructure.SingleLinkedList.Node;

public class UtilityGeneric {
	
	Scanner sc=new Scanner(System.in);

	/**
	 * @return return String input
	 */
	
	public String readString()
	{
		return sc.nextLine();
	}
	
	/*********************************************************************/

	/**
	 * @return return Integer input
	 */
	
	public int readInteger()
	{
		return sc.nextInt();
	}
	
   /***********************************************************************/

	/**
	 * @return return Double input
	 */
	public double readDouble()
	{
		return sc.nextDouble();
	}
	
	/***********************************************************************/

	/**
	 * @return return Float input
	 */
	public double readFloat()
	{
		return sc.nextFloat();
	}
	
	/***********************************************************************/

	/**
	 * @return return Long input
	 */
	public double readLong()
	{
		return sc.nextLong();
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
		
		ArrayList<Integer> a0 = new ArrayList<Integer>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		ArrayList<Integer> a5 = new ArrayList<Integer>();
		ArrayList<Integer> a6 = new ArrayList<Integer>();
		ArrayList<Integer> a7 = new ArrayList<Integer>();
		ArrayList<Integer> a8 = new ArrayList<Integer>();
		ArrayList<Integer> a9 = new ArrayList<Integer>();
		ArrayList<Integer> a10 = new ArrayList<Integer>();
		
		ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
		
		Iterator iterator = element.iterator();

		int compare=0;
		while(iterator.hasNext()) {
			int num = (int)iterator.next();
			compare = num % 11;
			
			switch(compare) {
			case 0: a0.add(num);
					break;
					
			case 1: a1.add(num);
					break;
		
			case 2: a2.add(num);
					break;
					
			case 3: a3.add(num);
					break;
					
			case 4: a4.add(num);
					break;
					
			case 5: a5.add(num);
					break;
					
			case 6: a6.add(num);
					break;
					
			case 7: a7.add(num);
					break;
					
			case 8: a8.add(num);
					break;
					
			case 9: a9.add(num);
					break;
					
			case 10:a10.add(num);
					break;		
			}
		}
		aList.add(a0);
		aList.add(a1);
		aList.add(a2);
		aList.add(a3);
		aList.add(a4);
		aList.add(a5);
		aList.add(a6);
		aList.add(a7);
		aList.add(a8);
		aList.add(a9);
		aList.add(a10);
		
		int num = number % 11;
		
		for (int i = 0; i < aList.size(); i++) {
			if(!aList.contains(number)) {
				switch(num) {
				case 0: a0.add(number);
						break;
						
				case 1: a1.add(number);
						break;
			
				case 2: a2.add(number);
						break;
						
				case 3: a3.add(number);
						break;
						
				case 4: a4.add(number);
						break;
						
				case 5: a5.add(number);
						break;
						
				case 6: a6.add(number);
						break;
						
				case 7: a7.add(number);
						break;
						
				case 8: a8.add(number);
						break;
						
				case 9: a9.add(number);
						break;
						
				case 10:a10.add(number);
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
//		String Path = "/home/admin1/Desktop/hashing.txt";
//		FileOutputStream file = new FileOutputStream(Path);
//		ObjectOutputStream oos = new ObjectOutputStream(file);
//		PrintWriter pw = new PrintWriter(Path);
//		pw.print("");
//		BufferedWriter writer = new BufferedWriter(new FileWriter(Path,true));
//		
//		Iterator itr = aList.iterator();
//		String temp="";
//		while (itr.hasNext()) {
//			temp = (String)itr.next();
//			writer.write(temp);
//		}

	}
	
	

}
