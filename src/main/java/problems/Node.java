package problems;

public class Node<G> {
    private G data;// The data and value held inside the node
    private Node<G> nextNode; // The pointer to the next node in the list

    public Node(){}

    public Node(G data){this.data = data;}

    public Node(G data, Node<G> nextNode){
            this.data = data;
            this.nextNode = nextNode;
        }

    public G getData() {
        return data;
    }

    public void setData(G data) {
        this.data = data;
    }

    public Node<G> getNext() {
        return nextNode;
    }

    public void setNext(Node<G> nextNode) {
        this.nextNode = nextNode;
    }

    public boolean hasNext() {
        return nextNode != null;
    }
}
