package AlgorithmPrograms;

import java.util.Scanner;

import UtilityPackage.Utility;

public class Permutation {

	/*  Permutation of Each String Element Method */
	public static void recursivePermutation(String str, String ans) {
		
		if(str.length() <1) {
			System.out.println(ans +" ");
		}
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i+1, str.length());
			recursivePermutation(ros,ans+ch);
		}
	}
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = Scanner.next();
		String ans = "";
		recursivePermutation(str, ans);
	
	}

}
