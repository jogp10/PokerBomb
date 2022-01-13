package com.pokerbomb.model.game.cards;

public interface CardFactory {
    CardGeneric createCard(Suit suit, Rank rank);
}



