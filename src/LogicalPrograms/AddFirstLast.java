package LogicalPrograms;

import java.util.Scanner;

public class AddFirstLast {

	public static void main(String[] args) {
		int count = 0,rem=0,k=0,result=0;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = Scanner.nextInt();
		
		int og = num;
		
		while (num > 0) {
			count++;
			num = num / 10;
		}
		
		num = og;
		int[] arr = new int[count];
		while (num > 0) {
			rem = num%10;
			arr[k] = rem;
			k++;
			num = num/10;
		}
		
		if (count % 2 != 0) {
			for (int i = 0; i < count; i=i+2) {
				result = result + arr[i];
			}
		}
		else{
			for (int i = 1; i < count; i=i+2) {
				result = result + arr[i];
			}
		}
		
		
		System.out.println("The Result is: "+result);
	}

}