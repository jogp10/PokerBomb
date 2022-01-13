package com.pokerbomb.model.game.cards;

public class JungleCardFactory implements CardFactory {
    @Override
    public CardGeneric createCard(Suit suit, Rank rank) {
        return new JungleCard(suit, rank);
    }
}
