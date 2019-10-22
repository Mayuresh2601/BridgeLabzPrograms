package JUnitTest;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class VendingMaching {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		int quo=0,rem=0;
		int arr[] = {1000,500,200,100,50,20,10,5,2,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Money: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(num >= arr[i]) {
				quo = num / arr[i];
//				ar1.add(quo);
//				ar2.add(arr[i]);
				num = num % arr[i];
				System.out.println(arr[i]+ "    "+quo);
			}
			
		}
		
//		System.out.println("Count of the Notes are: "+ar1);
//		System.out.println("Notes removed from Vending Machine are: "+ar2);

	}

}
