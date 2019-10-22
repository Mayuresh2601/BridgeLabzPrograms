package BasicCorePrograms;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the Nth value Between 0 - 30: ");
		int number = Scanner.nextInt();
		
		if(number <= 30) {
			for (int i = 0; i <= number; i++) {
				int result = (int) Math.pow(2, i);
				System.out.println("The Power of 2 raise to "+i+" is: "+result);
			}
		}
		else {
			System.out.println("The Power of 2 raise to "+number+" Overflows the int data type");
		}

	}

}
