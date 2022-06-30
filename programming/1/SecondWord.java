import java.io.*;
import java.util.Scanner;

public class SecondWord {
  public static void main(String[] args){
    Scanner sysIn = new Scanner(System.in);
    String mySentence;
    boolean atSpace = false;
    int index = 0;
    System.out.println("Please give a sentence without punctuation:");
    mySentence = sysIn.nextLine();
    
    while(!atSpace && index < mySentence.length()){
      if(mySentence.charAt(index) == ' '){
        atSpace = true;
      }
      index += 1;
    }
    atSpace = false;
    while(!atSpace && index < mySentence.length()){
      if(mySentence.charAt(index) != ' '){
        System.out.print(mySentence.charAt(index));
      }else{
        atSpace = true;
      }
      index += 1;
    }
    System.out.print('\n');
  }
}