package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to replace the word with the UserName.
 */

public class FirstName {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input1 = "Hello <<UserName>>, How are You??";
		System.out.println("Enter The Name to Replace:");
		String input2 = scanner.next();
		
		//Replace the String if length is greater the 3
		if(input2.length() > 3) {
			input1 = input1.replace("<<UserName>>", input2);
			System.out.println(input1);
		}
		else {
			System.out.println("Please Enter the Name greater than 3 Letters");
		}
	}

}