package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to Print the Power of 2 which has limit till 30 because int can't take 2^30 value
 */

public class PowerOf2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Nth value Between 0 - 30: ");
		int number = scanner.nextInt();
		
		//Number should be less than 30 to perform Power of 2
		if(number <= 30) {
			for (int i = 0; i <= number; i++) {
				int result = (int) Math.pow(2, i);
				System.out.println("The Power of 2 raise to "+i+" is: "+result);
			}
		}
		else {
			System.out.println("The Power of 2 raise to "+number+" Overflows the int data type");
		}

	}

}