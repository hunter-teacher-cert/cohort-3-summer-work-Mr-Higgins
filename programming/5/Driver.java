import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * Joshua Higgins
 * collaborators: Christine Marra, Dave Ciolino-Volano, Greg Sciame
 */

/**
   INSTRUCTIONS:
   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java
*/


public class Driver {

  public static void testDrive(Time t){
    Time testDummy = new Time(9,12,0);
    System.out.println("Testing toString...");
    System.out.println(t.toString());
    System.out.println("Testing add with testDummy (9,12,0)...");
    t.add(testDummy);
    System.out.println(t.toString());
    System.out.println("Testing equals against testDummy...");
    System.out.println(t.equals(testDummy));
    System.out.println("Testing compareTo against testDummy...");
    System.out.println(t.compareTo(testDummy));
    System.out.println("Testing set with 20, 22, 7...");
    t.set(20,22,7);
    System.out.println(t.toString());
    System.out.println("Testing add with testDummy (9,12,0)...");
    t.add(testDummy);
    System.out.println(t.toString());
    System.out.println("Testing equals against testDummy...");
    System.out.println(t.equals(testDummy));
    System.out.println("Testing compareTo against testDummy...");
    System.out.println(t.compareTo(testDummy));
  }
  
  public static void main(String[] args) {

    //declare a var of appropriate type to assign an instance of Time to
    Time t, t2;
  
    //assign var the address of a newly-apportioned Time object
    t = new Time();
    t2 = new Time(20, 20, 20);
    testDrive(t);
    testDrive(t2);
    
  }//end main()

}//end class