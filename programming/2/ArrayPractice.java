/**
 * ArrayPractice by Team 10
 * Joshua Higgins
 * collaborators: Steve Sabaugh, Maxwell Yearwood, Richard Parker
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:
   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurrence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip
   The stubs will have comments describing what they should do
   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray
   - printArray
   - arraySum
   - firstOccurrence
   - findMaxValue
   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds
   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;

public class ArrayPractice
{

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value
     Returns:
     a new array of integers
     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */
  public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];

    // loop through each element of the array and
    // assign the appropriate value to each one.
    for(int i = 0; i < size; i++){
      data[i] = startValue+(step*i);
    }

    return data;
  }


  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use
     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];

    for(int i = 0; i < size; i++){
      data[i] = r.nextInt(maxValue);
    }

    return data;
  }


  /**
     Parameters:
     data - an array of ints
     Returns:
     nothing
     prints out the array
     Note: data.length stores the length of the array
  */
  public static void printArray( int[] data )
  {
    System.out.print('{');
    for(int i = 0; i < data.length-1; i++){
      System.out.print(data[i]+", ");
    }
    System.out.println(data[data.length-1]+"}");
  }

  /**
     Parameters:
     data - an array of integers
     value - the value to search for
     Returns:
     the index (location) of the first occurrence of value
     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurrence(data,5) would return 1
     since the first occurrence of the value 5 is at a[1]
  */
  public static int firstOccurrence( int[] data, int value )
  {

    int index = -1;

    for(int i = 0; i < data.length; i++){
      if(data[i] == value){
        index = i;
      }
    }

    return index;
  }


  /**
     Parameters: data - an array of ints
     Returns: an integer that is equal to the sum of all the elements in the array
     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)
  */
  public static int arraySum( int[] data )
  {
    int total = 0;

    for(int i = 0; i<data.length; i++){
      total += data[i];
    }

    return total;
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     true if the array is sorted, false otherwise
     That is, if each element is < the element to its right
     then the array is sorted.
     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,13,15 is not
  */
  public static boolean isSorted( int[] data )
  {
    boolean result = true;

    for(int i = 1; i < data.length; i++){
      if(data[i-1] > data[i]){
        result = false;
      }
    }

    return result;

  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int m = Integer.MIN_VALUE;  // will hold the maximum value;

    for(int i = 0; i < data.length; i++){
      if(m < data[i]){
        m = data[i];
      }
    }

    return m;
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     the number of odd elements in the array
     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count = 0;

    for(int i = 0; i < data.length; i++){
      if(data[i]%2 == 1){
        count++;
      }
    }

    return count;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter
     Postcondition:
     elements of the input array are in reverse order
     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data )
  {
    int temp;
    /*
    *  You might be wondering why i < data.length/2
    *  Recall that integer division in Java is
    *  truncated! Think about an even array vs an odd
    *  array. In an odd-sized array, the middle value
    *  does not change position!
    *  So by using data.length/2, we omit ever
    *  swapping or wasting time with the middle value.
    *  Or, heaven forbid, accidentally swapping more
    *  than once!
    */
    for(int i = 0; i < data.length/2; i++){
      temp = data[i];
      data[i] = data[data.length-1-i];
      data[data.length-1-i] = temp;
    }
  }

  public static void testRun(int[] data){
    printArray(data);
    System.out.println("Is ordered? "+isSorted(data));
    System.out.println("First occurrence of 1? Index "
                       +firstOccurrence(data,1));
    System.out.println("Total value of array "+arraySum(data));
    System.out.println("Maximum value in array "+findMaxValue(data));
    System.out.println("Number of odds in array "+countOdds(data));
    System.out.println("Flipping array...");
    flip(data);
    printArray(data);
    System.out.println("Is ordered? "+isSorted(data));
    System.out.println("First occurrence of 1? Index "
                       +firstOccurrence(data,1));
    System.out.println("Total value of array "+arraySum(data));
    System.out.println("Maximum value in array "+findMaxValue(data));
    System.out.println("Number of odds in array "+countOdds(data));
  }


  public static void main( String[] args )
  {
    int[] data = buildIncreasingArray(5,1,2);
    int[] data2 = buildRandomArray(4,12);
    testRun(data);
    testRun(data2);
  }
}