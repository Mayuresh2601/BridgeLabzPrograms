package AlgorithmPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

import UtilityPackage.Utility;

public class Generics<T> extends Utility{

	Class<T> type;
//	private E[] arr;
//	private int length;
//
//	public Generics(Class<E> type, int length) {
//		// Creates a new array with the specified type and length at runtime
//		this.arr = (E[]) java.lang.reflect.Array.newInstance(type, length);
//		this.length = length;
//	}
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		
		Integer[] array = {345,78,6786,412,342,354565,4645,67,46,3542,354,25};
		
		String[] str = {"wef","yukj","gfhb","wqer","few","dhf","kj"};
		
		System.out.println("Performed By BubbleSort: ");
		utility.bubbleSort(array);
		System.out.println();
		
		System.out.println("Performed By InsertionSort: ");
		utility.insertionSort(array);
		utility.insertionSort(str);
		
		System.out.println("Performed By MergeSort: ");
		Integer length = array.length-1;
		utility.mergeSort(array, length);
	}

}
