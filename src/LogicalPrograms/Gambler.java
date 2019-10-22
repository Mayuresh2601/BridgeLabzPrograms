package LogicalPrograms;

public class Gambler {

	public static void main(String[] args) {
		
		int stake = 10;
		int goal = 10;
		int num = 10,lose=0,win=0;
		
		for (int i = 0; i < num; i++) {
			float gamble = (float) (Math.random()*2);
			if(gamble < 1) {
				stake--;
				lose++;
			}
			else {
				stake++;
				win++;
			}
		
		}
		
		int Winner = win*100/num;
		int Looser = lose*100/num;
		
		System.out.println("Overall Gambler has Won "+ Winner+ " Percentage");
		System.out.println("Overall Gambler has Loose "+ Looser+ " Percentage");
		
		if(win == lose) {
			System.out.println("Gambler Not Win Nor Lose");
		}
		else if(stake >= goal) {
			System.out.println("gambler has Won");
		}
		else {
			System.out.println("Gambler has Broke");
		}
		
		
	}
}
