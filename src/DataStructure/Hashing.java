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
		String Path = "/home/admin1/Desktop/hashing.txt";
	
		File file = new File(Path);
		Scanner scanner = new Scanner(new File(Path));
		
		ArrayList<Integer> element = new ArrayList<Integer>();
		
		int n=0;
		while(scanner.hasNext()) {
			n = scanner.nextInt();
			element.add(n);
		}
		System.out.println("Enter The Number to Search in the List");
		int number = utilityGen.readInteger();
		utilityGen.hashing(number,element);
		
		
	}

}
