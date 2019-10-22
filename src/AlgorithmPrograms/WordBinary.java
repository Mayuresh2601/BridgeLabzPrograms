package AlgorithmPrograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import UtilityPackage.Utility;


public class WordBinary {

	public static void main(String[] args) throws IOException {
		
		Utility utility = new Utility();
		String Input = "/home/admin0/Stringfile.txt";
		File file = new File(Input);
		
		Scanner Scanner = new Scanner(new File(Input));
		
		ArrayList<String> arraylist = new ArrayList<String>();
		String temp = "";
		while(Scanner.hasNext()) {
			temp = Scanner.next();
			arraylist.add(temp);
		}
		
		Iterator iterator = arraylist.iterator();
		String[] Input1 = new String[arraylist.size()]; 
		int c=0;
		while (iterator.hasNext()) {
			Input1[c] = (String) iterator.next();
			c++;
		}
		
		utility.stringSort(Input1);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to search in the File: ");
		String key = scan.next();
		int s = 0;
		int e = Input1.length-1;
		
		int result = utility.binaryWord(Input1, s, e, key);
		
		if (result == -1) {
			System.out.println("String Not Found");
		}
		else {
			System.out.println("String Found");
		}
	}

}
