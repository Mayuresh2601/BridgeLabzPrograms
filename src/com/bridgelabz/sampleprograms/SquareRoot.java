package com.bridgelabz.sampleprograms;

import java.util.Scanner;

import com.bridgelabz.utilitypackage.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to find the Square Root of the given Number
 */

public class SquareRoot {
	
	public static void main(String[] args) {
	
		Utility utility = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Non-negative Integer or else we will convert it for you");
		int number = sc.nextInt();
		
		//Calling Utility Package
		utility.sqrt(Math.abs(number));
		
	}
}