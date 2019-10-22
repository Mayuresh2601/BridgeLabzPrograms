package JUnitTest;

import java.util.Scanner;
import UtilityPackage.Utility;

public class TemperatureConvert {

	public static void main(String[] args) {
		
		Utility u = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to Convert Celsius to Fahrenheit \nPress 2 to Convert Fahrenheit to Celsius");
		byte ch = sc.nextByte();
		
		switch (ch) {
		case 1:
			System.out.println("Enter the temperature in Celsius: ");
			float c = sc.nextFloat();
			u.celsiusConvert(c);
			break;

		case 2:
			System.out.println("Enter the temperature in Fahrenheit: ");
			float f = sc.nextFloat();
			u.fahrenheitConvert(f);
			break;
		
		}
	}

}
