package DataStructure;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import UtilityPackage.Utility;
import UtilityPackage.UtilityGeneric;

public class Hashing {

	public static void main(String[] args) throws IOException{
		UtilityGeneric utilityGen = new UtilityGeneric();
		
		//Path of File to read from it
		String Path = "C:\\Users\\Home\\eclipse-workspace\\BridgeLabzProgram\\src\\com\\DataStructure\\hashing.txt";
		File file = new File(Path);
		
		Scanner scanner = new Scanner(new File(Path));
		
		ArrayList<Integer> element = new ArrayList<Integer>();
		int temp=0;
		
		//Adding data of file into ArrayList
		while(scanner.hasNext()) {
			temp = scanner.nextInt();
			element.add(temp);
		}
		
		//Print the Element present in the file
		System.out.println(element);
		
		System.out.println("Enter The Number to Search in the List");
		int number = utilityGen.readInteger();
		
		//Calling Utility Package
		utilityGen.hashing(number,element);
		
	}

}