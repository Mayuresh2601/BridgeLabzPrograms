package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to check the given year is a Leap Year or Not
 */

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Year to check Leap Year or Not..");
		int year = scanner.nextInt();
		
		//Formula to Check Year is Leap Year
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+ " is a Leap Year");
		}
		else {
			System.out.println(year+" is Not a Leap Year");
		}

	}

}