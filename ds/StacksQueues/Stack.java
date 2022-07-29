public class Stack{

  // Place private instance variables here
  private Node start;
  private int size;

  // Place constructors here
  public Stack(){
    this.start = null;
    this.size = 0;
  }
  
  // Place methods here
  public void push(int value){
    Node myNode = new Node(value,this.start);
    this.start = myNode;
    this.size++;
  }

  public int pop(){
    int value;
    if(this.start == null){
      System.out.println("Warning, trying to pop empty stack, returning 0");
      value = 0;
    }else{
      value =this.start.getData();
      this.start = this.start.getNext();
      this.size--;
    }
    return value;
  }

  public int top(){
    int value;
    if(this.start == null){
      System.out.println("Warning empty stack, returning 0");
      value = 0;
    }else{
      value = this.start.getData();
    }
    return value;
  }

  public boolean isEmpty(){
    return this.start == null;
  }

  int size(){
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