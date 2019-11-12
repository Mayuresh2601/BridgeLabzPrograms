package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: To Check Given Number is Anagram or Not
 */

public class Anagram {

	public static void main(String[] args) {
	
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String input1 = Scanner.next().toLowerCase().replace(" ", "");
		System.out.println("Enter Second String");
		String input2 = Scanner.next().toLowerCase().replace(" ", "");
	
		// Check String is Anagram or Not
		if(isAnagram(input1,input2)) {
			System.out.println("It is Anagram");
		}
		else {
			System.out.println("It is Not Anagram");
		}
	}
	
	public static boolean isAnagram(String input1,String input2) {
		
		// Return false is length of both string is not equal
		if(input1.length() != input2.length()) {
			return false;
		}
		
		for (int i = 0; i < input1.length(); i++) 
		{
			for (int j = 0; j < input2.length(); j++) 
			{
				if(input1.charAt(i) == input2.charAt(j)) 
				{
					input2 = input2.substring(0,j)+input2.substring(j+1);
				}
			}
		}
		
		if(input2.length() == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}