package com.pokerbomb.model.game.cards;

public class DynamiteCardFactory implements CardFactory {
    @Override
    public CardGeneric createCard(Suit suit, Rank rank) {
        return new DynamiteCard(suit, rank);
    }
}
