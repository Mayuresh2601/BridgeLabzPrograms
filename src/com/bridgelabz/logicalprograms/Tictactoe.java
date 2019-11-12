package com.bridgelabz.logicalprograms;

import java.util.Scanner;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to create a TIC-TAC-TOE game
 */

public class Tictactoe {
	private static final String s = "";
	static char[][] board = new char[3][3];
	static boolean tictactoe = true;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Printing the Board
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = 'N';
			}
		}
		
		int count = 1;
		try {
		//tictactoe = true
		while(tictactoe) {
			
			//Players Turn
			if(count%2==0) {
				System.out.println("Player 1 Turn");
				System.out.println("Enter the Co-ordinate of Moves: ");
				int row = scanner.nextInt();
				int cols = scanner.nextInt();
				
				//If Co-ordinates Entered Outside the Board
				if(row<0 && row>3 || cols<0 && cols>3 ) {
					System.out.println("Co-ordinates are invalid...");
					continue;
				}
				
				//If entered Co-ordinates are Already Occupied
				if (board[row][cols] == 'X' || board[row][cols] == 'O') {
					System.out.println("The co-ordinates is already taken.. Please Re-enter the co-ordinates");
					continue;
				}
				
				//Players Plays
				board[row][cols] = 'X';
				
				//Display the Board
				for (char[] cs : board) {
					System.out.println(cs);
				}
				
				//Check Player Win
				if(PlayerWin()) {
					System.out.println("Player has Won");
					break;
				}
				
				//Check Draw
				if (isDrawForPlayer()) {
					System.out.println("Game is Draw");
				}
				count++;
			}
			
			//Computer Turn
			else {
				//Taking random number Co-ordinates for Computer
				int randrow = (int) (Math.random()*3);
				int randcols = (int) (Math.random()*3);
				
				//If Random Co-ordinates are Already Occupied
				if (board[randrow][randcols] == 'X' || board[randrow][randcols] == 'O') {
					continue;
				}
				
				System.out.println("Computer Turn");
				
				//Computer Plays
				board[randrow][randcols] = 'O';
				
				//Display the Board
				for (char[] cs : board) {
					System.out.println(cs);
				}
				
				//Check Computer Win
				if(CompWin()) {
					System.out.println("Computer has Won");
					break;
				}
				
				//Check Draw
				if (isDrawForComputer()) {
					System.out.println("Game is Draw");
				}
				count++;
			}
		}
		}catch (Exception e) {
			System.err.print("Enter the Proper Co-ordinates");
		}
	}

	public static boolean CompWin() {
		String o = "OOO";
		String res1 = s.valueOf(board[0][0])+s.valueOf(board[0][1])+s.valueOf(board[0][2]);
		String res2 = s.valueOf(board[1][0])+s.valueOf(board[1][1])+s.valueOf(board[1][2]);
		String res3 = s.valueOf(board[2][0])+s.valueOf(board[2][1])+s.valueOf(board[2][2]);
		String res4 = s.valueOf(board[0][0])+s.valueOf(board[1][0])+s.valueOf(board[2][0]);
		String res5 = s.valueOf(board[0][1])+s.valueOf(board[1][1])+s.valueOf(board[2][1]);
		String res6 = s.valueOf(board[0][2])+s.valueOf(board[1][2])+s.valueOf(board[2][2]);
		String res7 = s.valueOf(board[0][0])+s.valueOf(board[1][1])+s.valueOf(board[2][2]);
		String res8 = s.valueOf(board[0][2])+s.valueOf(board[1][1])+s.valueOf(board[2][0]);
		
		if(res1.compareTo(o)==0 || res2.compareTo(o)==0 || res3.compareTo(o)==0 || res4.compareTo(o) ==0 || res5.compareTo(o) == 0 || res6.compareTo(o) == 0 || res7.compareTo(o) == 0 || res8.compareTo(o) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean PlayerWin() {
		
		String x = "XXX";
		String res1 = s.valueOf(board[0][0])+s.valueOf(board[0][1])+s.valueOf(board[0][2]);
		String res2 = s.valueOf(board[1][0])+s.valueOf(board[1][1])+s.valueOf(board[1][2]);
		String res3 = s.valueOf(board[2][0])+s.valueOf(board[2][1])+s.valueOf(board[2][2]);
		String res4 = s.valueOf(board[0][0])+s.valueOf(board[1][0])+s.valueOf(board[2][0]);
		String res5 = s.valueOf(board[0][1])+s.valueOf(board[1][1])+s.valueOf(board[2][1]);
		String res6 = s.valueOf(board[0][2])+s.valueOf(board[1][2])+s.valueOf(board[2][2]);
		String res7 = s.valueOf(board[0][0])+s.valueOf(board[1][1])+s.valueOf(board[2][2]);
		String res8 = s.valueOf(board[0][2])+s.valueOf(board[1][1])+s.valueOf(board[2][0]);
		
		if(res1.compareTo(x)==0 || res2.compareTo(x)==0 || res3.compareTo(x)==0 || res4.compareTo(x) ==0 || res5.compareTo(x) == 0 || res6.compareTo(x) == 0 || res7.compareTo(x) == 0 || res8.compareTo(x) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isDrawForPlayer() {
		
		String o = "OOO";
		String res1 = s.valueOf(board[0][0])+s.valueOf(board[0][1])+s.valueOf(board[0][2]);
		String res2 = s.valueOf(board[1][0])+s.valueOf(board[1][1])+s.valueOf(board[1][2]);
		String res3 = s.valueOf(board[2][0])+s.valueOf(board[2][1])+s.valueOf(board[2][2]);
		String res4 = s.valueOf(board[0][0])+s.valueOf(board[1][0])+s.valueOf(board[2][0]);
		String res5 = s.valueOf(board[0][1])+s.valueOf(board[1][1])+s.valueOf(board[2][1]);
		String res6 = s.valueOf(board[0][2])+s.valueOf(board[1][2])+s.valueOf(board[2][2]);
		String res7 = s.valueOf(board[0][0])+s.valueOf(board[1][1])+s.valueOf(board[2][2]);
		String res8 = s.valueOf(board[0][2])+s.valueOf(board[1][1])+s.valueOf(board[2][0]);
		
		if(res1.compareTo(o)==0 && res2.compareTo(o)==0 && res3.compareTo(o)==0 && res4.compareTo(o) ==0 && res5.compareTo(o) == 0 && res6.compareTo(o) == 0 && res7.compareTo(o) == 0 && res8.compareTo(o) == 0) {
			return true;
		}
		else {
			return false;
		}

	}
	
	public static boolean isDrawForComputer() {
		
		String o = "OOO";
		String res1 = s.valueOf(board[0][0])+s.valueOf(board[0][1])+s.valueOf(board[0][2]);
		String res2 = s.valueOf(board[1][0])+s.valueOf(board[1][1])+s.valueOf(board[1][2]);
		String res3 = s.valueOf(board[2][0])+s.valueOf(board[2][1])+s.valueOf(board[2][2]);
		String res4 = s.valueOf(board[0][0])+s.valueOf(board[1][0])+s.valueOf(board[2][0]);
		String res5 = s.valueOf(board[0][1])+s.valueOf(board[1][1])+s.valueOf(board[2][1]);
		String res6 = s.valueOf(board[0][2])+s.valueOf(board[1][2])+s.valueOf(board[2][2]);
		String res7 = s.valueOf(board[0][0])+s.valueOf(board[1][1])+s.valueOf(board[2][2]);
		String res8 = s.valueOf(board[0][2])+s.valueOf(board[1][1])+s.valueOf(board[2][0]);
		
		if(res1.compareTo(o)!=0 && res2.compareTo(o)!=0 && res3.compareTo(o)!=0 && res4.compareTo(o) !=0 && res5.compareTo(o) != 0 && res6.compareTo(o) != 0 && res7.compareTo(o) != 0 && res8.compareTo(o) != 0) {
			return true;
		}
		else {
			return false;
		}

	}

}