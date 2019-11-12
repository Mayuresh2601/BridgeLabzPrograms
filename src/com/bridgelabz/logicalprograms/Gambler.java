package com.bridgelabz.logicalprograms;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to Calculate the Percentage of Wins and Looses of the Gambler
 */

public class Gambler {

	public static void main(String[] args) {
		
		int stake = 10;
		int goal = 10;
		int number = 10,lose=0,win=0;
		
		for (int i = 0; i < number; i++) {
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
		
		int Winner = win*100/number;
		int Looser = lose*100/number;
		
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
