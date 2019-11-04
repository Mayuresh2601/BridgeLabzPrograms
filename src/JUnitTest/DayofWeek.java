package JUnitTest;

import java.util.Scanner;

public class DayofWeek {

	public static void main(String[] args) {
		
		int d0=0,m0=0,y0=0;
		int x=0;
		Scanner sc = new Scanner(System.in);
		
		//Taking Command Line Arguments
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		y0=year-(14-month)/12;
		x=y0+(y0/4)-(y0/100)+(y0/400);
		m0=month+12*((14-month)/12)-2;
		d0=(day+x+31*m0/12)%7;
		
		switch(d0) {
		
		case 0 :
			System.out.println("The Day is Sunday");
			break;
			
		case 1 :
			System.out.println("The Day is Monday");
			break;
			
		case 2 :
			System.out.println("The Day is Tuesday");
			break;
			
		case 3 :
			System.out.println("The Day is Wednesday");
			break;
			
		case 4 :
			System.out.println("The Day is Thursday");
			break;
			
		case 5 :
			System.out.println("The Day is Friday");
			break;
			
		case 6 :
			System.out.println("The Day is Saturday");
			break;
		}

	}

}