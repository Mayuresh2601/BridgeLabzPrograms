package UtilityPackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import AlgorithmPrograms.Generics;
import AlgorithmPrograms.RegEx;
import DataStructure.UnorderedList.T;


public class Utility {
	
	Scanner sc=new Scanner(System.in);

	/**
	 * @return return String input
	 */
	
	public String readString()
	{
		return sc.nextLine();
	}
	
	/*********************************************************************/

	/**
	 * @return return Integer input
	 */
	
	public int readInteger()
	{
		return sc.nextInt();
	}
	
   /***********************************************************************/

	/**
	 * @return return Double input
	 */
	public double readDouble()
	{
		return sc.nextDouble();
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
		String sb="";
		HashSet<String> h=new HashSet<String>();
		for(int i=0;i < number;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				char c=ch[random.nextInt(ch.length)];
				sb=sb+c;
			}
			h.add(sb);
			sb="";
		}
		Iterator iterator = h.iterator();
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
	
	public static void celsiusConvert(float c) {
		float fahrenheit = (c * 9/5)+ 32;
		System.out.println("After convertion Value is: "+fahrenheit);
	}
	
	public static void fahrenheitConvert(float f) {
		float celsius = (f * 9/5)+ 32;
		System.out.println("After convertion Value is: "+celsius);
	}
	
	/***********************************************************************/

	/**
	 * @return return Monthly Pay
	 */
	
	public static void monthlyPay(int P,int Y, int R) {
		
		int n = 12 * Y;
		float r = R / (12 * 100);
		float payment = (P * r) / 1 - (float) (Math.pow(1+r, -n));
		System.out.println("Monthly Payment have to make in a year is: "+payment);
	}
	
	/***********************************************************************/

	/**
	 * @return return Proper SquareRoot
	 */
	
	public static void sqrt(int c) {
		int t = c;
		double epsilon = 1e-15;

		while(Math.abs(t - c/t) > epsilon * t) {
			t = (c/t+t)/2;
		}
		System.out.println(t);
	}
	
	/***********************************************************************/

	/**
	 * @return return My Binary Logic
	 */
	
	public static void myBinary(int num) {
		
		String binary = "";
		int arr[] = new int[32];
		int og = num;
		for (int i = 31; i >=0; i--) {
			if(num >= Math.pow(2, i)) {
				binary = binary + "1" + " ";
				num = num - (int) Math.pow(2, i);
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
		
		while (number > 0) {
			array[c] = number%2;
			number /= 10;
			c++;
		}
		
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
		
//		while(binary != null) {
//			array[k] = number%2;
//			number = number/2;
//			k++;
//		}
		
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
	
	public static void iterativePermutation(String str, int fact) {
		
		String l="";
		HashSet<String> h =new HashSet<>();
		Random r =new Random();
		char []ch=str.toCharArray();
		for(int i=0;i<=fact+1;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				char c = str.charAt(r.nextInt(str.length()));
				l=l+c;
			}
			h.add(l);
			l="";
		}
		
		System.out.println("Permutation of String");
		Iterator iterator = h.iterator();
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

	public static void merge(String[] array, String[] Input1, String[] Input2, int left, int right) {
		
		int i=0,j=0,k=0;
		while(i < left && j < right) {
			if(Input1[i].compareTo(Input2[j])< 0) {
				array[k++] = Input1[i++];
			}
			else {
				array[k++] = Input2[j++];
			}
		}
		
		while (i < left) {
			array[k++] = Input1[i++];
		}
		
		while (j < right) {
			array[k++] = Input2[j++];
		}
		
		for (String string : array) {
			System.out.println(string);
		}
	}
	
	/***********************************************************************/

	/**
	 * @return return Regex
	 */
	
	public static String regEx(String str,String name) {
		
		String result = "";
		
		Pattern p = Pattern.compile("<<name>>");
		Matcher match = p.matcher(str);
		
		while (match.find()) {
			result = str.replace(p.pattern(), name);
		}
		return result;

	}
	
	/***********************************************************************/

	/**
	 * @return return Bubble Sorting Using Generics
	 */
	
	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
		T temp;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i].compareTo(array[j]) >=0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (T e : array) {
			System.out.print(e+ "  ");
		}
		System.out.println();
	}
	
	/***********************************************************************/

	/**
	 * @return return Insertion Sorting using Generics
	 */
	
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		T temp;
		
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			int j = i-1;
			while (j<=0 && array[j].compareTo(temp)>=0) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}
		
		for (T e : array) {
			System.out.print(e+ "  ");
		}
		System.out.println();
	}
	
	/***********************************************************************/

	/**
	 * @return return Merge Sorting Using Generics
	 */
	
//	public static <T> void mergeSort(T[] arr,Integer end) {
//		//extends Comparable<E>
//		
//		Generics<T> gen = new Generics<T>();
//		int start = 0;
//		
//		if(end < 2) {
//			return;
//		}
//		int a[] =new int[4];
//		
//		
//		int mid = start +(end-start)/2;
//		T[] arr1 = (T[]) Array.newInstance(gen.type, mid);
//		
//		T[] arr2 = null;
//		
//		for (int i = 0; i < mid; i++) {
//			arr1[i] = arr[i];
//		}
//		
//		for (int j = mid; j < arr.length; j++) {
//			arr2[j-mid] = arr[j];
//		}
//		
//		mergeSort(arr1, mid);
//		mergeSort(arr2, end-mid);
//		mergeGeneric(arr,arr1,arr2,mid,end-mid);
//	}
//
//	public static <T extends Comparable<T>> void mergeGeneric(T[] arr, T[] arr1, T[] arr2, int left, int right) {
//		int i=0,j=0,k=0;
//		
//		while (i < left && j < right) {
//			if(arr1[i].compareTo(arr2[j]) <0) {
//				arr[k++] = arr1[i++]; 
//			}
//			else {
//				arr[k++] = arr2[j++];
//			}
//		}
//		
//		while (i < left) {
//			arr[k++] = arr1[i++];
//		}
//		
//		while (j < right) {
//			arr[k++] = arr2[j++];
//		}
//		
//		for (T e : arr) {
//			System.out.println(e+ "  ");
//		}
//	}
	
	/*****************************DataStructure Programs*******************************************/
	/******************************************************************************************/
			/**
			 * @author Mayuresh Sunil Sonar
			 * @Modified on  26-10-2019
			 * @Purpose :-Data Structure Programs
			 */ 
	
	/***********************************************************************/
	
	/***********************************************************************/

	/**
	 * @return return Unorder List using Bubble sort to compare Element
	 */
	
	private T head = null;
	
	public class T{
		private T value;
		private T next;
	}
	

	public static <T extends Comparable<T>>void add(T item) {
//		T node = new T();
//		node.value = item;
//		node.next = null;
//		
//		if(head == null) {
//			head = node;
//		}
//		else {
//			node.next = head;
//			head = node;
//		}
//		
//		while (node.next != null) {
//			System.out.println(node.value+ "  ");
//		}
		
		T head=null;
		T next = null;
		if(head == null) {
			head = item;
			next = null;
		}
		if(head != null) {
			System.out.println(head+ "  ");
		}
		
	}
	public static <T extends Comparable<T>> void unOrderList(ArrayList<T> arraylist,Object key) {
		
		boolean present = false;
		for (int i = 0; i < arraylist.size(); i++) {
			if (arraylist.get(i).compareTo((T) key)==0) {
				System.out.println("Element is Present");
				present = true;
			}
		}
		
		for (int i = 0; i < arraylist.size(); i++) {
			if(arraylist.get(i).compareTo((T) key) !=0) {
				System.out.println("Element Not Present");
				present = false;
			}
		}
		
		if(present==true) {
			arraylist.add((T) key);
		}
		
		for (Object t : arraylist) {
			System.out.println(t+ " ");
		}
		
		
	}
	
}
