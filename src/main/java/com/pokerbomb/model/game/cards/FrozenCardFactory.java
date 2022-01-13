package com.pokerbomb.model.game.cards;

public class FrozenCardFactory implements CardFactory {
    @Override
    public CardGeneric createCard(Suit suit, Rank rank) {
        return new FrozenCard(suit, rank);
    }
}
