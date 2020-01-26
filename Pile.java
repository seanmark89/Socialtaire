public class Pile extends Card{

    private Card topCard;
    private int amount;
    private Node top;

    public Pile(Card card, int amount) {
        this.topCard = card;
        this.amount = amount;
        top = new Node(card, null, null);
    }

    public void addCard(Card card) {
        //card.setNextNode(this.topCard);
        this.topCard = card;
        this.amount++;
        top = new Node(card, top, null);
    }

    public Node removeCard(Card card) {
        Node trl = this.top;
        Node ptr = null;
        Node temp = null;
        if (trl.getNext() != null)
            ptr = trl.getNext();
        while(ptr != null) {
            if (ptr.getData().getCardNum() == card.getCardNum() && ptr.getData().getSuitNum() == card.getSuitNum()) {
                temp = ptr;
                trl.setNext(ptr.getNext());
                this.amount--;
                return temp;
            }

            trl = ptr;
            ptr = ptr.getNext();
        }
        return temp;
    }

    public Node removeCards(Card card1, Card card2) {
        Node trl = this.top;
        Node ptr = null;
        Node temp = null;
        int cnt = 1;
        if (trl.getNext() != null)
            ptr = trl.getNext();

        while(ptr != null) {
            if (ptr.getData().getCardNum() == card1.getCardNum() && ptr.getData().getSuitNum() == card1.getSuitNum()) {
                temp = ptr;
                while(ptr != null) {
                    if (ptr.getData().getCardNum() == card2.getCardNum() && ptr.getData().getSuitNum() == card2.getSuitNum()) {
                        trl.setNext(ptr.getNext());
                        return temp;
                    }
                    ptr = ptr.getNext();
                }
            }
            trl = ptr;
            ptr = ptr.getNext();
        }
        return temp;
    }
}
