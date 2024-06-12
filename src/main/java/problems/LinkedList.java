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
      
    }
  }

  public void insertAtHead(G newData){
      headNode = new Node(newData, headNode);
  }
  
  public void insertAtEnd(Node newNode){
    if (head == null){
      head = newNode;
    }
    Node current = head;
    while(current.hasNext()){
      current = current.getNextNode();
    }
    current.setNextNode(newNode);
  }

  public void insertAtEnd(G data){
    insertAtEnd(new Node(data));
  }










  
}
