import java.io.*;
import java.util.*;

public class Animate
{

  // pause for n milliseconds
  public static void delay(int n)
  {
    try {
      Thread.sleep(n);
    }
    catch(InterruptedException e) {}
  }


  // "repaint" by using an ANSI control character to
  // repeatedly place the cursor at the origin (upper left)
  public static void animate(int n)
  {
    //clear screen, place cursor at origin (upper left)
    System.out.print("[0;0H\n");

    System.out.println("we are aaanimaniacs " + n);

    // After you have predicted/observed/reconciled
    // behavior of the preceding line,
    // comment it out,
    // uncomment the for loop below, and
    // re-apply your process.

    /*
      for( int i=n; i > 0; i-- ) {
      System.out.println("we are aaanimaniacs " + i);
      }
    */

    delay(1000);
  }
}