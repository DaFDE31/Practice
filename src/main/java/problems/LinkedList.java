package problems;

// THIS CODE IS MEANT TO SHOW YOU HOW LINKED LISTS WORK
public class LinkedList<G>{ // G means the linked list can hold any data type. It could hold integers, doubles, strings, or even other classes

  private Node<G> headNode; // headNode is the first node, or data in the list

  //Constrctors
  public LinkedList (){}
  public LinkedList (Node<G> n){
    headNode = n;
  }
  public LinkedList (G n){
    headNode = new Node<>(n);
  }

  //This method inserts a node containing newData after the node that has data
  // 6 ->7 ->9 with insertAfter(7,8) becomes 6 ->7 ->8->9
  public void insertAfter(G data, G newData){
    Node<G> current = headNode;
    // This while loop starts at the headNode, and goes until the end or it has found a node with the data it was looking for
    while (current != null){
      if (current.getData().equals(data)){
        current.setNext(new Node<G>(newData, current.getNext())); //Sets the node after the found node to the new Data
        return; 
      }
      current = current.getNext();
    }
  }

  //This method inserts a node containing newData before the node that has data
  // 1 ->2 ->4 with insertAfter(4,3) becomes 1 ->2 ->3->4
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

  //This inserts a node at the beginning of the list
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
      insertAtHead(new Node<>(newData));
  }

  //This inserts a node at the end of the list
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

  //Removes a node from the list and pushes every node after it back one spot
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

  //replaces a node's value with newData
  public void replace(G data, G newData){
    Node<G> current = headNode;
    while (current != null){
      if (current.getData().equals(data)){
        current.setData(newData);
        return;
      }
      current = current.getNext();
    }
  }

  //Returns true if the list contains the data
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

  //Returns the size of the list
  public int size(){
    int count = 0;
    Node<G> current = headNode;
      while(current != null){
        count++;
        current = current.getNext();
      }
    return count;
  }

  // Prints the list
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
