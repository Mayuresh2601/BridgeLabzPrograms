package JUnitTest;

import java.util.Scanner;

import UtilityPackage.Utility;

public class BinaryConvertion {

	public static void main(String[] args) {
		
//		Utility u = new Utility();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number: ");
//		int num = sc.nextInt();
//		u.mybinary(num);
		
		Utility utility = new Utility();
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = Scanner.nextInt();
		
		utility.toBinary(num);
	}

}
