// --------------------------------------------------------------------
// Assignment 1
// Question: part 1
// Written by: George Ezzat   40245502
// Written by: Mohamed Nemroud  40153847
// For COMP 249 Section QQ – Winter 2023
// Date: Friday, 3rd February 2023
// --------------------------------------------------------------------

/**
* Names and IDs: George Ezzat     40245502
*                Mohamed Nemroud  40153847
* COMP249
* Assignment #1 part I
* Friday, 3rd February 2023
*/

import java.util.Random;
/**
 * The `LadderAndSnake` class represents the ladder and snake game.
 * It holds the board state and the player positions.
 *
 * @author Mohamed and George.
 * @version Version 1
 */
public class LadderAndSnake {
	/** The game board with dimensions 10x10. */
    private int[][] board=  new int[10][10];
    /** The number of players in the game. */
    private int numPlayers;
    /** A random number generator for determining dice rolls. */
    private Random rand;
    /** The position of player 1. */
    private int p_player1;
    /** The position of player 2. */
    private int p_player2;
    
    /**
     * Default Constructor
     * Constructs a new `LadderAndSnake` object with default values.
     */
    public LadderAndSnake() {
    	
    }
    
    /**
     * Constructs a new `LadderAndSnake` object with the given number of players.
     *
     * @param numPlayers the number of players
     * 
     * If the number of players is less than 2, an error message is displayed and the program exits.
     * If the number of players is greater than 2, a warning message is displayed and the value is set to 2.
     * The `Random` object is initialized and the positions of players are set to 0.
     */
    public LadderAndSnake(int numPlayers) {
        if (numPlayers < 2) 
        {
            System.out.println("Error: Cannot execute the game with less than 2 players! Will exit.");
            System.exit(0);
        }
        else if (numPlayers > 2) {
            System.out.println("Initialization was attempted for " + numPlayers + " members of players; however, this is only expected for an extended version the game. Value will be set to 2.");
        }
        this.numPlayers = numPlayers;
        this.rand = new Random();
        this.p_player1=0;
        this.p_player2=0;
    }
    /**
     * Constructs a new `LadderAndSnake` object as a copy of an existing `LadderAndSnake` object.
     * 
     * @param c the `LadderAndSnake` object to be copied
     * 
     * The number of players, board, random object, and player positions are all set to be equal to the values of the corresponding fields in the given `LadderAndSnake` object.
     */
    public LadderAndSnake(LadderAndSnake c) {
    	numPlayers = c.numPlayers;
    	board=c.board;
    	rand=c.rand;
    	p_player1= c.p_player1;
    	p_player2= c.p_player2;
    }
    
    // Accessor methods
    /**
     * Returns the number of players.
     * 
     * @param numPlayers the number of players to set
     * 
     * @return the number of players
     */
    public int getNumPlayers(int numPlayers) {
        return this.numPlayers= numPlayers;
    }

    /**
     * Returns the `Random` object.
     * 
     * @param rand the `Random` object to set
     * 
     * @return the `Random` object
     */
    public Random getRand(Random rand) {
        return this.rand=rand;
    }

    /**
     * Returns the position of player 1.
     * 
     * @param p_player1 the position of player 1 to set
     * 
     * @return the position of player 1
     */
    public int getP_player1(int p_player1) {
        return this.p_player1=p_player1;
    }

    /**
     * Returns the position of player 2.
     * 
     * @param p_player2 the position of player 2 to set
     * 
     * @return the position of player 2
     */
    public int getP_player2(int p_player2) {
        return this.p_player2=p_player2;
    }

    
    // Mutator methods
    /**
     * Sets the number of players.
     * 
     * @param numPlayers the number of players to set
     * 
     * @return the number of players that was just set
     */
    public int setNumPlayers1(int numPlayers) {
        return this.numPlayers= numPlayers;
    }

    /**
     * Sets the `Random` object.
     * 
     * @param rand the `Random` object to set
     * 
     * @return the `Random` object that was just set
     */
    public Random setRand(Random rand) {
        return this.rand=rand;
    }

    /**
     * Sets the position of player 1.
     * 
     * @param p_player1 the position of player 1 to set
     * 
     * @return the position of player 1 that was just set
     */
    public int setP_player1(int p_player1) {
        return this.p_player1=p_player1;
    }

    /**
     * Sets the position of player 2.
     * 
     * @param p_player2 the position of player 2 to set
     * 
     * @return the position of player 2 that was just set
     */
    public int setP_player2(int p_player2) {
        return this.p_player2=p_player2;
    }
    /**
    *Assignboard method is used to initialize the elements of 2D array board.
    *This method is assigning values to the board array starting from 100,81,80,61,60,41,40,21,20 and 1.
    *The value of elements in the first row of board array is assigned starting from 100 and decremented by 1.
    *The value of elements in the second row of board array is assigned starting from 81 and incremented by 1.
    *The value of elements in the third row of board array is assigned starting from 80 and decremented by 1.
    *The value of elements in the fourth row of board array is assigned starting from 61 and incremented by 1.
    *The value of elements in the fifth row of board array is assigned starting from 60 and decremented by 1.
    *The value of elements in the sixth row of board array is assigned starting from 41 and incremented by 1.
    *The value of elements in the seventh row of board array is assigned starting from 40 and decremented by 1.
    *The value of elements in the eighth row of board array is assigned starting from 21 and incremented by 1.
    *The value of elements in the ninth row of board array is assigned starting from 20 and decremented by 1.
    *The value of elements in the tenth row of board array is assigned starting from 1 and incremented by 1.
    */
    public void Assignboard() {
    	
    	int a =100;
    	for(int i=0 ; i< board.length; i++)
    	{
    		board[0][i]=a;
    		a--;
    	}
    	
    	int b = 81;
    	for(int i=0 ; i< board.length; i++)
    	{
    		board[1][i]=b;
    		b++;
    	}
    	
    	int c = 80;
    	for(int i=0 ; i< board.length; i++)
    	{
    		board[2][i]=c;
    		c--;
    	}
    	
    	int d = 61;
    	for(int i=0 ; i< board.length; i++)
    	{
    		board[3][i]=d;
    		d++;
    	}
    	
    	int e = 60;
    	for(int i=0 ; i< board.length; i++)
    	{
    		board[4][i]=e;
    		e--;
    	}
    	
    	int f = 41;
    	for(int i=0 ; i< board.length; i++)
    	{
    		board[5][i]=f;
    		f++;
    	}
    	
    	int g = 40;
    	for(int i=0 ; i< board.length ; i++)
    	{
    		board[6][i]=g;
    		g--;
    	}
    	
    	int h = 21;
    	for(int i=0 ; i< board.length ; i++)
    	{
    		board[7][i]=h;
    		h++;
    	}
    	
    	int j = 20;
    	for(int i=0 ; i< board.length ; i++)
    	{
    		board[8][i]=j;
    		j--;
    	}
    	
    	int k = 1;
    	for(int i=0 ; i< board.length ; i++)
    	{
    		board[9][i]=k;
    		k++;
    	}
    		
    }
    
    /**
    *The {@code printboard} method is used to display the contents of the board
    *in the form of X, O, or the number assigned to each cell in the board.
    *@param p_player1 an integer value representing the position of player 1
    *@param p_player2 an integer value representing the position of player 2
    */
    public void printboard(int p_player1 , int p_player2) {
    	
    	Assignboard();
    	
		System.out.println("*********************************************************************************");
		
		for(int i=0; i< board.length ; i++)
		{
			for(int j=0; j< board[0].length ; j++)
			{
				if(board[i][j] == p_player1)
				{
					System.out.print("|  X\t");
				}
				else if(board[i][j] == p_player2)
				{
					System.out.print("|  O\t");
				}
				else 
				System.out.print("|  "+board[i][j]+"\t");
			}
			System.out.println("|");
			System.out.println("*********************************************************************************");
		}
	}
    
    /**
    *The method flipDice generates a random integer between 1 and 6 inclusive and returns the value.
    *@return An int value between 1 and 6, inclusive.
    */
    
    public int flipDice() {
    
    		return rand.nextInt(6)+1;
    }
    
     /**
     * The `play` method is used to simulate the game of Snakes and Ladders between two players. The order of play is determined
     * by each player rolling a dice and the player with the higher value will go first. If both players roll the same value, they
     * keep rolling until a winner is determined. The game continues until one of the players reaches the end of the board.
     * 
     * @param p_player1 The position of Player 1 on the board
     * @param p_player2 The position of Player 2 on the board
     */
    public void play(int p_player1 , int p_player2) {
    	
    	// Determine the order of play
        int player1Roll = flipDice();
        int player2Roll = flipDice();
        
        int attempts = 1;
        
        System.out.println("\nNow deciding which player will start playing:");
        
        while (player1Roll == player2Roll) {
        	
        	System.out.println("Player 1 got a dice value of "+player1Roll+".");
            System.out.println("Player 2 got a dice value of "+player2Roll+".");
            System.out.println("A tie was achieved between Player 1 and Player 2. Attempting to break the tie.");
            attempts++;
        	player1Roll = flipDice();
            player2Roll = flipDice();
        }
       
        int currentPlayer = 0;
        
        if (player1Roll > player2Roll) {
        	currentPlayer=1;
        	System.out.println("Player 1 got a dice value of "+player1Roll+".");
            System.out.println("Player 2 got a dice value of "+player2Roll+".");
        	System.out.println("Reached final decision on order of playing: Player "+currentPlayer+" then Player "+ (currentPlayer+1) +". It took "+ attempts + " attempts before a decision could be made.\n");
        }
        if (player1Roll < player2Roll) {
        	currentPlayer=2;
        	System.out.println("Player 1 got a dice value of "+player1Roll);
            System.out.println("Player 2 got a dice value of "+player2Roll);
        	System.out.println("Reached final decision on order of playing: Player "+currentPlayer+" then Player "+ (currentPlayer-1) +". It took "+ attempts + " attempts before a decision could be made.\n"); 
    	}
        
        Assignboard();
          
        // Game process
        while(p_player1 < board[0][0] && p_player2 < board[0][0])
        {
        	        
        if(currentPlayer == 1) {
        	System.out.println("Player "+currentPlayer+"'s turn:");
        	player1Roll = flipDice();
        	p_player1+= player1Roll;
        	p_player1 = Player1(p_player1,player1Roll);
        	if(p_player1 == board[0][0])
        	{
        		System.out.println("Game Over!");
        		break;
        	}
        }
        else if (currentPlayer == 2) {
        	System.out.println("Player "+currentPlayer+"'s turn:");
        	player2Roll = flipDice();
        	p_player2+= player2Roll;
        	p_player2= Player2(p_player2,player2Roll);
        	if(p_player2 == board[0][0])
        	{
        		System.out.println("Game Over!");
        		break;
        	}
        }
        
        // Players at the same cell between the other player play
    	if( (currentPlayer+1) == 2 && p_player1==p_player2)
        {
        	p_player2=0;
        }
        else if ( (currentPlayer-1) == 1 && p_player2==p_player1)
        {
        	p_player1=0;
        }
    	
     		if(currentPlayer == 1) {
        	System.out.println("Player "+(currentPlayer+1)+"'s turn:");
        	player2Roll = flipDice();
        	p_player2+= player2Roll;
        	p_player2= Player2(p_player2,player2Roll);
        	if(p_player2 == board[0][0])
        	{
        		System.out.println("Game Over!");
        		break;
        	}
        }
        else if (currentPlayer == 2) {
    	    System.out.println("Player "+(currentPlayer-1)+"'s turn:");
        	player1Roll = flipDice();
        	p_player1+= player1Roll;
        	p_player1 = Player1(p_player1,player1Roll);
        	if(p_player1 == board[0][0]) 
        	{
        		System.out.println("Game Over!");
        		break;
        	}
        }
    	
        // Players at the same cell after both players plays
    	if(currentPlayer == 1 && p_player2==p_player1)
        {
        	p_player1=0;
        }
        else if (currentPlayer == 2 && p_player1==p_player2)
        {
        	p_player2=0;
        }
         
        if(p_player1 != board[0][0] || p_player2 != board[0][0]) {
        System.out.println("Game not over; flipping again");
        }
    	
    	System.out.println("");
        printboard(p_player1 , p_player2);
        System.out.println(""); 
     }
        
        System.out.println("");
        printboard(p_player1,p_player2);
        System.out.println("");
        
        // Winning condition
        if(p_player1 == board[0][0]) {
    		System.out.println("Congratulations to player 1 and hard Luck to player 2");
    	}	
    	else if(p_player2 == board[0][0]) {
    		System.out.println("Congratulations to player 2 and hard Luck to player 1");
    	}
  }
    
    /**
    *The method Player1 calculates the new position of player 1 based on the current position and dice roll value.
    *The board is represented by a 2D array board[][]. The method uses the value of p_player1 to determine the current
    *position of player 1 and uses the player1Roll to determine the value of dice roll.
    *@param p_player1 The current position of player 1.
    *@param player1Roll The dice roll value of player 1.
    *@return The new position of player 1 after moving based on the current position and dice roll value.
    */
    public int Player1(int p_player1, int player1Roll) {
    	
    	if(p_player1==board[9][0])
    	{
    	     System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+ p_player1+" then up to square "+board[6][2]);
    	     return board[6][2];
    	}  
    	else if(p_player1==board[9][3])
    	{
    	     System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then up to square "+board[8][6]);
    	     return board[8][6];
    	} 
    	else if(p_player1==board[9][8])
    	{
   	     	System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then up to square "+board[6][9]);
   	     	return board[6][9];
    	}
    	else if(p_player1==board[7][0])
    	{
    	     System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then up to square "+board[5][1]);
    	     return board[5][1];
    	}  
    	else if(p_player1==board[7][7])
    	{
    		 System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then up to square "+board[1][3]);
    	     return board[1][3];    	
    	}
    	else if(p_player1==board[6][4])
    	{
    		System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then up to square "+board[5][3]);
    		return board[5][3];
    	}
    	else if(p_player1==board[4][9])
    	{
    		System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then up to square "+board[3][6]);
    		return  board[3][6];
    	}
    	else if(p_player1==board[2][9])
    	{
    		System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then up to square "+board[0][9]);
    	     return board[0][9];
    	}
    	else if(p_player1==board[2][0])
    	{ 
    		System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then up to square "+board[0][0]);
    	     return board[0][0];
    	}
    	else if(p_player1==board[8][4])
    	{
    	     System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[9][5]);
    	     return board[9][5];
    	}  
    	else if(p_player1==board[5][7])
    	{
    		 System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[6][9]);
    	     return board[6][9];
    	}    
    	else if(p_player1==board[3][3])
    	{ 
    		 System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[4][0]);
    		 return board[4][0];
    	}    
    	else if(p_player1==board[2][1])
    	{
    		System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[8][1]);
    		return board[8][1]; 
       	}
    	else if(p_player1==board[0][7])
    	{
    		System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[3][7]);
    		return  board[3][7];
    	}
    	else if(p_player1==board[0][5])
    	{
    		System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[7][3]);
    		return  board[7][3];
    	}
    	else if(p_player1==board[0][3])
    	{
    	     System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[2][4]);
    	     return  board[2][4];
    	}
    	else if(p_player1==board[0][2])
    	{   
    		System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[2][2]);
    		return  board[2][2];
    	}
    	else if(p_player1 >board[0][0]) {
            p_player1 = 100-(player1Roll-(100-(p_player1-player1Roll)));
            
    		if(p_player1==board[0][5])
        	{
        		System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[7][3]);
        		return  board[7][3];
        	}
        	else if(p_player1==board[0][3])
        	{
        	     System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[2][4]);
        	     return  board[2][4];
        	}
        	else if(p_player1==board[0][2])
        	{   
        		System.out.println("Player 1 got a dice value of "+player1Roll+" gone to square "+p_player1+" then down to square "+board[2][2]);
        		return  board[2][2];
        	}
        	else 
        		System.out.println("Player 1 got a dice value of "+player1Roll+"; now in square "+p_player1);
        		
    		
    		return p_player1;
    	}
    	else 
        	System.out.println("Player 1 got a dice value of "+player1Roll+"; now in square "+p_player1);
    	
    	return p_player1;
    }
    
    /**
    *The Player2 method calculates the new position of Player 2 on the game board after rolling a dice.
    *@param p_player2 the current position of Player 2
    *@param player2Roll the result of the dice roll
    *@return the new position of Player 2 on the game board
    *The method checks the current position of Player 2 and based on the specific position it moves
    *to another position on the board. The new position is returned by the method. If the position of
    *Player 2 is not one of the specific positions, the method returns the current position.
    */
    public int Player2(int p_player2, int player2Roll) {  
    	
    	if(p_player2==board[9][0])
    	{ 
    	     System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then up to square "+board[6][2]);
    	     return board[6][2];
    	}  
    	else if(p_player2==board[9][3])
    	{
    		 System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then up to square "+board[8][6]);
    	     return board[8][6];
    	} 
    	else if(p_player2==board[9][8])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then up to square "+board[6][9]);
    		return board[6][9];
    	}
    	else if(p_player2==board[7][0])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then up to square "+board[5][1]);
    		return board[5][1];
    	}  
    	else if(p_player2==board[7][7])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then up to square "+board[1][3]);
    		return board[1][3];
    	}
    	else if(p_player2==board[6][4])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then up to square "+board[5][3]);
    		return board[5][3];
    	}
    	else if(p_player2==board[4][9])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then up to square "+board[3][6]);
    		return board[3][6];
    	}
    	else if(p_player2==board[2][9])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then up to square "+ board[0][9]);
    		return board[0][9];
    	}
    	else if(p_player2==board[2][0])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then up to square "+ board[0][0]);
    		return board[0][0];
    	}
    	else if(p_player2==board[8][4])
    	{ 
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[9][5]);
    		return board[9][5];
    	}  
    	else if(p_player2==board[5][7])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[6][9]);
    		return board[6][9];
    	}    
    	else if(p_player2==board[3][3])
    	{
    		 System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[4][0]);
    		 return board[4][0];
    	}    
    	else if(p_player2==board[2][1])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[8][1]);
    		return board[8][1];
    	}
    	else if(p_player2==board[0][7])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[3][7]);
    		return board[3][7];
    	}
    	else if(p_player2==board[0][5])
    	{
    		 System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[7][3]);
    		 return board[7][3];
    	}
    	else if(p_player2==board[0][3])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[2][4]);
    		return board[2][4]; 
    	}
    	else if(p_player2==board[0][2])
    	{
    		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[2][2]);
    		 return board[2][2];
    	 }
    	else if(p_player2 >board[0][0]) {
            p_player2 = 100-(player2Roll-(100-(p_player2-player2Roll)));
   
    		if(p_player2==board[0][5])
        	{
        		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[7][3]);
        		return  board[7][3];
        	}
        	else if(p_player2==board[0][3])
        	{
        	     System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[2][4]);
        	     return  board[2][4];
        	}
        	else if(p_player2==board[0][2])
        	{   
        		System.out.println("Player 2 got a dice value of "+player2Roll+" gone to square "+p_player2+" then down to square "+board[2][2]);
        		return  board[2][2];
        	}
        	else
        		System.out.println("Player 2 got a dice value of "+player2Roll+"; now in square "+p_player2);
    		
    		return p_player2;
    	}
        else
    		System.out.println("Player 2 got a dice value of "+player2Roll+"; now in square "+p_player2);
    	
    	return p_player2;
    }
    
}// End of LadderAndSnake class