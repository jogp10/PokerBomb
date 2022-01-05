package com.pockerbomb;

public class Brick extends NormalCard implements GenericSpecialCard {
    private int numOfLayers;

    public Brick() {
        super(Suit.HEART, Rank.ACE);
        numOfLayers = 1;
    }

    @Override
    public void removeSpecialAttribute(int i) {
        numOfLayers=0;
    }

    @Override
    public int getSpecialAttribute() {
        return numOfLayers;
    }

    @Override
    public boolean isActive() {
        return numOfLayers > 0;
    }

    @Override
    public void draw() {
        if(isActive()){

        }
    }
}
