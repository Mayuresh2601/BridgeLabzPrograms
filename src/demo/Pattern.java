package demo;

public class Pattern {

	public static void main(String[] args) {
//		int i,j,k;
		int n =4,number = 1;
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			number = 1;
			for (int k = 0; k <= i; k++) {
				System.out.print(number + " ");
				number = number * (i - k)/(k + 1);
			}
			for (int l = 0; l < i; l++) {
				System.out.print(number + " ");
			}
			
			System.out.println();
		}

	}

}
