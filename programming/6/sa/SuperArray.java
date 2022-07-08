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
    if(numberElements == 0){
      return true;
    }else{
      return false;
    }
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
    /* YOUR SIMPLE+SMART CODE HERE */
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
    // shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */

    // subtract fom numElements;
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */

    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */

    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */

    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end grow()

}//end class