package control4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Two-player console, non-graphics, non-OO version.
 * All variables/methods are declared as static (belong to the class)
 *  in the non-OO version.
 */

public class Gato_control {
   // Name-constants to represent the seeds and cell contents
   public static final int EMPTY = 0;
   public static final int CROSS = 1;
   public static final int NOUGHT = 2;
 
   // Name-constants to represent the various states of the game
   public static final int PLAYING = 0;
   public static final int DRAW = 1;
   public static final int CROSS_WON = 2;
   public static final int NOUGHT_WON = 3;
 
   // The game board and the game status
   public static final int ROWS = 3, COLS = 3; // number of rows and columns
   public static int[][] board = new int[ROWS][COLS]; // game board in 2D array
                                                      //  containing (EMPTY, CROSS, NOUGHT)
   public static int currentState;  // the current state of the game
                                    // (PLAYING, DRAW, CROSS_WON, NOUGHT_WON)
   public static int currentPlayer; // the current player (CROSS or NOUGHT)
   public static int currntRow, currentCol; // current seed's row and column
 
   public static Scanner in = new Scanner(System.in); // the input Scanner
 
 
   /** Initialize the game-board contents and the current states */
   public static void initGame() {
      for (int row = 0; row < ROWS; ++row) {
         for (int col = 0; col < COLS; ++col) {
            board[row][col] = EMPTY;  // all cells empty
         }
      }
      currentState = PLAYING; // ready to play
      currentPlayer = CROSS;  // cross plays first
   }
 
   /** Player with the "theSeed" makes one move, with input validation.
       Update global variables "currentRow" and "currentCol". */
   public static void playerMove(int theSeed) {
      boolean validInput = false;  // for input validation
      do {
         if (theSeed == CROSS) {
            System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
         } else {
            System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
         }
         int row = in.nextInt() ;  // array index starts at 0 instead of 1
         int col = in.nextInt() ;
         if (row >= 0 && row < ROWS && col >= 0 && col < COLS && board[row][col] == EMPTY) {
            currntRow = row;
            currentCol = col;
            board[currntRow][currentCol] = theSeed;  // update game-board content
            validInput = true;  // input okay, exit loop
         } else {
            System.out.println("This move at (" + (row + 1) + "," + (col + 1)
                  + ") is not valid. Try again...");
         }
      } while (!validInput);  // repeat until input is valid
   }
 
   /** Update the "currentState" after the player with "theSeed" has placed on
       (currentRow, currentCol). */
   public static void updateGame(int theSeed, int currentRow, int currentCol) {
      if (hasWon(theSeed, currentRow, currentCol)) {  // check if winning move
         currentState = (theSeed == CROSS) ? CROSS_WON : NOUGHT_WON;
      } else if (isDraw()) {  // check for draw
         currentState = DRAW;
      }
      // Otherwise, no change to currentState (still PLAYING).
   }
 
   /** Return true if it is a draw (no more empty cell) */
   // TODO: Shall declare draw if no player can "possibly" win
   public static boolean isDraw() {
      for (int row = 0; row < ROWS; ++row) {
         for (int col = 0; col < COLS; ++col) {
            if (board[row][col] == EMPTY) {
               return false;  // an empty cell found, not draw, exit
            }
         }
      }
      return true;  // no empty cell, it's a draw
   }
 
   /** Return true if the player with "theSeed" has won after placing at
       (currentRow, currentCol) */
   public static boolean hasWon(int theSeed, int currentRow, int currentCol) {
      return (board[currentRow][0] == theSeed         // 3-in-the-row
                   && board[currentRow][1] == theSeed
                   && board[currentRow][2] == theSeed
              || board[0][currentCol] == theSeed      // 3-in-the-column
                   && board[1][currentCol] == theSeed
                   && board[2][currentCol] == theSeed
              || currentRow == currentCol            // 3-in-the-diagonal
                   && board[0][0] == theSeed
                   && board[1][1] == theSeed
                   && board[2][2] == theSeed
              || currentRow + currentCol == 2  // 3-in-the-opposite-diagonal
                   && board[0][2] == theSeed
                   && board[1][1] == theSeed
                   && board[2][0] == theSeed);
   }
 
   /** Print the game board */
   public static void printBoard() {
      for (int row = 0; row < ROWS; ++row) {
         for (int col = 0; col < COLS; ++col) {
            printCell(board[row][col]); // print each of the cells
            if (col != COLS - 1) {
               System.out.print("|");   // print vertical partition
            }
         }
         System.out.println();
         if (row != ROWS - 1) {
            System.out.println("-----------"); // print horizontal partition
         }
      }
      System.out.println();
   }
 
   /** Print a cell with the specified "content" */
   public static void printCell(int content) {
      switch (content) {
         case EMPTY:  System.out.print("   "); break;
         case NOUGHT: System.out.print(" O "); break;
         case CROSS:  System.out.print(" X "); break;
      }
   }
   
   /** The entry main method (the program starts here) */
   public static void main(String[] args)throws IOException {
	   BufferedReader recibir=new BufferedReader (new InputStreamReader(System.in));
	   String juego[][];
	   juego = new String[3][3];//matrices
	   int n=0;
	   int fila;
	   int columna;
	   for (int a=0; a<=2; a=a+1) {
	   for (int b=0; b<=2; b=b+1) {
	   juego[a][b]="?";
	   int dato;
	   int dato1;
	   int datob;
	   int datob2;
	   }

	   }

	   //tablero
	   System.out.println(" 0   1   2");
	   System.out.println("0 "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
	   System.out.println("  __________");
	   System.out.println("2 "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
	   System.out.println("  __________");
	   System.out.println("3 " +juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2]);

	   while (n<10) { //ciclo

	   //jugador 'x'
	   System.out.println("Es el turno del jugador X.");
	   System.out.println(" fila.");
	   int dato=Integer.parseInt(recibir.readLine());
	   System.out.println(" columna.");
	   int dato1=Integer.parseInt(recibir.readLine());
	   //comprobar si la jugada existe
	   while (juego[dato][dato1]== "X" || juego[dato][dato1]== "O" ) { //comparacion
	   System.out.println("A ingresado una jugada en donde YA existia una anteriormente");
	   System.out.println("Ingrese una fila.");
	   dato=Integer.parseInt(recibir.readLine());
	   System.out.println("Ingrese una columna.");
	   dato1=Integer.parseInt(recibir.readLine());
	   }
	   juego[dato][dato1] = "X";
	   //jugador X

	   //tablero
	   System.out.println(" 0   1   2");
	   System.out.println("0 "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
	   System.out.println("  ___________");
	   System.out.println("1 "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
	   System.out.println("  ___________");
	   System.out.println("2 "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2]);

	   n=n+1;


	   if (juego[0][0]== "X" && juego[0][1]== "X" && juego [0][2]== "X") {
	   System.out.println("El ganador es 'x'.");
	   break;
	   }
	   if (juego[1][0]== "X" && juego[1][1]== "X" && juego [1][2]== "X") {
	   System.out.println("El ganador es X.");
	   break;
	   }
	   else if (juego[2][0]== "X" && juego[2][1]== "X" && juego [2][2]== "X") {
	   System.out.println("El ganador es X.");
	   break;
	   }
	   if (juego[0][0]== "X" && juego[1][0]== "X" && juego [2][0]== "X") {
	   System.out.println("El ganador es X.");
	   break;
	   }
	   if (juego[0][1]== "X" && juego[1][1]== "X" && juego [2][1]== "X") {
	   System.out.println("El ganador es X.");
	   break;
	   }
	   if (juego[0][2]== "X" && juego[1][2]== "X" && juego [2][2]== "X") {
	   System.out.println("El ganador es 'X'.");
	   break;
	   }
	   //diagonales faltan
	   if (juego[0][0]== "X" && juego[1][1]== "X" && juego [2][2]== "X") {
	   System.out.println("El ganador es X.");
	   break;
	   }
	   if (juego[0][2]== "X" && juego[1][1]== "X" && juego [2][0]== "X") {
	   System.out.println("El ganador es X.");
	   break;
	   }
	   //condiciones victoria

	   if (n==9) {
	   break;
	   }

	   //jugador 0
	   System.out.println("Es el turno del jugador O");
	   System.out.println(" fila.");
	   int datob=Integer.parseInt(recibir.readLine());
	   System.out.println(" columna.");
	   int datob2=Integer.parseInt(recibir.readLine());
	   System.out.println("numeros elegidos"+datob+"segundo"+datob2);
	 //comprobar si la jugada existe
	   while (juego[datob][datob2]== "O" || juego[datob][datob2]== "X" ) {
	   System.out.println("maquina");
	   datob = (int)(Math.random()*3)+0;
	   datob2 = (int)(Math.random()*3)+0;
	   System.out.println("numeros elegidos"+datob+"segundo"+datob2);
	   }
	   juego[datob][datob2] = "O";
	   //tablero
	   System.out.println(" 0   1   2");
	   System.out.println("0 "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
	   System.out.println("  ____________");
	   System.out.println("1 "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
	   System.out.println("  ____________");
	   System.out.println("2 "+juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2]);

	   n=n+1;//cantidad de jugadas permitidas

	   if (juego[0][0]== "O" && juego[0][1]== "O" && juego [0][2]== "O") {
	   System.out.println("el ganador es O");
	   break;
	   }
	   if (juego[1][0]== "O" && juego[1][1]== "O" && juego [1][2]== "O") {
	   System.out.println("El ganador es O");
	   break;
	   }
	   if (juego[2][0]== "O" && juego[2][1]== "O" && juego [2][2]== "O") {
	   System.out.println("El ganador es O.");
	   break;
	   }
	   if (juego[0][0]== "O" && juego[1][0]== "O" && juego [2][0]== "O") {
	   System.out.println("El ganador es O");
	   break;
	   }
	   if (juego[0][1]== "O" && juego[1][1]== "O" && juego [2][1]== "O") {
	   System.out.println("El ganador es O");
	   break;
	   }
	   if (juego[0][2]== "O" && juego[1][2]== "O" && juego [2][2]== "O") {
	   System.out.println("El ganador es O");
	   break;
	   }
	   //diagonales faltan
	   if (juego[0][0]== "O" && juego[1][1]== "O" && juego [2][2]== "O") {
	   System.out.println("El ganador es O");
	   break;
	   }
	   if (juego[0][2]== "O" && juego[1][1]== "O" && juego [2][0]== "O") {
	   System.out.println("El ganador es O");
	   break;
	   }
	   //condiciones victoria

	   if (n==9) {
	   break;
	   }

	   }

	   }
	   }

