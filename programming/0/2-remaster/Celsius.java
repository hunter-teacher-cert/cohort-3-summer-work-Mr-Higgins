import java.io.*;
import java.util.Scanner;

/**
*  The sacred class that houses main.
*/
public class Celsius {
  /**
  *  Method
  *  Name: main
  *  Uses STDIN and STDOUT to request and accept a double from user input for degrees in Celsius/centigrade.
  *  Uses STDOUT to print the conversion to Fahrenheit.
  *  @param  args  unused String Array for command line arguments.
  */
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double celsius;
    System.out.print("Please give your temperature in centigrade to convert to Fahrenheit.\n");
    celsius = in.nextDouble();
    System.out.println(celsius+"C is approximately "+String.valueOf(celsius*9.0/5.0+32.0)+"F.");
  }
}