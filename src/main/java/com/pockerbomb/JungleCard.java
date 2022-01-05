package com.pockerbomb;

public class JungleCard extends NormalCard implements GenericSpecialCard {
    private int numOfLayers;
    private int numOfPlaysToAddLayer;

    public JungleCard(Suit suit, Rank rank) {
        super(suit, rank);
        numOfLayers = 0;
        numOfPlaysToAddLayer = 0;
    }

    @Override
    public void removeSpecialAttribute(int number_layers) {
        if(numOfLayers-number_layers<0){
            numOfLayers=0;
        }
        else numOfLayers-=number_layers;
        numOfPlaysToAddLayer=0;
    }

    @Override
    public  int getSpecialAttribute() {
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

    public void addLayer(int number_layers){
        numOfLayers+=number_layers;
        if(numOfLayers-3>0) numOfLayers=3;
    }

    public void addNumberOfPlaysWithoutCombo() {
        // Add another layer if card is not in a combo after 4 plays
        numOfPlaysToAddLayer++;

        if(numOfPlaysToAddLayer>3 && numOfLayers!=3){
            addLayer(1);
        }
    }

}
