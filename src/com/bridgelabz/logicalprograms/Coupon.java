package com.bridgelabz.logicalprograms;

import java.util.Scanner;

import com.bridgelabz.utilitypackage.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to Generate the Coupon Code.
 */

public class Coupon {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No. of Coupon Code to Print");
		int number = scanner.nextInt();
		
		//Calling Utility Package
		utility.couponCode(number);

	}

}