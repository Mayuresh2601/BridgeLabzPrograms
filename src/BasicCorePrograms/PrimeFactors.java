package BasicCorePrograms;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int number = Scanner.nextInt();
		
		System.out.println("The Prime Factors are: ");
		for (int i =2; i <= number; i++) {
			while(number % i ==0) {
				System.out.println(i);
				number = number / i;
			}
			
		}

	}

}
