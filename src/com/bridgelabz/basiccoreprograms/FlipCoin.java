package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to Flip a Coin and calculate the percentage of it.
 */

public class FlipCoin {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No. of times the Coin is Flip..");
		int number = scanner.nextInt();
		int tail=0,head=0;
		
		for (int i = 0; i < number; i++) {
			
			// Generate Random Number Between 0 and 1
			float random = (float) (Math.random());
			
			if(random <0.5) {
				tail++;
			}
			else {
				head++;
			}
		}
		
		//Calculate Percentage of Number of Tails and Heads
		int tailpercent = tail*100/number;
		int headpercent = head*100/number;
		
		System.out.println("Occurances of head Percentage is: "+headpercent);
		System.out.println("Occurances of Tail Percentage is: "+tailpercent);
	}
}