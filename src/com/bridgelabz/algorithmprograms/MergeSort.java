package com.bridgelabz.algorithmprograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bridgelabz.utilitypackage.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to do Merge Sort of list of Strings. 
 */

public class MergeSort {

	public static void main(String[] args) throws IOException{
		
		Utility utility = new Utility();
		//Path of File to read from it
		String Path = "/home/admin1/Desktop/BridgeLabz/src/AlgorithmPrograms/Stringfile.txt";
		File file = new File(Path);
		
		Scanner Scanner = new Scanner(new File(Path));
		
		ArrayList<String> arraylist = new ArrayList<String>();
		
		String temp="";
		//Adding data of file into ArrayList
		while (Scanner.hasNext()) {
			temp = Scanner.next();
			arraylist.add(temp);
		}
		
		int k=0;
		String[] array = new String[arraylist.size()];
		Iterator iterator = arraylist.iterator();
		
		//Traversing the ArrayList using iterator to store the data in Array
		while (iterator.hasNext()) {
			array[k] = (String) iterator.next();
			k++;
		}
		
		int length = array.length;
		
		//Calling Utility Package
		utility.sortMerge(array, length);
		
	}

}
