

public class Card{
    private String[] nums = new String[] {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private String[] suits = new String[] {"Spades", "Hearts", "Clubs", "Diamonds"};
    private int num;
    private int suit;
    private Node next;

    public Card(int num, int suit) {

        if (suit < 1 || suit > 4){
            throw new IllegalArgumentException("Suit must be between 1-4");
        }

        else if (num < 1 || num > 13) {
            throw new IllegalArgumentException("Rank must be 1 - 13");
        }

        else {
            this.num = num;
            this.suit = suit;
            this.next = null;
        }

    }//method Card

    public int getCardNum() {

        return this.num;

    }//getter for Card Num

    public String getNumName() {

        return nums[this.num - 1];

    }//getter for Card Number Name

    public int getSuitNum() {

        return this.suit;

    }//getter Suit Num

    public String getSuitName() {

        return suits[this.suit - 1];

    }//getter for Suit Name

    public void setSuit(int suit) {

        if (suit < 1 || suit > 4){
            throw new IllegalArgumentException("Suit must be between 1-4");
        }
        else {
            this.suit = suit;
        }

    }//setter for Suit

    public void setNum(int num) {
        if (num < 1 || num > 13) {
            throw new IllegalArgumentException("Rank must be 1 - 13");
        }
        else {
            this.num = num;
        }
    }

    private class Node {
        private Card card;
        private Node next;

        private Node(Card card, Node next) {
            this.card = card;
            this.next = next;
        }//constructor
    }//class Node

}//class Card
