package com.pockerbomb.model.game.cards;


public class NormalCard extends Card {

    public NormalCard(Suit suit, Rank rank){
        super(suit, rank);
    }

    @Override
    boolean inACombo(int i) {
        return true;
    }

    @Override
    boolean notInACombo() {
        return false;
    }

}
