package FunctionalPrograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		double windchill=0;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the Temperature (in Fahrenheit)");
		double temperature = Scanner.nextDouble();
		System.out.println("Enter the Wind Speed (in miles per hour)");
		double wind = Scanner.nextDouble();
		
		if(temperature <= 50 && wind>3 || wind<120) {
			windchill = 35.74 + 0.6215*temperature +(0.4275*temperature - 35.75)+(double)Math.pow(wind, 0.16);
		}
		
		System.out.println("The Result of WindChill is: "+windchill);
	}
}
