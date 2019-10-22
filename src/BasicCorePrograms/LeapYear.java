package BasicCorePrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the Year to check Leap Year or Not..");
		int year = Scanner.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+ " is a Leap Year");
		}
		else {
			System.out.println(year+" is Not a Leap Year");
		}

	}

}
