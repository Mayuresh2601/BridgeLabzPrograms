package com.bridgelabz.algorithmprograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bridgelabz.utilitypackage.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Read form File use Insertion Sort to sort the words in the String array
 */

public class InsertionSort {

	public static void main(String[] args) throws IOException {
		
		Utility utility = new Utility();
		
		//Path of File to read from it
		String Path = "/home/admin1/Desktop/BridgeLabz/src/AlgorithmPrograms/Stringfile.txt";
		File file = new File(Path);
		
		Scanner Scanner = new Scanner(new File(Path));
		
		ArrayList<String> arraylist = new ArrayList<String>();
		String temp="";
		
		//Adding data of file into ArrayList
		while(Scanner.hasNext()) {
			temp = Scanner.next();
			arraylist.add(temp);
		}
		
		Iterator iterator = arraylist.iterator();
		String[] input = new String[arraylist.size()]; 
		int c=0;
		
		//Traversing the ArrayList using iterator to store the data in Array
		while (iterator.hasNext()) {
			input[c] = (String) iterator.next();
			c++;
		}
		
		//Calling Utility Package
		utility.sortInsertion(input);

	}

}
