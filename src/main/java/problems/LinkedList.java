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

  public void insertAfter(G data, G newData){
    Node<G> current = headNode;
    while (current != null){
      if (current.getData().equals(data)){
        current.setNext(new Node<G>(newData, current.getNext()));
        return; 
      }
      current = current.getNext();
    }
  }


  public void insertBefore(G data, G newData){
    if (headNode.getData().equals(data)){
      insertAtHead(data);
    }
    else{
      Node<G> current = headNode;
      while (current.hasNext()){
        if (current.getNext().getData().equals(data)){
          current.setNext(new Node<G>(newData, current.getNext()));
          return; 
        }
        current = current.getNext();
      }

    }
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

  public void remove(G data){
    if (headNode != null && headNode.getData().equals(data)){
      headNode = headNode.getNext();
    }
    else{
      Node<G> current = headNode;
      while(current.hasNext()){
        if (current.getNext().getData().equals(data)){
          current.setNext(current.getNext().getNext());
          return;
        }
        current = current.getNext();
      }
    }
    
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
    if (str.toString().isEmpty()){
      return "[]";
    }
    return "[" + str.substring(0, str.length()-2) + "]";
  }
}
