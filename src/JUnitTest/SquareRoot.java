package JUnitTest;

import java.util.Scanner;

import UtilityPackage.Utility;

public class SquareRoot {
	
	public static void main(String[] args) {
	
		Utility u = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Non-negative Integer or else we will convert it for you");
		int  c = sc.nextInt();
		u.sqrt(Math.abs(c));
		
	}
}
