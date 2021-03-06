package com.pokerbomb.model.game.deck;

import com.pokerbomb.model.Model;
import com.pokerbomb.model.game.cards.*;

import java.util.ArrayList;
import java.util.Random;

public class Deck implements Model {

    // instance vars
    private ArrayList<Card> cards;
    private ArrayList<Card> hand;
    private DeckStrategy deckStrategy;


    // construct
    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void setDeckStrategy(DeckStrategy deckStrategy){
        this.deckStrategy=deckStrategy;
    }

    public void createFullDeck() {
        if(deckStrategy==null) deckStrategy=new EasyDeckStrategy();
        this.cards=deckStrategy.createFullDeck(cards);
    }

    public String toString() {
        StringBuilder cardListOutput = new StringBuilder();
        for(Card card : this.cards) {
            cardListOutput.append("\n").append(card.toString());
        }
        return cardListOutput.toString();
    }

    public void shuffle() {
        ArrayList<Card> tmpDeck = new ArrayList<>();

        // Random
        Random random = new Random();
        int randomCardIndex;
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

    public Card removeCard(int i) {
        Card card = this.getCard(i);
        this.cards.remove(i);
        return card;
    }

    public Card getCard(int i) {
        return this.cards.get(i);
    }

    public void addCard (Card addCard) {
        this.cards.add(addCard);
    }

    //Pop from the deck
    public Card pop(Deck comingFrom) {
        return this.pop(comingFrom, 0);
    }
    public Card pop(Deck comingFrom, int cardToDraw) {
        this.cards.add(comingFrom.getCard(cardToDraw));
        return comingFrom.removeCard(cardToDraw);
    }

    public ArrayList<Card> getDeck(){
        return cards;
    }
}
