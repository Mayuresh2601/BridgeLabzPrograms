package AlgorithmPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int Limit = 1000;
		String input="";
		for (int i = 2; i <=Limit ; i++) {
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				input = input + i + " ";
			}
		}
		System.out.println("Prime Number Between 0 to 1000 are: ");
		System.out.println(input);

	}

}
