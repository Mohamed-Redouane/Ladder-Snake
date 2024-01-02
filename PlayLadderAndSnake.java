// --------------------------------------------------------------------
// Assignment 1
// Question: part II
// Written by: George Ezzat   40245502
// Written by: Mohamed Nemroud  40153847
// For COMP 249 Section QQ – Winter 2023
// Date: Friday, 3rd February 2023
// --------------------------------------------------------------------

/**
* Names and IDs: George Ezzat     40245502
*                Mohamed Nemroud  40153847
* COMP249
* Assignment #1 part II
* Friday, 3rd February 2023
*/

import java.util.Scanner;

/**
 * The main class that runs the Ladder and Snake game.
 * 
 *  @author Mohamed and George.
 */
public class PlayLadderAndSnake {
	
	/**
	 * Main method to run the Ladder and Snake game
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
	

		Scanner Keyboard  = new Scanner(System.in);// Open Scanner
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Welcome to Mohamed and George's World of Ladder and Snake game"); // Welcoming message
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Please note that Player 1 is X and Player 2 is O\n");
		
		System.out.print("Please enter the number of players: ");
		int numPlayers= Keyboard.nextInt();
		
		LadderAndSnake game = new LadderAndSnake(numPlayers);
		
		if(numPlayers >= 2) {
		game.play(0,0);
		System.out.println("\nThank you for playing the ladder and the snake game!!");
		}
			
		Keyboard.close(); // close Scanner
		
	}// End of main

}// End of class