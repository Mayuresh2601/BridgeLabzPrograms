package BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {
	
	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the No. of times the Coin is Flip..");
		int num = Scanner.nextInt();
		int tail=0,head=0;
		
		for (int i = 0; i < num; i++) {
			
			// Generate Random Number Between 0 and 1
			float random = (float) (Math.random());
			
			if(random <0.5) {
				tail++;
			}
			else {
				head++;
			}
		}
		
		//Calculate Percentage of Number of Tails and Heads
		int tailperc = tail*100/num;
		int headperc = head*100/num;
		
		System.out.println("Occurances of head Percentage is: "+headperc);
		System.out.println("Occurances of Tail Percentage is: "+tailperc);
	}
}