package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to do Print the Prime Factors of a Given Number
 */

public class PrimeFactors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int number = scanner.nextInt();
		
		System.out.println("The Prime Factors are: ");
		for (int i =2; i <= number; i++) {
			
			//Prime Factor of the Number
			while(number % i ==0) {
				System.out.println(i);
				number = number / i;
			}
		}

	}
}