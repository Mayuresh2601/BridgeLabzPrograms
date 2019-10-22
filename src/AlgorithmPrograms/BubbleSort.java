package AlgorithmPrograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import UtilityPackage.Utility;

public class BubbleSort {

	public static void main(String[] args) throws IOException {
		
		Utility utility = new Utility();
		
		String Path = "/home/admin0/IntTest.txt";
		File file = new File(Path);

		Scanner Scanner = new Scanner(new File(Path));
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		int temp;
		
		while(Scanner.hasNext()) {
			temp = Scanner.nextInt();
			arraylist.add(temp);
		}
		
		Iterator<Integer> iterator = arraylist.iterator();
		int array[] = new int[arraylist.size()];
		int c = 0;
		while(iterator.hasNext()) {
			array[c] = (int) iterator.next();
			c++;
		}
		
		utility.sortBubble(array);
		
	}

}
