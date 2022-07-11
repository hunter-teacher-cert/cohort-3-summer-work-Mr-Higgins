/**
 * SuperArray by Team 5
 * Joshua Higgins
 * collaborators: Patricia E. Wygand, Thea Williams, Alana Robinson
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    this.data = new int[size];

    //init instance vars
    this.numberElements = 0;

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
    this.data = new int[10];

    //init instance vars
    this.numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add(int value)
  {
    int[] temp;
    // test to see if we need to grow, then grow
    if(numberElements == this.data.length){
      temp = new int[this.data.length+1];
      for(int i = 0; i < this.data.length; i++){
        temp[i] = this.data[i];
      }
      this.data = temp;
    }

    // add item
    this.data[numberElements] = value;
    // increment numberElements
    this.numberElements++;

  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    return numberElements == 0;
  }


  public int get(int index)
  {
    //return item at index
    if(index < this.data.length){
      return this.data[index];
    }else{
      System.out.println("Oops! That's out of index! Giving intmin.");
      return Integer.MIN_VALUE;
    }
  }


  public String toString()
  {
    //return stringified version of this Object
    String s = "[";
    for(int i = 0; i < this.data.length-1; i++){
      s += (this.data[i]+",");
    }
    s += (this.data[this.data.length-1]+"]");
    return s;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    if(index < this.numberElements){
      // shift items down to remove the item at index
      for(int i = index; i < this.numberElements-1; i++){
        this.data[i] = this.data[i+1];
      }
      // subtract fom numElements;
      this.numberElements--;
    }else{
      System.out.println("Index does not exist!");
    }
  }

  // forceAdd exists purely to satisfy the implementation what-if
  // on "what if I ACTUALLY wanted this index???"
  // I wanted to make this a part of add with a boolean default but
  // we can't change arguments here!
  public void forceAdd(int index, int value){
    while(index >= this.data.length){
      this.grow();
    }
    for(int i = this.data.length-1; i > index; i--){
      this.data[i] = this.data[i-1];
    }
    this.data[index] = value;
    if(index > numberElements){
      numberElements = index;
    }
  }

  public void add(int index, int value)
  {
    
    int[] temp = new int[this.data.length+1];
    if(index > numberElements){
      System.out.println("Warning, index far exceeds in use array,"
                        + " defaulting to next available index "
                        + numberElements);
      System.out.println("Please use forceAdd if you wanted to"
                        + " force this index.");
      index = numberElements;
    }
    // test to see if we need to grow, then grow
    if(numberElements == this.data.length){
      for(int i = 0; i < index; i++){
        temp[i] = this.data[i];
      }
      // shift
      for(int i = index; i < this.data.length; i++){
      temp[i+1] = data[i]; 
      }
      // insert
      temp[index] = value;
      this.data = temp;
    }else{
      // No need for temp.
      for(int i = this.data.length-1; i > index; i--){
        this.data[i] = this.data[i-1];
      }
      this.data[index] = value;
    }
    
    // increment numElements
    this.numberElements++;
  }

  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    // A: Increase by 10 because I'd rather increase by a flat block
    //    based on the default constructor size.
    int[] temp = new int[this.data.length+10];

    // copy over all the elements from the old array to the new one
    for(int i = 0; i < this.data.length; i++){
      temp[i] = this.data[i];
    }

    // point data to the new array
    this.data = temp;
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end grow()

}//end class