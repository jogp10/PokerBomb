package com.pockerbomb;

public class DynamiteCard extends Card implements GenericSpecialCard{
    private int numberOfPlaysUntilDynamite;

    public DynamiteCard(Suit suit, Rank rank) {
        super(suit, rank);
        numberOfPlaysUntilDynamite = 5;
    }


    @Override
    public void removeSpecialAttribute() {
        numberOfPlaysUntilDynamite--;
    }

    @Override
    public void removeSpecialAttribute(int number_plays) {
        removeSpecialAttribute();
    }

    @Override
    public int getSpecialAttribute() {
        return numberOfPlaysUntilDynamite;
    }

    @Override
    public boolean isActive() {
        return numberOfPlaysUntilDynamite > 0;
    }

    @Override
    public void draw() {
        if(isActive()){

        }
    }

}
