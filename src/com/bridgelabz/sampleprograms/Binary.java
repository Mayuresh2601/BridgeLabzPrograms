package com.bridgelabz.sampleprograms;

import java.util.Scanner;

import com.bridgelabz.utilitypackage.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to convert decimal to binary
 */

public class Binary {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scanner.nextInt();

		utility.toBinary(num);

	}

}
