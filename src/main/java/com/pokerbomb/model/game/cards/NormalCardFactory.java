package com.pokerbomb.model.game.cards;

public class NormalCardFactory implements CardFactory {
    @Override
    public CardGeneric createCard(Suit suit, Rank rank) {
        return new NormalCard(suit, rank);
    }
}

