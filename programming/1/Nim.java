/**
*  Game of Nim by Room 10
*  Joshua Higgins
*  Collaborators: Joel Bianchi, Moo Joon Park, Marieke Thomas
*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Nim {
  public static final String[] OPPONENTS = {"Jimmy", "Anna", "Ash"};
  public static final Scanner sysIn = new Scanner(System.in);
  public static void main(String[] args) {
    Random r = new Random();
    String response;
    boolean playerTurn = true;
    int stones = 12;
    int oppIndex = r.nextInt(3);
    System.out.println("You are facing "
                       + OPPONENTS[oppIndex]);
    System.out.println("Would you like to go first? [Y/n]");
    response = sysIn.nextLine().toLowerCase();
    if(response.equals("n")){
      playerTurn = false;
    }

    while(stones > 0){
      if(playerTurn){
        stones = playerTake(stones);
        playerTurn = false;
      }else{
        stones = takeStone(stones, oppIndex);
        playerTurn = true;
      }
    }
    if(!playerTurn){
      System.out.println("You won!");
    }else{
      System.out.println("You lost...");
    }
  }

  public static int playerTake(int stones) {
    System.out.println("How many stones would you like to take? (Stones remaining: "+stones+")");
    int takeCount;
    takeCount = sysIn.nextInt();
    return stones-takeCount;
  }
  
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