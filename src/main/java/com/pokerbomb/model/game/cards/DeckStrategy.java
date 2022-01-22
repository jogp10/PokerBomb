package com.pokerbomb.model.game.cards;

import java.util.ArrayList;

public interface DeckStrategy {
    public ArrayList<Card> createFullDeck(ArrayList<Card> cards);
}
