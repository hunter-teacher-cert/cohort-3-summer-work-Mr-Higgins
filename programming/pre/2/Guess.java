import java.util.Scanner;
import java.io.*;
import java.lang.Math;

// Apologies, I found using system time to be more fun than seeding the random function for a game!
public class Guess {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    long myNumber = (System.currentTimeMillis()%100)+1;
    long guess;
    
    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?\nType a number:");
    guess = in.nextLong();
    System.out.println("Your guess is: "+guess);
    System.out.println("The number I was thinking of is: "+myNumber);
    System.out.println("You were off by: "+String.valueOf(Math.abs(myNumber-guess)));
  }
}