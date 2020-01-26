
public class Pile extends Card{

    private Card topCard;
    private int amount;

    public Pile(Card card, int amount) {
        this.topCard = card;
        this.amount = amount;
    }

    public void addCard(Card card) {
        card.setNextNode(this.topCard);
        this.topCard = card;
        this.amount++;
    }

    public Card removeCard(Card card) {
        this.topCard = card.getNextNode();
    }
}

