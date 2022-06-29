import java.io.*;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

public class Array{
  public static void main(String[] args){
    Random random = new Random();
    double[] test = {1.0, 1.5, 2.0, 3.0};
    int[] randInts = new int[20];
    int[] myCounts;
    for(int i = 0; i < 20; i++){
      randInts[i] = random.nextInt(100);
    }
    test = powArray(test, 2.5);
    System.out.println("Testing powArray on [1.0,1.5,2.0,3.0] with exponent 2.5...");
    System.out.println(Arrays.toString(test));
    System.out.println("Testing histogram using randomly generated int array and 6 counters...");
    myCounts = histogram(randInts, 6);
    System.out.println("My random ints: "+Arrays.toString(randInts));
    System.out.println("My counts: "+Arrays.toString(myCounts));
  }

  public static double[] powArray(double[] a, double b){
    for(int i = 0; i < a.length; i++){
      a[i] = Math.pow(a[i],b);
    }
    return a;
  }

  public static int inRange(int[] a, int low, int high) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] >= low && a[i] < high) {
            count++;
        }
    }
    return count;
  }
  
  public static int[] histogram(int[] scores, int counters){
    //Data evaluation/manipulation before execution.
    if(counters > 100){
      counters = 100;
    }else if(counters < 1){
      counters = 1;
    }
    if(100%counters != 0){
      System.out.println("Warning: You have requested a number of counters that does not evenly divide the data, the default way this is handled will be to give the remainder to the final (highest) counter.");
    }
    
    int[] counts = new int[counters];
    int countStep = 100/counters;
    
    for(int i = 0; i < counters-1; i++){
      counts[i] = inRange(scores,i*countStep,(i+1)*countStep);
    }
    counts[counters-1] = inRange(scores,(counters-1)*countStep,100);
    return counts;
  }
}