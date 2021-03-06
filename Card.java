
public class Card{
    private String[] nums = new String[] {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private String[] suits = new String[] {"Spades", "Hearts", "Clubs", "Diamonds"};
    private int num;
    private int suit;

    public Card() {
        //initializing num and suit to -1, for future error checking and not initializing multiple cards
        //of the same suit. If default constructor is used, suit and num will be changed later on
        this.num = -1;
        this.suit = -1;
    }

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
        }

    }//constructor

    public int getNum() {

        return this.num;

    }//getter for Card Num

    public String getNumName() {

        return nums[this.num - 1];

    }//getter for Card Number Name

    public int getSuit() {

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
}//class Card
