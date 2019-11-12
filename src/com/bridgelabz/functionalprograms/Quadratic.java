package com.bridgelabz.functionalprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to find the roots of the given expression 
 */

public class Quadratic {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Values of a, b and c");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		float delta = (float) Math.pow(b, 2) - 4*a*c;
		
		float root1 = -b + (float) Math.sqrt(delta)/2*a;
		float root2 = -b - (float) Math.sqrt(delta)/2*a;
		
		System.out.println("The Roots of the quadratic equation are: "+root1+" and "+root2);

	}

}
