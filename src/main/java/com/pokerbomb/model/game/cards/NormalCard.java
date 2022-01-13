package com.pokerbomb.model.game.cards;

public class NormalCard extends CardGeneric implements Card {
    public NormalCard(Suit suit, Rank rank) {
        super(suit, rank);
    }

    @Override
    public Card getCard() {
        return this;
    }
}
