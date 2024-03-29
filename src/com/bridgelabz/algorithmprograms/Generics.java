package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilitypackage.UtilityGeneric;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Perform different sorting techniques on string and integer
 */

public class Generics<T>{
	
	public static void main(String[] args) {
		
		UtilityGeneric utilityGen = new UtilityGeneric();
		
		Integer[] array = {345,78,6786,412,342,354565,4645,67,46,3542,354,25};
		
		String[] str = {"Hello","Mayuresh","How","Are","You","Hope","You","Do","Well","In","Your","Studies"};
		
		System.out.println("Performed By BubbleSort: ");
		
		//Calling Utility Package
		utilityGen.bubbleSort(array);
		utilityGen.bubbleSort(str);
		System.out.println();
		
		System.out.println("Performed By InsertionSort: ");
		
		//Calling Utility Package
		utilityGen.insertionSort(array);
		utilityGen.insertionSort(str);
		
	}

}