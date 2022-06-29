import java.io.*;
import java.util.Random;
import java.util.Arrays;

public class Craps {
  public static void main(String[] args){
    int numRounds = Integer.parseInt(args[0]);
    boolean won;
    for(int i = 0; i < numRounds; i++){
      won = round();
      System.out.print("Round "+(i+1));
      if(won){
        System.out.println(": win!");
      }else{
        System.out.println(": lose...");
      }
    }
  }
  
  public static int roll(int d){
    Random r = new Random();
    return (r.nextInt(d))+1;
  }

  public static int shoot(int n, int d){
    int total = 0;
    for(int i = 0; i<n; i++){
      total += roll(d);
    }
    return total;
  }

  public static boolean round(){
    boolean playing = true;
    boolean result = false;
    int diceTotal = shoot(2,6);
    int point = diceTotal;

    if(diceTotal == 2 || diceTotal == 3 || diceTotal == 12){
      playing = false;
    } else if(diceTotal == 7 || diceTotal == 11){
      result = true;
      playing = false;
    }
    while(playing){
      diceTotal = shoot(2,6);
      if(diceTotal == point){
        result = true;
        playing = false;
      } else if(diceTotal == 7){
        playing = false;
      }
    }
    return result;
  }
}