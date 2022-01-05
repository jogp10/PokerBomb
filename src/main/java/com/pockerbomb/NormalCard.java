package com.pockerbomb;

public class NormalCard implements Card {
    protected Suit suit;
    protected Rank rank;

    public NormalCard(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.suit.toString() + "-" + this.rank.toString();
    }

    @Override
    public Rank getRank() {
        return this.rank;
    }

    @Override
    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public int getRankValue() {
        int value=2;
        for(Rank r: Rank.values()){
            if(r==this.rank) return value;
            value += 1;
        }
        return 0;
    }

    @Override
    public int getSuitValue() {
        int value=1;
        for(Suit s: Suit.values()){
            if(s==this.suit) return value;
            value += 1;
        }
        return 0;
    }

    @Override
    public void draw() {

    }

}