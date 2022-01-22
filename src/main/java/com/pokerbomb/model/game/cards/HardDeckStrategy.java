package com.pokerbomb.model.game.cards;

import java.util.ArrayList;
import java.util.Random;

public class HardDeckStrategy implements DeckStrategy{
    @Override
    public ArrayList<Card> createFullDeck(ArrayList<Card> cards) {
        // Generate Cards
        Random random = new Random();
        for(Suit cardSuit : Suit.values()) {
            for(Rank cardRank : Rank.values()) {
                int n = random.nextInt(100);

                // Add a new card to the deck
                if(n<25) {
                    cards.add( new JungleCard(cardSuit, cardRank));
                    continue;
                }
                if(n<45) {
                    cards.add( new DynamiteCard(cardSuit, cardRank));
                    continue;
                }
                if(n<65) {
                    cards.add( new FrozenCard(cardSuit, cardRank));
                    continue;
                }
                cards.add( new NormalCard(cardSuit, cardRank));
            }
        }
        return cards;
    }
}
