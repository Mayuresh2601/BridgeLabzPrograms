package LogicalPrograms;

import java.util.Scanner;

import UtilityPackage.Utility;

public class Coupon {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the No. of Coupon Code to Print");
		int number = Scanner.nextInt();
		
		//Calling Utility Package
		utility.couponCode(number);

	}

}