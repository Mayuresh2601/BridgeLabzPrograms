package com.bridgelabz.sampleprograms;

public class Selection {

	public static void main(String[] args) {
		
	int temp = 0;
		
	int [] array = {123,46,678,68,5654,52,342,3421,4253465,4342,1234,234,234,23,3423,23};

	for (int i = 0; i < array.length; i++) {
		int index = i;
		for (int j = i+1; j < array.length; j++) {
			if (array[index] > array[j]) {
				index = j;
			}
		}
		temp = array[index];
		array[index] = array[i];
		array[i] = temp;
	}
	
	for (int i : array) {
		System.out.println(i);
	}
	
	// Binary Search
	
	int start = 0;
	int end = array.length-1;
	
	int key = 123;
	
	int result = binary(array, start, end, key);
	
	if(result == -1) {
		System.out.println("Element Not Present");
	}
	else {
		System.out.println("Element Present");
	}
	}
	
	public static int binary(int[] arr,int start,int end,int key) {
		
		while(end >= start) {
			int mid = start+ (end-start)/2;
			
			if(arr[mid] == key) {
				return mid;
			}
			
			if(arr[mid] > key) {
				return binary(arr, start, mid-1, key);
			}
			
				
			return binary(arr, mid+1, end, key);
			
		}
		return -1;
	}

}
