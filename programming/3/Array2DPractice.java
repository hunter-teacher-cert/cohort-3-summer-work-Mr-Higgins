import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team 12
 * Joshua Higgins
 * collaborators: Joel Bianchi, Yenmin Young,
                  Qianhui Vanessa Zou
 */

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */
  public static void printBoard( char[][] board )
  {
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        System.out.print(board[i][j]);
      }
      System.out.print("\n");
    }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row
     Returns:
     Nothing
     Change the 2D array board so that all the elements in the
     specified row are set to value.
     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx
     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
   for(int i = 0; i < board[row].length; i++){
     board[row][i] = value;
   }
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )
  {
    char[][] copy = new char[original.length][original[0].length];
    for(int i = 0; i < original.length; i++){
      for(int j = 0; j < original[i].length; j++){
        copy[i][j] = original[i][j];
      }
    }
    return copy;
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     Returns:
     nothing
     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.
     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo
     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col
     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ
     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ
     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {
    for(int i = -1; i < 2; i++){
      for(int j = -1; j < 2; j++){
        if((row+i >= 0 && row+i < board.length
          && col+j >= 0 && col+j < board[row+i].length)
          && (j != 0 || i != 0)){
            board[row+i][col+j] = 'X';
          }
      }
    }
  }

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).
     Example:
     Given the array
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
     explodeAllchar(board,'z') will change board to:
  */
  public static void explodeAllChar(char[][] board, char c)
  {
    boolean[][] willExplode = new boolean[board.length][board[0].length];
    for(int i = 0; i < board.length; i++){
      Array.fill(willExplode[i], false);
    }
    
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        if(board[i][j] == c){
           willExplode[i][j] = true;
        }
      }
    }

    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        if(willExplode[i][j]){
          explodeSquare(board,i,j);
        }
      }
    }
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    word = word.toUpperCase();
    if(col >= 0 && col <= board[0].length){
      for(int i = 0; i < word.length(); i++){
        if(row+i >= 0 && row+i < board.length){
          board[row+i][col] = word.charAt(i);
        }
      }
    }
  }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(5,10,'z');
    char[][] test;

    test = copyBoard(b);
    printBoard(b);
    System.out.println();
    downString(b,2,2,"neato");
    printBoard(b);
    System.out.println();
    explodeAllChar(b,'A');
    printBoard(b);
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}