package com.bridgelabz.logicalprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to Generate 10 CouponCode
 */

public class CouponNumber {

	public static void main(String[] args) {
		/* To Print 10 CouponCode with Random Numbers */
		Scanner scanner = new Scanner(System.in);
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] ch = str.toCharArray();
		int count=0;
		do {
		System.out.println("Enter the Number: ");
		int number = scanner.nextInt();
		StringBuffer sb = new StringBuffer();
		int random = (int) (Math.random()*number);
		
		while(random > 0) {
			sb.append(ch[random%ch.length]);
			random = random/ch.length;
		}
		
		String couponcode = sb.toString();
		System.out.println("Coupon code is: "+couponcode);
		count++;
		}while(count <10);
	}

}
