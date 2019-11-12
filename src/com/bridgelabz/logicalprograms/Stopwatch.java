package com.bridgelabz.logicalprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to find the elipse time between the start and stop of stopwatch
 */

public class Stopwatch {

	public static void main(String[] args) {
		
		double start = System.currentTimeMillis();
		System.out.println("The Time has Started....");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = scanner.next();
		
		System.out.println("Hello "+name+"!!");
		System.out.println("The Time has Stopped.....");
		double end = System.currentTimeMillis();
		
		double elipse = (end - start)/1000;
		
		System.out.println("The Elipse Time is: "+elipse+" seconds");
	}

}
