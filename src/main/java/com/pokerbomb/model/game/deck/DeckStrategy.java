package com.pokerbomb.model.game.deck;

import com.pokerbomb.model.game.cards.Card;

import java.util.ArrayList;

public interface DeckStrategy {
    public ArrayList<Card> createFullDeck(ArrayList<Card> cards);
}
