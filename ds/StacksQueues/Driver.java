import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {
    Stack s = new Stack();
    Queue q = new Queue();
    System.out.println("Is the queue empty? "+q.isEmpty());
    System.out.println("Empty queue print: "+q);
    q.enqueue(20);
    System.out.println("Queue of "+q.size()+" print: "+q);
    System.out.println(q.dequeue()+" has left the queue.");
    q.enqueue(1);
    q.enqueue(2);
    System.out.println(q.dequeue()+" has left the queue.");
    q.enqueue(12);
    System.out.println(q.front()+" is at the front of the queue.");
    System.out.println("Queue of "+q.size()+" print: "+q);
    System.out.println("Is the queue empty? "+q.isEmpty());
    System.out.println("Is the stack empty? "+s.isEmpty());
    System.out.println("Empty stack print: "+s);
    s.push(20);
    System.out.println("Stack of "+s.size()+" print: "+s);
    System.out.println(s.pop()+" has left the stack.");
    s.push(1);
    s.push(2);
    System.out.println(s.pop()+" has left the stack.");
    s.push(12);
    System.out.println(s.top()+" is at the top of the stack.");
    System.out.println("Stack of "+s.size()+" print: "+s);
    System.out.println("Is the stack empty? "+s.isEmpty());
  }
}