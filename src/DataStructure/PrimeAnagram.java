package DataStructure;

public class PrimeAnagram {
	
	public static boolean isPrime(int num) {
		int count=0;
		
		for (int i = num; i >= 1; i--) {
			if(num%i==0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isPalindrome(int num) {
		
		int og = num;
		int rem=0,result=0;
		
		while (num > 0) {
			rem = num % 10;
			result = result *10 + rem;
			num /= 10;
		}
		
		if(result == og) {
			return true;
		}
		else {
			return false;
		}
	}


	
	public static void main(String[] args) {
		
		int array2d[][];
		int array1d[];
		
		int i=2,limit=1000;
		
		while (i<limit) {
			if(isPrime(i)==true) {
				if(isPalindrome(i)==true) {
					
				}
			}
		}
		
	}

}
