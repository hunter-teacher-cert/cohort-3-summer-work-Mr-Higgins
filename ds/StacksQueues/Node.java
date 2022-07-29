public class Node {
  private int data;
  private Node next;

  public Node(int d){
    this.data = d;
    this.next = null;
  }

  public Node(int d, Node n){
    this.data = d;
    this.next = n;
  }

  public void setData(int d){
    this.data = d;
  }

  public void setNext(Node n){
    this.next = n;
  }

  public int getData(){
    return this.data;
  }

  public Node getNext(){
    return this.next;
  }

  public String toString(){
    return ""+this.data;
  }
}