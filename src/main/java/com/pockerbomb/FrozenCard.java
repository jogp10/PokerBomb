package com.pockerbomb;

public class FrozenCard extends Card implements GenericSpecialCard{
    private int numberOfLayers;

    public FrozenCard(Suit suit, Rank rank) {
        super(suit, rank);
        numberOfLayers = 2;
    }


    @Override
    public void removeSpecialAttribute() {
        removeSpecialAttribute(1);
    }

    @Override
    public void removeSpecialAttribute(int number_layers) {
        numberOfLayers-=number_layers;
    }

    @Override
    public int getSpecialAttribute() {
        return numberOfLayers;
    }

    @Override
    public boolean isActive() {
        return numberOfLayers > 0;
    }

    @Override
    public void draw() {
        if(isActive()){

        }
    }

}
