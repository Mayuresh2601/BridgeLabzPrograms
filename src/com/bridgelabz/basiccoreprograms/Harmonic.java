package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to calculate the Harmonic Expression 
 */

public class Harmonic {

	public static void main(String[] args) {
		double harmonic = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int number = scanner.nextInt();
		
		//Calculate Expression from number to 1
		while(number >0) {
			harmonic = harmonic + (double)1/number;
			number--;
		}
		
		System.out.println("The Value of The Harmonic Expression is: "+harmonic);

	}

}