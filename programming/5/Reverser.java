/**
 * Recursive String Reverser by Team 7
 * Joshua Higgins
 * collaborators: Christine Marra, Dave Ciolino-Volano, Greg Sciame
 */


public class Reverser
{

  // Putting this here, all it does is snip off the last character.
  public static char[] truncArray(char[] s){
    char[] c = new char[s.length-1];
    for(int i = 0; i < s.length-1; i++){
      c[i] = s[i];
    }
    return c;
  }

  // This is an overload for reverseR. I'm inept and find the
  // immutability of String to be aggravating, so this is what
  // *actually* does the work.
  public static String reverseR (char[] s){
    if(s.length > 1){
      char[] c = truncArray(s);
      // Return the last character concatenated with the
      // recursive return value.
      return s[s.length-1] + reverseR(c);
    }else{
      // Using new String because we can't just add char[].
      return new String(s);
    }
  }

  /**
  String reverseR(String) -- recursive String reverser
  precond:  input String is non-empty
  postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  {
    char[] c = new char[s.length()];
    for(int i = 0; i < s.length(); i++){
      c[i] = s.charAt(i);
    }
    // Note this is calling reverseR(char[]) edition!!
    return reverseR(c);
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );

    //more tests welcome
    // got some good palindromes?
  }
}