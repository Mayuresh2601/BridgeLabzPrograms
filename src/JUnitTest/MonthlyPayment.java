package JUnitTest;

import java.util.Scanner;

import UtilityPackage.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		
		Utility u = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Value: ");
		int P = sc.nextInt();
		System.out.println("Enter the No. of Years: ");
		int Y = sc.nextInt();
		System.out.println("Enter the Rate of interest: ");
		int R = sc.nextInt();
		
		u.monthlyPay(P, Y, R);

	}

}
