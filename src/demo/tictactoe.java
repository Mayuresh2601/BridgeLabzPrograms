package demo;
//264
//237
import java.util.Random;
import java.util.Scanner;

public class tictactoe {
	
	public static boolean PlayerWin() {
		
		return ((board[0][0] + board[0][1] + board[0][2] == 264) || 
				(board[1][0] + board[1][1] + board[1][2] == 264) ||
				(board[2][0] + board[2][1] + board[2][2] == 264) ||
				(board[0][0] + board[1][0] + board[2][0] == 264) ||
				(board[0][1] + board[1][1] + board[2][1] == 264) ||
				(board[0][2] + board[1][2] + board[2][2] == 264) ||
				(board[0][0] + board[1][1] + board[2][2] == 264) ||
				(board[0][2] + board[1][1] + board[2][0] == 264));
	}
	
	public static boolean CompWin() {
		
		return ((board[0][0] + board[0][1] + board[0][2] == 237) || 
				(board[1][0] + board[1][1] + board[1][2] == 237) ||
				(board[2][0] + board[2][1] + board[2][2] == 237) ||
				(board[0][0] + board[1][0] + board[2][0] == 237) ||
				(board[0][1] + board[1][1] + board[2][1] == 237) ||
				(board[0][2] + board[1][2] + board[2][2] == 237) ||
				(board[0][0] + board[1][1] + board[2][2] == 237) ||
				(board[0][2] + board[1][1] + board[2][0] == 237));
	}
	
	
	public static char board[][] = new char[3][3];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = 'N';
			}
		}
		int count = 2;
		while(true) {
			if(count % 2 == 0) {
				System.out.println("Enter the Co-ordinated of x and y position:");
				int row = sc.nextInt();
				int col = sc.nextInt();
				if(board[row][col] == 'N') {
					board[row][col] = 'X';
					count++;
					if(PlayerWin()) {
						System.out.println("Player has Won");
					}
				}
				else {
//					if (board[row][col] == 'X') {
//						System.out.println("X is already occupied on the Co-ordinates");
//					}
//					else if(board[row][col] == 'O'){
//						System.out.println("O is already occupied on the Co-ordinates");
//					}
					
				}
				
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board.length; j++) {
						System.out.print(board[i][j] +"  ");
					}
					System.out.println();
				}
			}
			else {
				Random rand = new Random();
				int randrow = rand.nextInt(2);
				int randcol = rand.nextInt(2);
				if(board[randrow][randcol] == 'N') {
					board[randrow][randcol] = 'O';
					count++;
					if(CompWin()) {
						System.out.println("Computer has Won");
					}
				}
				else {
////					int randrow1 = rand.nextInt(3);
////					int randcol2 = rand.nextInt(3);
////					
////					if(arr[randrow1][randcol2] == 'N') {
////						arr[randrow1][randcol2] = 'O';
//					if (board[randrow][randcol] == 'O') {
//						System.out.println("O is already occupied on the Co-ordinates");
//					}
//					else {
//						System.out.println("X is already occupied on the Co-ordinates");
//					}
					
				}
			}
		}

	}

}
