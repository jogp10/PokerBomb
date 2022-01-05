package com.pockerbomb.model.game.cards;

import com.pockerbomb.model.Model;

public abstract class Card implements Model {

    protected Suit suit;
    protected Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return this.suit.toString() + "-" + this.rank.toString();
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getRankValue() {
        int value=2;
        for(Rank r: Rank.values()){
            if(r==this.rank) return value;
            value += 1;
        }
        return 0;
    }

    public int getSuitValue() {
        int value=1;
        for(Suit s: Suit.values()){
            if(s==this.suit) return value;
            value += 1;
        }
        return 0;
    }

    abstract boolean inACombo(int i);
    abstract boolean notInACombo();

}
