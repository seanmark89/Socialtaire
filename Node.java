
public class Node {

    private Card card;
    private Node next;

    public Node(Card card, Node next) {
        this.card = card;
        this.next = next;
    }

    void setnext(Node newNode) {
        this.next = newNode;
        newNode.next = this.getNext();
    }

    Node getNext() {
        return this.next;
    }

    Card getData() {
        return this.card;
    }

}
