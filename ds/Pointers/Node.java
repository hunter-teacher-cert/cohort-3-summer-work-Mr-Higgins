import java.io.*;

public class Node{
  private String data;
  private Node next;


  /* Constructors */

  public Node(){

  }

  public Node(String data){
    this.data = data;
    this.next = null;

  }


  public Node(String data, Node next){
    this.data = data;
    this.next = next;
  }

  public String getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }

  public void setData(String data){
    this.data = data;
  }

  public void setNext(Node next){
    this.next = next;
  }

  public String toString(){
    return "" + data + "->";
  }

  public static void main(String[] args){
    Node n1 = new Node("5");
    Node n2 = new Node("10");
    n1.setNext(n2);
    n2.setNext(new Node("15"));
    n2 = new Node("20");

    System.out.println(n1.getNext().data);
  }
}