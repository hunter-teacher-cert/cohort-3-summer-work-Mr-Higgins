import java.io.*;
import java.util.*;

/*
Team 11
Collaborators: J. Bianchi, A. Cassara, J. Higgins, R. Parker
*/

/*
Sort Project:
  Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.
  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.
  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.
Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of t binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 


  // Constructor #1: Default
  public SortSearch(){
    // creates new ArrayList of integers  
    data = new ArrayList<Integer>();

    // generates a random number generator
    r = new Random();

    // create 15 random numbers from 0 - 19
    for (int i = 0; i < 15; i++){
        data.add(r.nextInt(20));
    }

  }

  //Constructor #2: Overloaded allows us to define the size of the ArrayList
  public SortSearch(int size){
    // creates new ArrayList of integers  
    data = new ArrayList<Integer>();

    // generates a random number generator
    r = new Random();

    //create 'size' random numbers from 0 - 19
    for (int i = 0; i < size; i++){
        data.add(r.nextInt(20));
    }

  }

  /* Convenience function to get data out of the ArrayList
  from the driver */
  public int get(int index){
    return this.data.get(index);
  }
    
  public int getSize(){
    return this.data.size();
  }

  /*
  Return the index of the smallest data idem from index 
  start to the end of the ArrayList. If there are multiple
  of the smallest value, return any of them.
  
  Example, if the arraylist has:
  5,3,10,6,8
  if start was 2 (start at index 2, value 10) then it would
  return 3 which is the index of the value 6 which is the
  index with the smallest value from start to end.
  On the other hand, if start was 0, then the method would
  return 1 since the value 3 is in index 1 and that is the
  smallest.
  
  */
  public int findSmallestIndex(int start){
    // first value initialized as the smallest
    int smallIndex = start;

    // traverse through the ArrayList
   for(int i = start; i < this.data.size(); i++){

    // compare the values to see which is smallest
    if(data.get(i) < this.data.get(smallIndex)){
      // set smallIndex to the new value
      smallIndex = i;
    }
   }
    // return the smallest
    return smallIndex;
  }

  //my bad guys, I hit the wr

  /**
  SELECTION SORT:
  Implement the selection sort algorithm by sorting the
  ArrayList data in place.
  */
  public void sort(){
    
    // Loop a variable that represents the ArrayList index
    // from 0 to the end of the ArrayList.
    int smallest;
    
    for(int i = 0; i < this.data.size(); i++){
      Collections.swap(this.data,i,findSmallestIndex(i)); 
    }
  }

  
  /* Search project starts here */
    
  /**
  Performs a linear search. Returns the index of the
  first occurrence of value in the ArrayList data or
  -1 if not found.
  This works by starting at the first element and
  searching one element at a time 
  until either the element is found or you've looked at
  all the elements.
  This algorithm works on any ArrayList.
  */
  public int linearSearch(int value){
    // Default to -1 if not found.
    int index = -1;

    // Check the whole ArrayList, or stop after finding first
    // match.
    for(int i = 0; i < this.data.size() && index == -1; i++){
      if(this.data.get(i) == value){
        index = i;
      }
    }
    return index; // replace this return
  }
    
  /**
  Implement a binary search as specified by the comments   
  This algorithm only works on sorted ArrayLists.
  */
  public int binarySearch(int value){
    Scanner debug = new Scanner(System.in);
    // create assign variables representing the high,
    // low and middle indices
    int loInd  = 0;
    int hiInd  = this.data.size()-1;
    int midInd = (loInd+hiInd)/2;
    // while we're not done:
    // if the item is at data.get(middle), return middle
    while(this.data.get(midInd) != value && loInd < hiInd){
      // System.out.println(midInd);
      // debug.nextLine();
      // otherwise, update high, low, and middle
      if(this.data.get(midInd) < value){
        //+1 due to truncated division.
        loInd = midInd+1;
      }else{
        hiInd = midInd;
      }
      midInd = (loInd+hiInd)/2;
    }
    if(this.data.get(midInd) != value){
      midInd = -1;
    }
    return midInd;
  }
    
  /**
    Implement a RECURSIVE binary search as specified by
    the comments
     
    This algorithm only works on sorted ArrayLists.
  */

  public int binarySearchRecursive(int value, int lowIndex,
                                   int highIndex){

    int midInd = (lowIndex+highIndex)/2;
    if(this.data.get(midInd) == value){
      return midInd;
    }else if(lowIndex >= highIndex){
      return -1;
    }else{
      return (this.data.get(midInd) < value) ?
        binarySearchRecursive(value, midInd+1,highIndex) :
        binarySearchRecursive(value,lowIndex,midInd);
    }
  }
    
	
  public String toString(){
    return ""+this.data;
  };


  public void builtinSort(){
    Collections.sort(this.data);

  }
}