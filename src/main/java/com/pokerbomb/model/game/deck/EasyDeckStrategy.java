package com.pokerbomb.model.game.deck;

import com.pokerbomb.model.game.cards.*;

import java.util.ArrayList;
import java.util.Random;

public class EasyDeckStrategy implements DeckStrategy{
    @Override
    public ArrayList<Card> createFullDeck(ArrayList<Card> cards) {
        // Generate Cards
        Random random = new Random();
        for(Suit cardSuit : Suit.values()) {
            for(Rank cardRank : Rank.values()) {
                int n = random.nextInt(100);

                // Add a new card to the deck
                if(n<10) {
                    cards.add( new JungleCard(cardSuit, cardRank));
                    continue;
                }
                if(n<20) {
                    cards.add( new DynamiteCard(cardSuit, cardRank));
                    continue;
                }
                if(n<30) {
                    cards.add( new FrozenCard(cardSuit, cardRank));
                    continue;
                }
                cards.add( new NormalCard(cardSuit, cardRank));
            }
        }
        return cards;
    }
}
