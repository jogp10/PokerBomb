package com.pockerbomb;

public class BomberCard extends Card implements GenericSpecialCard{
    private int numberOfPlaysUntilBomb;

    public BomberCard(Suit suit, Rank rank) {
        super(suit, rank);
        numberOfPlaysUntilBomb = 7;
    }


    @Override
    public void removeSpecialAttribute() {
        numberOfPlaysUntilBomb--;
    }

    @Override
    public void removeSpecialAttribute(int number_plays) {
        removeSpecialAttribute();
    }

    @Override
    public int getSpecialAttribute() {
        return numberOfPlaysUntilBomb;
    }

    @Override
    public boolean isActive() {
        return numberOfPlaysUntilBomb > 0;
    }

    @Override
    public void draw() {
        if(isActive()){

        }
    }


}
