package AlgorithmPrograms;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String Input1 = Scanner.next().toLowerCase().replace(" ", "");
		System.out.println("Enter Second String");
		String Input2 = Scanner.next().toLowerCase().replace(" ", "");
	
		
		if(isAnagram(Input1,Input2)) {
			System.out.println("It is Anagram");
		}
		else {
			System.out.println("It is Not Anagram");
		}
	}
	
	public static boolean isAnagram(String Input1,String Input2) {
		
		if(Input1.length() != Input2.length()) {
			return false;
		}
		
		for (int i = 0; i < Input1.length(); i++) 
		{
			for (int j = 0; j < Input2.length(); j++) 
			{
				if(Input1.charAt(i) == Input2.charAt(j)) 
				{
					Input2 = Input2.substring(0,j)+Input2.substring(j+1);
				}
			}
		}
		
		if(Input2.length() == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
