package JUnitTest;

import java.util.Scanner;

import UtilityPackage.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Principal Value: ");
		int P = scanner.nextInt();
		System.out.println("Enter the No. of Years: ");
		int Y = scanner.nextInt();
		System.out.println("Enter the Rate of interest: ");
		int R = scanner.nextInt();
		
		//Calling Utility Package
		utility.monthlyPay(P, Y, R);

	}

}
