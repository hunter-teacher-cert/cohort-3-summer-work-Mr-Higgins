/**
 * Recursion Practice with Strings by Team 7
 * Joshua Higgins
 * collaborators: Christine Marra, Dave Ciolino-Volano, Greg Sciame
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts
     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
  */
  public static String fenceR( int n )
  {
    if(n > 1){
      return "|--" + fenceR(n-1);
    }else if(n == 1) {
      return "|";
    }
    return "";
  }


  public static void main( String[] args )
  {

    for( int i = 0; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }

    /* feel free to add extra tests... */

  }
}