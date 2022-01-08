package com.pokerbomb.model.game.cards;

import com.pokerbomb.model.Model;

public class Card implements Model {

    protected Suit suit;
    protected Rank rank;

    protected int specialAttribute;


    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        specialAttribute = 0;
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

    public boolean isActive() {
        return specialAttribute>0;
    }

    public int getSpecialAttribute() { return specialAttribute; }

    public boolean inACombo(int i){
        return true;
    }

    public boolean notInACombo(){
        return false;
    }

}
