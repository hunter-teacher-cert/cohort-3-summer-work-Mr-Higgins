import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Sieve{
  static public void main(String[] args){
    Scanner in = new Scanner(System.in);
    boolean[] r;
    System.out.println("Please select the nth nonnegative integer for the Sieve to test:");
    r = sieve(in.nextInt());
    for(int i = 0; i<r.length; i++){
      System.out.println(String.valueOf(i)+": "+r[i]);
    }
  }

  static public boolean[] sieve(int n){
    boolean[] result = new boolean[n];
    Arrays.fill(result, true);
    result[0] = false;
    result[1] = false;
    int i = 2;
    while(i < n/2){
      if(result[i]){
        for(int j = 2*i; j<n; j+=i){
          result[j] = false;
        }
      }
      i++;
    }
    return result;
  }
}