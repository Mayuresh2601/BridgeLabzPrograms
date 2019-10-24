package AlgorithmPrograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import UtilityPackage.Utility;

public class MergeSort {

	public static void main(String[] args) throws IOException{
		
		Utility utility = new Utility();
		String Path = "/home/admin1/string.txt";
		File file = new File(Path);
		
		Scanner Scanner = new Scanner(new File(Path));
		
		ArrayList<String> arraylist = new ArrayList<String>();
		
		String temp="";
		while (Scanner.hasNext()) {
			temp = Scanner.next();
			arraylist.add(temp);
		}
		
		int k=0;
		String[] array = new String[arraylist.size()];
		
		Iterator iterator = arraylist.iterator();
		
		while (iterator.hasNext()) {
			array[k] = (String) iterator.next();
			k++;
		}
		
		int length = array.length;
		
		utility.sortMerge(array, length);
		
	}

}
