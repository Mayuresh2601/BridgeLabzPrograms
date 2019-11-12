package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utilitypackage.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Program to print permutation of String
 */

public class Permutation {

	/*  Permutation of Each String Element Method */
	public static void recursivePermutation(String string, String ans) {
		
		if(string.length() <1) {
			System.out.println(ans +" ");
		}
		
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			String ros = string.substring(0, i) + string.substring(i+1, string.length());
			recursivePermutation(ros,ans+ch);
		}
	}
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = Scanner.next();
		String ans = "";
		recursivePermutation(string, ans);
	
	}

}
