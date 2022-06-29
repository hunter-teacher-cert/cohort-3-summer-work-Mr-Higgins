import java.io.*;
import java.util.Scanner;

public class Loops{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Testing squareRoot, please give a double to test.");
    System.out.println(squareRoot(in.nextDouble()));
    System.out.println("Although pow was used for squareRoot, please give a double and an int to test the homemade pow function, separated by the enter key.");
    System.out.println(pow(in.nextDouble(),in.nextInt()));
    System.out.println("Testing factorial, please give non-negative integer.");
    System.out.println(factorial(in.nextInt()));
  }  
  
  public static double squareRoot(double a){
    double x = 0.0;
    double next, diff;
    //naive first guess method, also didn't read the recommended a/2 start until after making this whoops.
    while(pow(2.0,(int)x)<a){
      x = x+1.0;
    }
    if((int)x == 0){
      x = 0.1;
    }
    next = (x+a/x)/2;
    diff = abs(x-next);
    while(diff > 0.0001){
      x = next;
      next = (x+a/x)/2;
      diff = abs(x-next);
    }
    return next;
  }
  
  //Just challenging myself to not use java.Math at all. Rewritten because now I see exercise 3.
  public static double pow(double base, int exp){
    double result = 1.0;
    while(exp > 0){
      result = base*result;
      exp = exp-1;
    }
    while(exp < 0){
      result = result/base;
      exp = exp+1;
    }
    return result;
  }

  public static double abs(double a){
    if(a<0){
      return -1.0*a;
    }else{
      return a;
    }
  }

  public static long factorial(int n){
    long result = 1;
    while(n > 1){
      result = n*result;
      n = n-1;
    }
    return result;
  }
}