package com.bridgelabz.algorithmprograms;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to find the Prime Numbers in range of 0 to 1000
 */

public class PrimeNumber {

	public static void main(String[] args) {
		
		int Limit = 1000;
		String input="";
		
		//Traverse to the Limit
		for (int i = 2; i <=Limit ; i++) {
			int count = 0;
			
			//Traverse from number to 1
			for (int j = i; j >= 1; j--) {
				
				//If count of number%2 is 2 then it is prime number
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				input = input + i + " ";
			}
		}
		System.out.println("Prime Number Between 0 to 1000 are: ");
		System.out.println(input);

	}

}
