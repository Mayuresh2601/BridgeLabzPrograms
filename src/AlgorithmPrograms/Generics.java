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
		
		String[] str = {"wef","yukj","gfhb","wqer","few","dhf","kj"};
		
		System.out.println("Performed By BubbleSort: ");
		utilityGen.bubbleSort(array);
		System.out.println();
		
		System.out.println("Performed By InsertionSort: ");
		utilityGen.insertionSort(array);
		utilityGen.insertionSort(str);
		
		System.out.println("Performed By MergeSort: ");
		Integer length = array.length-1;
		utilityGen.mergeSort(array, length);
	}

}
