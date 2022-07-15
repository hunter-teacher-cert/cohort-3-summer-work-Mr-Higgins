import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("test");
    l.add("a");
    l.add("is");
    l.add("this");
    System.out.println(l.get(0));
    System.out.println(l.get(2));
    System.out.println(l.get(9001));
    System.out.println(l);
  }
}