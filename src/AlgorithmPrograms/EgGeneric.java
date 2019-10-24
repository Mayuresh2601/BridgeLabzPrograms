package AlgorithmPrograms;

import java.lang.reflect.Array;

public class EgGeneric<T> {

//	private T[] arr;
//	private int length;
	Class<T> type;
//	public EgGeneric(Class<T> type, int length) {
//		// Creates a new array with the specified type and length at runtime
//		this.arr = (T[]) java.lang.reflect.Array.newInstance(type, length);
//		this.length = length;
//	}

	public <T> void mergeSort(T[] arr, Integer end) {
		// extends Comparable<E>
		int start = 0;

		if (end < 2) {
			return;
		}
		int a[] = new int[4];

		Integer mid = start + (end - start) / 2;
		T[] arr1 = (T[]) Array.newInstance(type, mid);

		T[] arr2 = null;

		for (int i = 0; i < mid; i++) {
			arr1[i] = arr[i];
		}

		for (int j = mid; j < arr.length; j++) {
			arr2[j - mid] = arr[j];
		}

		mergeSort(arr1, mid);
		mergeSort(arr2, end - mid);
		//mergeGeneric(arr, arr1, arr2, mid, end - mid);
	}
	
	public static void main(String[] args) {
		
		Integer arr[] = {123,234,34,3465,3456,345,345,2354};
		EgGeneric  t = new EgGeneric();
		Integer end = arr.length-1;
		t.mergeSort(arr, end);
	}
}
