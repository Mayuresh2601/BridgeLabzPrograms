package AlgorithmPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

import UtilityPackage.Utility;
import UtilityPackage.UtilityGeneric;

public class Generics<T> extends Utility{

	Class<T> type;
	
	public static void main(String[] args) {
		
		UtilityGeneric utilityGen = new UtilityGeneric();
		
		Integer[] array = {345,78,6786,412,342,354565,4645,67,46,3542,354,25};
		
		String[] str = {"Hello","Mayuresh","How","Are","You","Hope","You","Do","Well","In","Your","Studies"};
		
		System.out.println("Performed By BubbleSort: ");
		utilityGen.bubbleSort(array);
		utilityGen.bubbleSort(str);
		System.out.println();
		
		System.out.println("Performed By InsertionSort: ");
		utilityGen.insertionSort(array);
		utilityGen.insertionSort(str);
		
	}

}
