import java.io.*;

public class Beer {
  public static void main(String[] args){
    int beerCount = 99;
    singRound(beerCount);
    System.out.println("No bottles of beer on the wall,");
    System.out.println("no bottles of beer,");
    System.out.println("ya' can't take one down, ya' can't pass it around,");
    System.out.println("'cause there are no more bottles of beer on the wall!");
  }

  public static void singRound(int beers){
    countBeer(beers);
    System.out.println(" on the wall,");
    countBeer(beers);
    System.out.println(",\nya' take one down, ya' pass it around,");
    countBeer(beers-1);
    System.out.println(" on the wall.\n");
    if(beers>1){
      singRound(beers-1);
    }
  }

  public static void countBeer(int beers){
    if(beers != 1){
      System.out.print(String.valueOf(beers)+" bottles of beer");
    } else{
      System.out.print(String.valueOf(beers)+" bottle of beer");
    }
  }
}