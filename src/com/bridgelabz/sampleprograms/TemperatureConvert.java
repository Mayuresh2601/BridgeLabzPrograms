package com.bridgelabz.sampleprograms;

import java.util.Scanner;

import com.bridgelabz.utilitypackage.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to convert the temperature in Fahrenheit or Celsius
 */

public class TemperatureConvert {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to Convert Celsius to Fahrenheit \nPress 2 to Convert Fahrenheit to Celsius");
		byte ch = scanner.nextByte();
		
		switch (ch) {
		case 1:
			System.out.println("Enter the temperature in Celsius: ");
			float c = scanner.nextFloat();
			utility.celsiusConvert(c);
			break;

		case 2:
			System.out.println("Enter the temperature in Fahrenheit: ");
			float f = scanner.nextFloat();
			utility.fahrenheitConvert(f);
			break;
		
		}
	}

}
