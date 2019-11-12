package com.bridgelabz.demo;

public class Insertion {

	public static void main(String[] args) {
		
		int temp=0;
		
		int [] array = {123,46,678,68,5654,52,342,3421,4253465,4342,1234,234,234,23};
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			int j = i-1;
			while(j>=0 && array[j] > temp) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
		String s = "2354234342312";
		String r = s.substring(0,1);
		System.out.println(r);

	}

}
