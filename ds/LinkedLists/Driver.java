import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    String[] a;
    System.out.println("The size is " + l.size());
    l.add("test");
    l.add("a");
    l.add("is");
    l.add("this");
    System.out.println(l.get(0));
    System.out.println(l.get(2));
    System.out.println(l.get(9001));
    System.out.println(l);
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
    System.out.println("The size is: " + l.size());
    System.out.println("Neat is at index " 
                       + l.indexOf("neat"));
    System.out.println("Wow is at index " 
                       + l.indexOf("wow"));
    System.out.println("Jeepers is at index "
                       + l.indexOf("jeepers"));
    a = l.toArray();
    System.out.println("This is the array printout! Iteration below it!");
    System.out.println(a);
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i]);
    }
    System.out.println();
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
  }
}