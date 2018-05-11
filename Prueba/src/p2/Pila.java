package p2;

public class Pila {  // save as Board.java
	   // Named-constants for the dimensions
	   public static final int ROWS = 3;

	 
	   // package access
	   Cell[][] cells;  // a board composes of ROWS-by-COLS Cell instances
	   int currentRow;  // the current Elemento's row and column
	 
	   /** Constructor to initialize the game board */
	   public Pila() {
	      cells = new Cell[ROWS];  // allocate the array
	      for (int row = 0; row < ROWS; ++row) {
	            cells[row] = new Cell(row, col); // allocate element of the array
	      }
	   }
	 
	   /** Initialize (or re-initialize) the contents of the game board */
	   public void init() {
	      for (int row = 0; row < ROWS; ++row) {
	            cells[row].clear();  // clear the cell content
	      }
	   }
	 
	   /** Return true if it is a draw (i.e., no more EMPTY cell) */
	   public boolean isDraw() {
	      for (int row = 0; row < ROWS; ++row) {
	            if (cells[row].content == Elemento.EMPTY) {
	               return false; // an empty Elemento found, not a draw, exit
	            }
	         }
	      }
	      return true; // no empty cell, it's a draw
	   }
	 
	   /** Return true if the player with "theElemento" has won after placing at
	       (currentRow, currentCol) */
	   public boolean hasWon(Elemento theElemento) {
	      return (cells[currentRow][0].content == theElemento         // 3-in-the-row
	                   && cells[currentRow][1].content == theElemento
	                   && cells[currentRow][2].content == theElemento
	              || cells[0][currentCol].content == theElemento      // 3-in-the-column
	                   && cells[1][currentCol].content == theElemento
	                   && cells[2][currentCol].content == theElemento
	              || currentRow == currentCol            // 3-in-the-diagonal
	                   && cells[0][0].content == theElemento
	                   && cells[1][1].content == theElemento
	                   && cells[2][2].content == theElemento
	              || currentRow + currentCol == 2    // 3-in-the-opposite-diagonal
	                   && cells[0][2].content == theElemento
	                   && cells[1][1].content == theElemento
	                   && cells[2][0].content == theElemento);
	   }
	 
	   /** Paint itself */
	   public void paint() {
	      for (int row = 0; row < ROWS; ++row) {
	         for (int col = 0; col < COLS; ++col) {
	            cells[row][col].paint();   // each cell paints itself
	            if (col < COLS - 1) System.out.print("|");
	         }
	         System.out.println();
	         if (row < ROWS - 1) {
	            System.out.println("-----------");
	         }
	      }
	   }
	}

