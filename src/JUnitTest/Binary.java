package JUnitTest;

import java.util.Scanner;

import UtilityPackage.Utility;

public class Binary {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = Scanner.nextInt();

		utility.binary(num);

	}

}
