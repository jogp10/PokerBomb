package com.pokerbomb.model.game.cards;

public class DynamiteCard extends CardGeneric implements Card {

    public DynamiteCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 5;
    }

    @Override
    public boolean inACombo(int i) {
        return true;
    }

    @Override
    public boolean notInACombo() {
        removeSpecialAttribute(1);
        return specialAttribute==0;
    }

    @Override
    public Card getCard() {
        return this;
    }

    public void removeSpecialAttribute(int i) {
        if(specialAttribute-i<0){
            specialAttribute=0;
        } else specialAttribute-=i;
    }

}
