package BasicCorePrograms;

import java.util.Scanner;

public class FirstName {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		String Input1 = "Hello <<UserName>>, How are You??";
		System.out.println("Enter The Name to Replace:");
		String Input2 = Scanner.next();
		
		//Replace the String if length is greater the 3
		if(Input2.length() > 3) {
			Input1 = Input1.replace("<<UserName>>", Input2);
			System.out.println(Input1);
		}
		else {
			System.out.println("Please Enter the Name greater than 3 Letters");
		}
	}

}