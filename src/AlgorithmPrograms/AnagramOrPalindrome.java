package AlgorithmPrograms;

import UtilityPackage.Utility;

public class AnagramOrPalindrome {

	public static void main(String[] args) {

		Utility u = new Utility();
		int n = 1000,rem=0,result=0;
		String str = "";
		
		for (int i = 2; i < 1000 ; i++) {
			int og = i;
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				while(i > 0) {
					rem = i%10;
					result = result*10 + rem;
					i /= 10;
				}
				
				if(og == result) {
					str = str + result + "  "; 
					System.out.println(str);
				}
			}
		}
		
	
		
	}

}
