package p2;

import java.util.Scanner;


public class PilaPOO {
	   private Pila board;            // the game board
	   private Estado currentState; // the current state of the game (of enum Estado)
	   private Elemento currentPlayer;     // the current player (of enum Elemento)
	 
	   private static Scanner in = new Scanner(System.in);  // input Scanner
	 
	   /** Constructor to setup the game */
	   public PilaPOO() {
	      board = new Pila();  // allocate game-board
	 
	      // Initialize the game-board and current status
	      initGame();
	      // Play the game once. Players CROSS and NOUGHT move alternately.
	      do {
	         playerMove(currentPlayer); // update the content, currentRow and currentCol
	         board.paint();             // ask the board to paint itself
	         updateGame(currentPlayer); // update currentState
	         // Print message if game-over
	         if (currentState == Estado.CROSS_WON) {
	            System.out.println("'X' won! Bye!");
	         } else if (currentState == Estado.NOUGHT_WON) {
	            System.out.println("'O' won! Bye!");
	         } else if (currentState == Estado.DRAW) {
	            System.out.println("It's Draw! Bye!");
	         }
	         // Switch player
	         currentPlayer = (currentPlayer == Elemento.CROSS) ? Elemento.NOUGHT : Elemento.CROSS;
	      } while (currentState == Estado.PLAYING);  // repeat until game-over
	   }
	 
	   /** Initialize the game-board contents and the current states */
	   public void initGame() {
	      board.init();  // clear the board contents
	      currentPlayer = Elemento.CROSS;       // CROSS plays first
	      currentState = Estado.PLAYING; // ready to play
	   }
	 
	   /** The player with "theElemento" makes one move, with input validation.
	       Update Cell's content, Board's currentRow and currentCol. */
	   public void playerMove(Elemento theElemento) {
	      boolean validInput = false;  // for validating input
	      do {
	         if (theElemento == Elemento.CROSS) {
	            System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
	         } else {
	            System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
	         }
	         int row = in.nextInt() - 1;
	         int col = in.nextInt() - 1;
	         if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
	               && board.cells[row][col].content == Elemento.EMPTY) {
	            board.cells[row][col].content = theElemento;
	            board.currentRow = row;
	            board.currentCol = col;
	            validInput = true; // input okay, exit loop
	         } else {
	            System.out.println("This move at (" + (row + 1) + "," + (col + 1)
	                  + ") is not valid. Try again...");
	         }
	      } while (!validInput);   // repeat until input is valid
	   }
	 
	   /** Update the currentState after the player with "theElemento" has moved */
	   public void updateGame(Elemento theElemento) {
	      if (board.hasWon(theElemento)) {  // check for win
	         currentState = (theElemento == Elemento.CROSS) ? Estado.CROSS_WON : Estado.NOUGHT_WON;
	      } else if (board.isDraw()) {  // check for draw
	         currentState = Estado.DRAW;
	      }
	      // Otherwise, no change to current state (still Estado.PLAYING).
	   }
	 
	   /** The entry main() method */
	   public static void main(String[] args) {
	      new GameMain();  // Let the constructor do the job
	   }
	}
