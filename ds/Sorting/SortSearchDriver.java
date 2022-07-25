import java.io.*;
import java.util.*;

public class SortSearchDriver {
  
  public static void main(String[] args) {

    // For mergesort testing
    SortSearch ss = new SortSearch();
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    ArrayList<Integer> al2 = new ArrayList<Integer>();
    al1 = ss.buildIncreasingList(10);
    al2 = ss.buildIncreasingList(10);

    System.out.println(al1);
    System.out.println(al2);
    ArrayList<Integer> alf = ss.merge(al1,al2);
    System.out.println(alf);
    
    // // Uncomment these to test part 1
    // System.out.println("\nA new ArrayList ss with 20 random integers:");
    // int size = 1000000;
    // SortSearch ss = new SortSearch(size);
    // Random r = new Random();
    // int myR = r.nextInt(20);
    // long start, elapsed;
    // int temp;
    // System.out.println("Timing linear search on raw "+size+" data.");
    // start = System.currentTimeMillis();
    // temp = ss.linearSearch(myR);
    // elapsed = System.currentTimeMillis()-start;
    // System.out.println("The number of milliseconds linear search "
    //                   +"took was: "+elapsed);

    // System.out.println("Timing sort on raw "+size+" data.");
    // start = System.currentTimeMillis();
    // ss.sort();
    // elapsed = System.currentTimeMillis()-start;
    // System.out.println("The number of milliseconds sort "
    //                   +"took was: "+elapsed);

    // System.out.println("Timing binary search on sorted "+size+" data.");
    // start = System.currentTimeMillis();
    // temp = ss.binarySearch(myR);
    // elapsed = System.currentTimeMillis()-start;
    // System.out.println("The number of milliseconds binary search "
    //                   +"took was: "+elapsed);
    
    // System.out.println("Timing r binary search on sorted "+size+" data.");
    // start = System.currentTimeMillis();
    // temp = ss.binarySearchRecursive(myR,0,size-1);
    // elapsed = System.currentTimeMillis()-start;
    // System.out.println("The number of milliseconds r binary search "
    //                   +"took was: "+elapsed);

    
    // System.out.println(ss);
    
    // // SortSearch ss2 = new SortSearch();
    // // System.out.println(ss2);
        
    // // Uncomment these to test part 2
    // int i;
    
    // System.out.println("\nFinding index of smallest element in ss ArrayList starting from beginning:");
    // i = ss.findSmallestIndex(0);
    // System.out.println("ss["+ i +"] = "+ss.get(i));
    
    // System.out.println("\nFinding index of smallest element in ss ArrayList starting from index 13:");
    // i = ss.findSmallestIndex(13);
    // System.out.println("ss["+ i + "] = "+ss.get(i));
    
    // // Uncomment these to test part 3
    // System.out.println(ss);
    // ss.sort();
    // System.out.println(ss);
    // System.out.println("Linear search result (for 13): "
    //                    + ss.linearSearch(13));
    // System.out.println("Binary search result (for 13): "
    //                    + ss.binarySearch(13));
    // System.out.println("Binary (r) search result (for 13): "
    //                    + ss.binarySearchRecursive(13,0,ss.getSize()-1));
    // System.out.println("Linear search result (for 0): "
    //                    + ss.linearSearch(0));
    // System.out.println("Binary search result (for 0): "
    //                    + ss.binarySearch(0));
    // System.out.println("Binary (r) search result (for 0): "
    //                    + ss.binarySearchRecursive(0,0,ss.getSize()-1));
    // System.out.println("Linear search result (for 19): "
    //                    + ss.linearSearch(19));
    // System.out.println("Binary search result (for 19): "
    //                    + ss.binarySearch(19));
    // System.out.println("Binary (r) search result (for 19): "
    //                    + ss.binarySearchRecursive(19,0,ss.getSize()-1));
    // ss.sort();
    // ss.binarySearchRecursive(r.nextInt(20),0,ss.getSize()-1);
  }
}