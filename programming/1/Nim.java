/**
*  Game of Nim by Room 10
*  Author: Joshua Higgins
*  Collaborators: Joel Bianchi, Moo Joon Park, Marieke Thomas
*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;

// Class plays the game of Nim.
public class Nim {
  // Added opponent names for pleasantries.
  public static final String[] OPPONENTS = {"Jimmy", "Anna", "Ash"};
  public static final Scanner sysIn = new Scanner(System.in);
  
  public static void main(String[] args) {
    Random r = new Random();
    String response;
    // Default to true for less if checks.
    boolean playerTurn = true;
    int stones = 12;
    int oppIndex = r.nextInt(3);

    // Giving the player a choice in going first for kindness to humans.
    System.out.println("You are facing "
                       + OPPONENTS[oppIndex]);
    System.out.println("Would you like to go first? [Y/n]");
    response = sysIn.nextLine().toLowerCase();
    if(response.equals("n")){
      playerTurn = false;
    }

    // Checking if the game should end...
    while(stones > 0){
      // Determines whose turn it is.
      if(playerTurn){
        stones = playerTake(stones);
        playerTurn = false;
      }else{
        stones = takeStone(stones, oppIndex);
        playerTurn = true;
      }
    }
    /*
    *  Since the playerTurn boolean flips AFTER the
    *  player's turn, we have to check if it's NOT
    *  the player's turn to see if they won.
    */
    if(!playerTurn){
      System.out.println("You won!");
    }else{
      System.out.println("You lost...");
    }
  }

  /**
  *  Method
  *  Name: playerTake
  *  @param  int  Number of stones remaining.
  *  Brings up player stone-taking prompt. Returns
  *  number of stones remaining.
  */
  public static int playerTake(int stones) {
    System.out.println("How many stones would you like to take? (Stones remaining: "+stones+")");
    int takeCount;
    takeCount = sysIn.nextInt();
    return stones-takeCount;
  }

  /**
  *  Method
  *  Name: takeStone
  *  @param  int  Number of stones remaining.
  *  Brings up computer stone-taking prompt. Returns
  *  number of stones remaining.
  */
  public static int takeStone(int stones, int opp) {
    Random r = new Random();
    int takeCount = (stones%4 != 0) ? stones%4 : opp+1;
    System.out.println(OPPONENTS[opp]
                       +" takes "+takeCount
                       +" stones!"
                       +" (Stones remaining: "
                       +(stones-takeCount)+")");
    return stones-takeCount;
  }
}