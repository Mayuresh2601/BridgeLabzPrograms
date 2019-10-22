package AlgorithmPrograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import UtilityPackage.Utility;

public class InsertionSort {

	public static void main(String[] args) throws IOException {
		
		Utility utility = new Utility();
		File file = new File("/home/admin0/Stringfile.txt");
		
		Scanner Scanner = new Scanner(new File("/home/admin0/Stringfile.txt"));
		
		ArrayList<String> arraylist = new ArrayList<String>();
		String temp="";
		
		while(Scanner.hasNext()) {
			temp = Scanner.next();
			arraylist.add(temp);
		}
		
		Iterator iterator = arraylist.iterator();
		String[] input = new String[arraylist.size()]; 
		int c=0;
		while (iterator.hasNext()) {
			input[c] = (String) iterator.next();
			c++;
		}
		
		utility.sortInsertion(input);

	}

}
