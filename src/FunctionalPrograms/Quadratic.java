package FunctionalPrograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the Values of a, b and c");
		int a = Scanner.nextInt();
		int b = Scanner.nextInt();
		int c = Scanner.nextInt();
		
		float delta = (float) Math.pow(b, 2) - 4*a*c;
		
		float root1 = -b + (float) Math.sqrt(delta)/2*a;
		float root2 = -b - (float) Math.sqrt(delta)/2*a;
		
		System.out.println("The Roots of the quadratic equation are: "+root1+" and "+root2);

	}

}
