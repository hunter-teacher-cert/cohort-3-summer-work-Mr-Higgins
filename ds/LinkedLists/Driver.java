import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    String[] a;
    int[] b;
    // Testing size.
    System.out.println("The size is " + l.size());
    // Testing add.
    l.add("test");
    l.add("a");
    l.add("is");
    l.add("this");
    // Testing get.
    System.out.println(l.get(0));
    System.out.println(l.get(2));
    System.out.println(l.get(9001));
    // Testing toString.
    System.out.println(l);
    // Testing enhanced add.
    l.add(2,"wow");
    System.out.println(l);
    l.add(4,"choose chaos");
    System.out.println(l);
    l.add(2000,"nice");
    System.out.println(l);
    l.add(0,"neat");
    System.out.println(l);
    l.add(1, "bazinga");
    System.out.println(l);
    // Testing nonzero size and indexOf.
    System.out.println("The size is: " + l.size());
    System.out.println("Neat is at index " 
                       + l.indexOf("neat"));
    System.out.println("Wow is at index " 
                       + l.indexOf("wow"));
    System.out.println("Jeepers is at index "
                       + l.indexOf("jeepers"));
    // Testing toArray.
    a = l.toArray();
    System.out.println("This is the array printout! Iteration below it!");
    System.out.println(a);
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i]);
    }
    System.out.println();
    // Testing remove.
    l.remove(3);
    System.out.println(l);
    l.remove(2000);
    System.out.println(l);
    l.remove(0);
    System.out.println(l);
    l.remove(1);
    System.out.println(l);
    l.remove(l.size()-1);
    System.out.println(l);
    // Testing indicesOf.
    l.add("bazinga");
    l.add(123,"bazinga");
    b = l.indicesOf("bazinga");
    System.out.println(l);
    for(int i = 0; i < b.length; i++){
      System.out.print(b[i] + " ");
    }
    System.out.println();
    // Testing reverse.
    l.reverse();
    System.out.println(l);
  }
}