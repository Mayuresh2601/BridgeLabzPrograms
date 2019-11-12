package com.bridgelabz.algorithmprograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bridgelabz.utilitypackage.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Read a file and sort the word in binary sort
 */

public class WordBinary {

	public static void main(String[] args) throws IOException {
		
		Utility utility = new Utility();
		//Path of File to read from it
		String Path = "/home/admin1/Desktop/BridgeLabz/src/AlgorithmPrograms/Stringfile.txt";
		File file = new File(Path);
		
		Scanner scanner = new Scanner(new File(Path));
		
		ArrayList<String> arraylist = new ArrayList<String>();
		String temp = "";
		
		//Adding data of file into ArrayList
		while(scanner.hasNext()) {
			temp = scanner.next();
			arraylist.add(temp);
		}
		
		Iterator iterator = arraylist.iterator();
		String[] Input1 = new String[arraylist.size()]; 
		int c=0;
		
		//Traversing the ArrayList using iterator to store the data in Array
		while (iterator.hasNext()) {
			Input1[c] = (String) iterator.next();
			c++;
		}
		
		//Calling Utility Package
		utility.stringSort(Input1);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to search in the File: ");
		String key = scan.next();
		int s = 0;
		int e = Input1.length-1;
		
		//Searching word in the file
		int result = utility.binaryWord(Input1, s, e, key);
		
		if (result == -1) {
			System.out.println("String Not Found");
		}
		else {
			System.out.println("String Found");
		}
	}

}
