public class Queue{

  // Place private instance variables here
  private Node start, end;
  private int size;

  // Place constructors here
  public Queue(){
    this.start = null;
    this.end = null;
    this.size = 0;
  }

  // Place methods here
  public void enqueue(int value){
    Node myNode = new Node(value,this.start);
    this.start = myNode;
    if(this.end == null){
      this.end = myNode;
    }
    this.size++;
  }

  public int dequeue(){
    int value;
    Node current = this.start;
    if(current == null){
      System.out.println("Warning, queue is empty, returning 0");
      value = 0;
    }else if(current.getNext() == null){
      value = current.getData();
      this.start = null;
      this.end = null;
      this.size--;
    }else{
      value = this.end.getData();
      while(current.getNext() != this.end){
        current = current.getNext();
      }
      current.setNext(null);
      this.end = current;
      this.size--;
    }
    return value;
  }

  public int front(){
    int value;
    if(this.end == null){
      System.out.println("Empty queue, returning 0");
      value = 0;
    }else{
      value = this.end.getData();
    }
    return value;
  }

  public boolean isEmpty(){
    return this.start == null;
  }

  public int size(){
    return this.size;
  }

  public String toString(){
    String myString = "";
    Node current = this.start;
    if(current != null){
      while(current.getNext() != null){
        myString += current.getData()+"->";
        current = current.getNext();
      }
      myString += current.getData();
    }
    return myString;
  }
}