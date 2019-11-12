package com.bridgelabz.utilitypackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	
	Scanner scanner=new Scanner(System.in);

	/**
	 * @return return String input
	 */
	
	public String readString()
	{
		return scanner.nextLine();
	}
	
	/*********************************************************************/

	/**
	 * @return return Integer input
	 */
	
	public int readInteger()
	{
		return scanner.nextInt();
	}
	
   /***********************************************************************/

	/**
	 * @return return Double input
	 */
	public double readDouble()
	{
		return scanner.nextDouble();
	}
	
	/***********************************************************************/

	/**
	 * @return return Float input
	 */
	public float readFloat()
	{
		return scanner.nextFloat();
	}
	
	/***********************************************************************/

	/**
	 * @return return Long input
	 */
	public long readLong()
	{
		return scanner.nextLong();
	}
	/*****************************Logical Programs*******************************************/
	/******************************************************************************************/
			/**
			 * @author Mayuresh Sunil Sonar
			 * @Modified on  06-10-2019
			 * @Purpose :- Functional & Logical & Junit Testing
			 */ 
	
	public static void couponCode(int number) {
		
		String s="0123456789";
		char []ch=s.toCharArray();
		Random random=new Random();
		String string="";
		HashSet<String> hashmap=new HashSet<String>();
		for(int i=0;i < number;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				char c=ch[random.nextInt(ch.length)];
				string=string+c;
			}
			hashmap.add(string);
			string="";
		}
		Iterator iterator = hashmap.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}
	
	
	/*****************************Junit Testing*******************************************/
	/******************************************************************************************/
			/**
			 * @author Mayuresh Sunil Sonar
			 * @Modified on  08-10-2019
			 * @Purpose :- Functional & Logical & Junit Testing
			 */ 
	
	/*********************************************************************/
	
	 /**
	 * @return Convert Celsius to Fahrenheit
	 * @return Convert Fahrenheit to Celsius
	 */
	
	public static void celsiusConvert(float celsius) {
		float fahrenheit = (celsius * 9/5)+ 32;
		System.out.println("After convertion Value is: "+fahrenheit);
	}
	
	public static void fahrenheitConvert(float fahrenheit) {
		float celsius = (fahrenheit * 9/5)+ 32;
		System.out.println("After convertion Value is: "+celsius);
	}
	
	/***********************************************************************/

	/**
	 * @return return Monthly Pay
	 */
	
	public static void monthlyPay(int principle,int year, int rate) {
		
		int n = 12 * year;
		float r = rate / (12 * 100);
		float payment = (principle * r) / 1 - (float) (Math.pow(1+r, -n));
		System.out.println("Monthly Payment have to make in a year is: "+payment);
	}
	
	/***********************************************************************/

	/**
	 * @return return Proper SquareRoot
	 */
	
	public static void sqrt(int number) {
		int t = number;
		double epsilon = 1e-15;

		while(Math.abs(t - number/t) > epsilon * t) {
			t = (number/t+t)/2;
		}
		System.out.println(t);
	}
	
	/***********************************************************************/

	/**
	 * @return return My Binary Logic
	 */
	
	public static void myBinary(int number) {
		
		String binary = "";
		int array[] = new int[32];
		int og = number;
		for (int i = 31; i >=0; i--) {
			if(number >= Math.pow(2, i)) {
				binary = binary + "1" + " ";
				number = number - (int) Math.pow(2, i);
			}
			else {
				binary = binary + "0" + " ";
			}
		}
		System.out.println("The Binary Conversion of "+og+" is: "+binary);

	}
	
	/***********************************************************************/

	/**
	 * @return return Decimal To Binary
	 */
	
	public static void toBinary(int number) {
		
		int[] array = new int[8];
		int c=0;
		
		//Loop till number equals 0
		while (number > 0) {
			//Adding modulas of 2 value in Array
			array[c] = number%2;
			number /= 10;
			c++;
		}
		
		//Print the Array
		for (int i : array) {
			System.out.println(i);
		}

	}
	
	/***********************************************************************/

	/**
	 * @return return Swapping Nibbles
	 */
	
	public static void toDecimal(String binary) {
		
		int array[] = new int[binary.length()];
		int k = 0,j=4,temp=0,result=0;
		
		System.out.print("Before Swapping.......");
		for (int i = 0; i < array.length; i++) {
			System.out.print("   "+array[i]);
		}
		
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if(j < 8) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		
		System.out.print("After Swapping........");
		for (int i = 0; i < array.length; i++) {
			System.out.print("   "+array[i]);
		}
		System.out.println();
		
		System.out.println("After Swapping the nibbles the value is: "+result);

	}
	
	/***********************************************************************/

	/**
	 * @return return Sorting String
	 */
	
	public static void stringSort(String[] Input) {
		
		String temp = "";
		
		for (int i = 0; i < Input.length; i++) {
			for (int j = i+1; j < Input.length; j++) {
				if(Input[i].compareTo(Input[j]) >= 0) {
					temp = Input[i];
					Input[i] = Input[j];
					Input[j] = temp;
				}
			}
		}

	}
	
	/*****************************Algorithm Programs*******************************************/
	/******************************************************************************************/
			/**
			 * @author Mayuresh Sunil Sonar
			 * @Modified on  14-10-2019
			 * @Purpose :- Functional & Logical & Junit Testing
			 */ 
	
	/***********************************************************************/

	/**
	 * @return return Iterative String Permutation
	 */
	
	public static int fact(int number) {
		
		int fact = 1;
		for (int i = number; i >=1; i--) {
			fact = fact *i;
		}
		return fact;
	}
	
	public static void iterativePermutation(String string, int fact) {
		
		String s="";
		HashSet<String> hashmap =new HashSet<>();
		Random r =new Random();
		char []ch=string.toCharArray();
		for(int i=0;i<=fact+1;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				char character = string.charAt(r.nextInt(string.length()));
				s=s+character;
			}
			hashmap.add(s);
			s="";
		}
		
		System.out.println("Permutation of String");
		Iterator iterator = hashmap.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}
	
	/***********************************************************************/

	/**
	 * @return return Searching Word in file and returning the index
	 */
	
	public static int binaryWord(String Input[],int start,int end,String key) {
		
		int mid=0;
		while(end >= start) {
			mid = (end-start)/2;
			int Result = Input[mid].compareTo(key);
			
			if(Result == 0) {
				return mid;
			}
			
			if(Result > 0) {
				start = mid +1;
			}
			else {
				end = mid -1;
			}
		
		}
		return -1;

	}
	
	/***********************************************************************/

	/**
	 * @return return Insertion Sorting on file containing String Elements
	 */
	
	public static void sortInsertion(String[] input) {
		int j;
		for (int i = 1; i < input.length; i++) {
			j = i -1;
			String temp = input[i];
			while (j>=0 && input[j].compareTo(temp)>=0) {
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = temp;
		}
		
		for (String string : input) {
			System.out.println(string);
		}
	}

	/***********************************************************************/

	/**
	 * @return return BubbleSort algorithm
	 */
	
	public static void sortBubble(int [] array) {
		
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	/***********************************************************************/

	/**
	 * @return return Checking Palindrome
	 */
	
	public static void palindrome(int num2) {
		
		int rem=0,result=0;
		int og = num2;
		while (num2 > 0) {
			rem = num2 % 10;
			result = result *10+rem;
			num2 /= 10;
		}
		
		if(result == og) {
			System.out.println("The Numbers is palindrome");
		}
		else {
			System.out.println("The Numbers is Not palindrome");
		}
	}
	
	/***********************************************************************/

	/**
	 * @return return Merge Sorting the String Elements
	 */
	
	public static void sortMerge(String[] array,int length) {
		
	if(length < 2) {
		return;
	}
	
	int mid = length/2;
	String[] input1 = new String[mid];
	String[] input2 = new String[length - mid];
	
	for (int i = 0; i < mid; i++) {
		input1[i] = array[i];
	}
	
	for (int j = mid; j < length; j++) {
		input2[j - mid] = array[j];
	}
	
	sortMerge(input1, mid);
	sortMerge(input2, length-mid);
	
	merge(array,input1,input2,mid,length-mid);
	}

	public static void merge(String[] array, String[] input1, String[] input2, int left, int right) {
		
		int i=0,j=0,k=0;
		while(i < left && j < right) {
			if(input1[i].compareTo(input2[j])< 0) {
				array[k++] = input1[i++];
			}
			else {
				array[k++] = input2[j++];
			}
		}
		
		while (i < left) {
			array[k++] = input1[i++];
		}
		
		while (j < right) {
			array[k++] = input2[j++];
		}
		
		for (String string : array) {
			System.out.println(string);
		}
	}
	
	/***********************************************************************/

	/**
	 * @return return Regex
	 */
	
	public static String regEx(String string,String name) {
		
		String result = "";
		
		Pattern p = Pattern.compile("<<name>>");
		Matcher match = p.matcher(string);
		
		while (match.find()) {
			result = string.replace(p.pattern(), name);
		}
		return result;

	}
}
