package DataStructure;

public class PrimeNumber2D {
	
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

	public static void main(String[] args) {
		int m=8,n=21;
		int[][] array2d = new int[10][25];
		int[] array1d = new int[m*n];
		
		int num =2,q=0;
		
		while(q < m*n)
		{
			if(isPrime(num)==true)
			{
				array1d[q] = num;
				q++;
			}
			num++;
		}

		// for 2D Array.
		int x = 0;
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<q; j++)
			{
				array2d[i][j] = array1d[x];
				x++;
			}
		}

		// printing the result in 2D Array.
		System.out.println("The Final Array is : ");
		for(int i=0; i<10; i++)
		{
			for(int j=0; num < 100; j++)
			{

					System.out.print(array2d[i][j]+"  ");
				
			}
			System.out.println();
		}
	}

}
