package LogicalPrograms;

import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {
		
		double start = System.currentTimeMillis();
		System.out.println("The Time has Started....");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = sc.next();
		
		System.out.println("Hello "+name+"!!");
		System.out.println("The Time has Stopped.....");
		double end = System.currentTimeMillis();
		
		double elipse = (end - start)/1000;
		
		System.out.println("The Elipse Time is: "+elipse+" seconds");
	}

}
