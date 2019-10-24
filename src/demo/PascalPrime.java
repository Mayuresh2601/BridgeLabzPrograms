package demo;

public class PascalPrime {

	public static void main(String[] args) {
		int count=1,count1=0,c=2,n=15;
		for (int i = 0; i < n; i++) {
			for (int j = n-2; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= count; k++) {
				
				for (int e = 1; e <= c; e++) {
					if(c%e==0) {
						count1++;
					}
					
				}
				if(count1 == 2) {
					System.out.print(c+" ");
				}
				c++;
				count1 = 0;
			}
			count = count + 2;
			System.out.println();
		}

	}

}
