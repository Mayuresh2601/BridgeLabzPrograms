package FunctionalPrograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the Co-ordinates of X and Y: ");
		int x = Scanner.nextInt();
		int y = Scanner.nextInt();
		
		float sqrt = (float) Math.pow(x, 2) + (float) Math.pow(y, 2);
		float Euclidean = (float) Math.sqrt(sqrt);
		
		System.out.println("The Euclidean Distance of Co-ordinate "+x+" and "+y+" is:"+Euclidean);

	}

}
