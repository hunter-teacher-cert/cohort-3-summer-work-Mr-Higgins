import java.io.*;

public class Reverser {
  public static void main(String[] args){
    String myWord = args[0];
    for(int i = myWord.length()-1; i >= 0; i--){
      System.out.print(myWord.charAt(i));
    }
    System.out.print("\n");
  }
}