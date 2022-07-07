import java.io.*;
import java.util.*;


/**
 * Time class by Team 7
 * Joshua Higgins
 * collaborators: Christine Marra, Dave Ciolino-Volano, Greg Sciame
 */

/**
   INSTRUCTIONS:
   This file contains the starter code for our Time class.
   The class here uses ints for hours, minutes, and seconds but you
   could decide to change the internal representation to just store
   an int representing a number of seconds.
   Place this file in a folder named programming/5/Time.java
   Basic level (complete all):
   - public Time(int hrs, int mins, int secs) - constructor
   - public void toString()
   - public void set(int hrs, int mins, int secs)
   Intermediate level (complete Basic methods plus this method):
   - public void add(Time other)
   - public boolean isEquals(Time other)
   
   Advanced level (complete Basic + Intermediate + these two methods):
   - public int compareTo(Time other)
   
*/



public class Time {
    // Instance Variable(s)
    // You can change this if you want to use the alternate
    // implementation of just storing the overall seconds.
    
    int hours;
    int minutes;
    int seconds;

    // Constructors
    public Time(){
    	this.hours = 0;
    	this.minutes = 0;
    	this.seconds = 0;
    }

    /**
       Parameters:
       - hrs, mins, secs - the time you want to create the class as
       Initialize this instance to represent hrs:mins:secs as the time.
       
     */
    // Test without this.
    public Time(int hrs, int mins, int secs){
  	  this.hours = hrs;
      this.minutes = mins;
      this.seconds = secs;
    }
    
    
    // Methods

    /**
       returns a string representation of the time
    */
    public String toString(){
	    return("The time is: "+this.hours+":"+this.minutes+":"+this.seconds);
    }


    

    /**
       Parameters:
       - hrs,mins,secs - ints representing a time
       modifies this instance to represent the time hrs:mins:secs
    */
    public void set(int hrs, int mins, int secs){
      this.hours = hrs;
      this.minutes = mins;
      this.seconds = secs;
    }

    

    /**
       Parameters:
       - other - a variable of type Time
       modifies this instance to represent the result of adding it and
       the time other.
    */
    public void add(Time other){
      this.hours += other.hours;
      this.minutes += other.minutes;
      this.seconds += other.seconds;
    }


    /**
       Parameters:
       other - a variable of type Time
       Returns:
       True if this instance and other represents the same time
       false otherwise.
    */
    public boolean equals(Time other){
      boolean isEqual = true;
      if(this.hours != other.hours || this.minutes != other.minutes
        || this.seconds != other.seconds){
        isEqual = false;
      }
      return isEqual;
    }

    /**
       Parameters:
       other - a variable of type Time
       Returns:
       A positive number if this instance represents a time greater
       than the time of other (this > other)
       A negative number if this instance represents a time less
       than the time of other (this < other)
       0 if the two instances represent the same time.
    */
    public int compareTo(Time other){
      int thisTime = this.hours*3600+this.minutes*60+this.seconds;
      int otherTime = other.hours*3600+other.minutes*60+other.seconds;
      if(thisTime > otherTime){
        return 1;
      }else if(thisTime == otherTime){
        return 0;
      }else{
        return -1;
      }
    }
    

    
}//end class