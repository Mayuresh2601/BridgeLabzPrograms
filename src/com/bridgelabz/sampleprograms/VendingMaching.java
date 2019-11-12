package com.bridgelabz.sampleprograms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to perform logic on Vending Machine
 */

public class VendingMaching {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		int quo=0,rem=0;
		int arr[] = {1000,500,200,100,50,20,10,5,2,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Money: ");
		int number = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(number >= arr[i]) {
				quo = number / arr[i];
				arraylist1.add(quo);
				arraylist2.add(arr[i]);
				number = number % arr[i];
//				System.out.println(arr[i]+ "    "+quo);
			}
			
		}
		
		System.out.println("Count of the Notes are: "+arraylist1);
		System.out.println("Notes removed from Vending Machine are: "+arraylist2);

	}

}
