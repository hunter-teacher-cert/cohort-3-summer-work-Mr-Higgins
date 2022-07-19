import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).
Basic
-----
add(string value)
get(int index);
toString()
Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()
Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list
  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    Node newHead = new Node(value, this.head);
    this.head = newHead;
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    Node walker = this.head;
    for(int i = 0; i < index && walker != null; i++){
      walker = walker.getNext();
    }
    if(walker == null){
      System.out.println("Index does not exist! "
                         +"Returning blank string.");
      return "";
    }
    return walker.getData();
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    String result = "";
    Node walker = this.head;
    while(walker != null){
      result += walker.getData()+ " ";
      walker = walker.getNext();
    }
    return result;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    int result = 0;
    Node walker = this.head;
    while(walker != null){
      result++;
      walker = walker.getNext();
    }
    return result;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value
  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.
  For example, given the list:
  "a" -> "b" -> "c" -> "d"
  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"
  */
  public void add(int index, String value){
    if(index != 0){
      Node walker = this.head;
      Node myNode = new Node(value);

      if(this.size() < index){
        System.out.println("Warning, requested index beyond"
                          + " size, defaulting to end.");
      }
      // There is likely a way to walk through this with
      for(int i = 0; i < index-1 && walker.getNext() != null;
          i++){
        walker = walker.getNext();
      }
      
      myNode.setNext(walker.getNext());
      walker.setNext(myNode);
    }else{
      this.add(value);
    }
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.
  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.
  */
  public int indexOf(String value){
    Node walker = this.head;
    int index = -1;
    boolean found = false;
    for(int i = 0; walker != null && !found; i++){
      if(walker.getData().equals(value)){
        index = i;
        found = true;
      }
      walker = walker.getNext();
    }
    return index;
  }

  /**
  Returns the indices of ALL nodes that contain the value.
  */
  public int[] indicesOf(String value){
    Node walker = this.head;
    int count = 0;
    int index = 0;
    while(walker != null){
      if(walker.getData().equals(value)){
        count++;
      }
      walker = walker.getNext();
    }
    int[] myIndices = new int[count];
    walker = this.head;
    count = 0;
    while(walker != null){
      if(walker.getData().equals(value)){
        myIndices[count] = index;
        count++;
      }
      index++;
      walker = walker.getNext();
    }
    return myIndices;
  }

  /**
  This routine reverses our current list, not with spatial
  efficiency though, it will temporarily double the space
  taken until garbage collection occurs.
  */
  public void reverse(){
    Node walker = this.head;
    LinkedList rList = new LinkedList();
    while(walker != null){
      rList.add(walker.getData());
      walker = walker.getNext();
    }
    this.head = rList.head;
  }
  
  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return
  the array.
  */
  public String[] toArray(){
    String[] myArray = new String[this.size()];
    Node walker = this.head;
    for(int i = 0; walker != null; i++){
      myArray[i] = walker.getData();
      walker = walker.getNext();
    }
    return myArray;
  }



  /**
  Remove the Node at location index from the list.
  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
    Node walker = this.head;
    for(int i = 0; i < index-1 && walker.getNext() != null;
       i++){
      walker = walker.getNext();
    }
    if(index == 0){
      this.head = walker.getNext();
    }else if(walker.getNext() != null){
      walker.setNext(walker.getNext().getNext());
    }else{
      System.out.println("Index requested for removal that does not exist!");
    }
  }
}