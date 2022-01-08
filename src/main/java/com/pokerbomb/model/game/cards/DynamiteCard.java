package com.pokerbomb.model.game.cards;

public class DynamiteCard extends Card {

    public DynamiteCard(Suit suit, Rank rank) {
        super(suit, rank);
        specialAttribute = 5;
    }

    @Override
    boolean inACombo(int i) {
        return true;
    }

    @Override
    boolean notInACombo() {
        removeSpecialAttribute(1);
        return specialAttribute==0;
    }

    public void removeSpecialAttribute(int i) {
        if(specialAttribute-i<0){
            specialAttribute=0;
        } else specialAttribute-=i;
    }

}
