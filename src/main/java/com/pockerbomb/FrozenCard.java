package com.pockerbomb;

public class FrozenCard extends NormalCard implements GenericSpecialCard {
    private int numOfLayers;

    public FrozenCard(Suit suit, Rank rank) {
        super(suit, rank);
        numOfLayers = 2;
    }

    @Override
    public void removeSpecialAttribute(int number_layers) {
        if(numOfLayers-number_layers<0){
            numOfLayers=0;
        }
        else numOfLayers-=number_layers;
    }

    @Override
    public int getSpecialAttribute() {
        return numOfLayers;
    }

    @Override
    public boolean isActive() {
        return numOfLayers>0;
    }


    @Override
    public void draw() {
        super.draw();
        if(isActive()){

        }
    }
}
