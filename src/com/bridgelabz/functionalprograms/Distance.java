package com.bridgelabz.functionalprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to find the Euclidean Distance.
 */

public class Distance {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Co-ordinates of X and Y: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		float sqrt = (float) Math.pow(x, 2) + (float) Math.pow(y, 2);
		float Euclidean = (float) Math.sqrt(sqrt);
		
		System.out.println("The Euclidean Distance of Co-ordinate "+x+" and "+y+" is:"+Euclidean);

	}

}
