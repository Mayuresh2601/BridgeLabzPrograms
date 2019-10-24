package BasicCorePrograms;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		double harmonic = 0;
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int number = Scanner.nextInt();
		
		while(number >0) {
			harmonic = harmonic + (double)1/number;
			number--;
		}
		
		System.out.println("The Value of The Harmonic Expression is: "+harmonic);

	}

}
