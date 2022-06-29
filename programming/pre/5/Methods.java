import java.io.*;
import java.util.Scanner;

public class Methods {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Testing isDivisible, please give two integers separated by the enter key.");
    System.out.println(isDivisible(in.nextInt(),in.nextInt()));
    System.out.println("Testing isTriangle, please give three integers separated by the enter key.");
    System.out.println(isTriangle(in.nextInt(),in.nextInt(),in.nextInt()));
    System.out.println("Testing ack, please give two non-negative integers separated by the enter key.");
    System.out.println(ack(in.nextInt(),in.nextInt()));
  }

  public static boolean isDivisible(int n, int m){
    if (n%m == 0){
      return true;
    }else{
      return false;
    }
  }

  public static boolean isTriangle(int a, int b, int c){
    if (a>b & a>c){
      return (b+c)>a;
    }else{
      if(b>c){
        return (a+c)>b;
      }else{
        return (a+b)>c;
      }
    }
  }

  public static long ack(int m, int n){
    //Really just here to satisfy the fact that we want it to accept 2 ints.
    return ack((long)m,(long)n);
  }

  //Because I want to see it perform with bigger numbers, made private just to prevent external calls, old habit.
  private static long ack(long m, long n){
    if(m > 0){
      if(n > 0){
        return ack(m-1,ack(m,n-1));
      }else{
        return ack(m-1,1);
      }
    }else{
      return n+1;
    }
  }
}