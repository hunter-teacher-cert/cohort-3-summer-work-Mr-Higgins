/**
 * Rational class by Team 5
 * Joshua Higgins
 * collaborators: Patricia E. Wygand, Thea Williams, Alana Robinson
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.
   Basic level (complete all):
   - toString
   - default constructor
   - multiply
   - divide
   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor
   Advanced level (complete Basic + Intermediate + these methods):
   -
*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    this._numerator = 0;
    this._denominator = 1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    if(d != 0){
      if((n < 0 && d < 0) || (n < 0 && d > 0)){
        n *= -1;
        d *= -1;
      }
      this._numerator = n;
      this._denominator = d;
    }else{
      System.out.println("Warning, invalid denominator, setting to 0/1...");
      this._numerator = 0;
      this._denominator = 1;
    }
  }

  // getNumerator
  // returns the current value of _numerator.
  public int getNumerator(){
    return this._numerator;
  }

  // getDenominator
  // returns the current value of _denominator.
  public int getDenominator(){
    return this._denominator;
  }

  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    return (this._numerator+"/"+this._denominator);
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    return (double)this._numerator/(double)this._denominator;
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {
    this._numerator *= r.getNumerator();
    this._denominator *= r.getDenominator();
  }


  // divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    if(r.getNumerator() == 0){
      System.out.println("Inappropriate division! Cancelling division.");
    }else{
      this._numerator *= r.getDenominator();
      this._denominator *= r.getNumerator();
    }
  }

}//end class