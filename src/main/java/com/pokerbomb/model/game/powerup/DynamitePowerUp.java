package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.DynamiteCard;

public class DynamitePowerUp implements PowerUp {
    private int numberOfPowerUp;
    private static DynamitePowerUp instance;

    private DynamitePowerUp(){
        numberOfPowerUp=0;
    }

    public static DynamitePowerUp getInstance(){
        if(DynamitePowerUp.instance == null){
            DynamitePowerUp.instance = new DynamitePowerUp();
        }
        return DynamitePowerUp.instance;
    }

    @Override
    public int getNumberOfPowerUp() {
        return numberOfPowerUp;
    }

    @Override
    public void addPowerUp() {
        numberOfPowerUp++;
    }

    public boolean addPlayToDynamiteCard(DynamiteCard dynamiteCard, int numberPlays){
        int i = dynamiteCard.getSpecialAttribute();
        dynamiteCard.removeSpecialAttribute(-numberPlays);
        if(dynamiteCard.getSpecialAttribute()==i+numberPlays) return true;
        return false;
    }


}
