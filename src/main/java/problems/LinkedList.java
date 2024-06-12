package problems;


public class LinkedList<G>{
  private Node<G> headNode;
  public LinkedList (){}
  public LinkedList (Node<G> n){
    headNode = n;
  }
  public LinkedList (G n){
    headNode = new Node<>(n);
  }

  private void insertNode(Node<G> newNode){
    
  }

  public void insertAtHead(Node<G> newNode){
    if (headNode == null){
      headNode = newNode;
    }
    else{
      Node<G> current = newNode;
      while (current.hasNext()){
        current = current.getNext();
      }
      current.setNext(headNode);
      headNode = newNode;
    }
  }

  public void insertAtHead(G newData){
      headNode = new Node<G>(newData, headNode);
  }
  
  public void insertAtEnd(Node<G> newNode){
    if (headNode == null){
      headNode = newNode;
    }
    else{
      Node<G> current = headNode;
      while(current.hasNext()){
        current = current.getNext();
      }
      current.setNext(newNode);
    }
  }

  public void insertAtEnd(G data){
    insertAtEnd(new Node<G>(data));
  }

  public boolean contains(G data){
    Node<G> current = headNode;
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
    Node<G> current = headNode;
      while(current != null){
        count++;
        current = current.getNext();
      }
    return count;
  }

  public String toString(){
    StringBuilder str = new StringBuilder();
    Node<G> current = headNode;
    while(current != null){
        str.append(current.getData().toString()).append(", ");
        current = current.getNext();
    }
    
    return "[" + str.substring(0, str.length()-2) + "]";
  }










  
}
