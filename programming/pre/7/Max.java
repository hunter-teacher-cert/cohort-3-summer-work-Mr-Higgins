import java.io.*;
import java.util.Random;
import java.util.Arrays;

public class Max{
  public static void main(String[] args){
    Random random = new Random();
    int[] test = new int[20];
    for(int i = 0; i<20;i++){
      test[i] = random.nextInt(2000);
    }
    System.out.println(Arrays.toString(test));
    System.out.println("Index of maximum is: "+indexOfMax(test));
  }

  public static int indexOfMax(int[] a){
    int ind = -1;
    int topVal = Integer.MIN_VALUE;

    for(int i = 0; i < a.length; i++){
      if(a[i] > topVal){
        topVal = a[i];
        ind = i;
      }
    }
    
    return ind;
  }
}