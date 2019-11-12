package com.bridgelabz.sampleprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to add First and Last Element
 */

public class AddFirstLast {

	public static void main(String[] args) {
		int count = 0,rem=0,k=0,result=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scanner.nextInt();
		
		int og = num;
		
		while (num > 0) {
			count++;
			num = num / 10;
		}
		
		num = og;
		int[] array = new int[count];
		while (num > 0) {
			rem = num%10;
			array[k] = rem;
			k++;
			num = num/10;
		}
		
		if (count % 2 != 0) {
			for (int i = 0; i < count; i=i+2) {
				result = result + array[i];
			}
		}
		else{
			for (int i = 1; i < count; i=i+2) {
				result = result + array[i];
			}
		}
		
		
		System.out.println("The Result is: "+result);
	}

}