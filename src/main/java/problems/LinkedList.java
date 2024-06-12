package problems;

class Node<G>{
  private G data;// The data and value held inside the node
  private Node nextNode; // The Node that the current one is pointing to
  public Node(){}
  public Node(G data){this.data = data;}
  public Node(G data, Node nextNode){
      this.data = data;
      this.nextNode = nextNode;
  }
  public hasNext(){
    return next != null;
  }
  //Make getters and setters.
}
public class LinkedList<G>{
  private Node<G> headNode;
  public LinkedList (){}
  public LinkedList (Node n){
    headNode = n;
  }
  public LinkedList (G n){
    headNode.setData(n);
  }

  private void insertNode(Node newNode){
    
  }

  public void insertAtHead(Node newNode){
    if (headNode == null){
      headNode = newNode;
    }
    else{
      Node current = newNode;
      while (current.hasNext()){
        current = current.getNext();
      }
      current.setNext(headNode);
      headNode = newNode;
    }
  }

  public void insertAtHead(G newData){
      headNode = new Node(newData, headNode);
  }
  
  public void insertAtEnd(Node newNode){
    if (head == null){
      head = newNode;
    }
    else{
      Node current = head;
      while(current.hasNext()){
        current = current.getNext();
      }
      current.setNext(newNode);
    }
  }

  public void insertAtEnd(G data){
    insertAtEnd(new Node(data));
  }

  public boolean contains(G data){
    Node current = head;
      while(current != null){
        if (current.getData().equals(data)){
          return true;
        }
        current = current.getNext();
      }
    return false;
  }

  public int size(){
    int count = 0;
    Node current = head;
      while(current != null){
        count++;
      }
    return false;
    return count;
  }

  public String toString(){
    String str = "";
    Node current = head;
    while(current != null){
        str += current.getData().toString() + ", ";
    }
    
    return "[" + str.substring(0, str.length()-2) + "]";
  }










  
}
