package com.pockerbomb;

public class Brick implements GenericSpecialCard{
    private int numberOfLayers;

    public Brick() {
        numberOfLayers = 1;
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
