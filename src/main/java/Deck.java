import java.util.ArrayList;
import java.util.Random;

public class Deck {

    // instance vars
    private ArrayList<Card> cards;

    // construct
    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public void createFullDeck() {
        // Generate Cards
        for(Suit cardSuit : Suit.values()) {
            for(Value cardValue : Value.values()) {
                // Add a new card to the deck
                this.cards.add( new Card(cardSuit, cardValue));
            }
        }
    }

    public String toString() {
        String cardListOutput = "";
        for(Card card: this.cards) {
            cardListOutput += "\n" + card.toString();
        }
        return cardListOutput;
    }

    public void shuffle() {
        ArrayList<Card> tmpDeck = new ArrayList<Card>();

        // Random
        Random random = new Random();
        int randomCardIndex = 0;
        int originalSize = this.cards.size();

        for( int i = 0; i < originalSize; i++) {
            // Generate Random Index
            randomCardIndex = random.nextInt((this.cards.size()-1) + 1);
            tmpDeck.add(this.cards.get(randomCardIndex));
            // Remove from original deck
            this.cards.remove(randomCardIndex);
        }

        this.cards = tmpDeck;
    }

    public Card removeCard( int i) {
        Card card = this.getCard(i);
        this.cards.remove(i);
        return card;
    }

    public Card getCard( int i) {
        return this.cards.get(i);
    }

    public void addCard (Card addCard) {
        this.cards.add(addCard);
    }

    //Draws from the deck
    public Card draw() {
        return this.getCard(0);
    }
}
