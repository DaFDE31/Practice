package problems;

class Node<G>{
  G data;
  Node nextNode;
  public Node<G>(){}
  public Node<G>(G data){this.data = data;}
  public Node<G>(G data, Node nextNode){
      this.data = data;
      this.nextNode = nextNode;
  }
}
public class LinkedList<G>{
  Node<G> headNode;
  public LinkedList<G> (){}
  public LinkedList<G> (Node n){
    headNode = n;
  }

  public void insert(Node newNode){
    
  }

  public void insertAtHead(Node newNode){
    if (headNode == null){
      headNode = newNode;
    }
    else{
      
    }
  }
}
