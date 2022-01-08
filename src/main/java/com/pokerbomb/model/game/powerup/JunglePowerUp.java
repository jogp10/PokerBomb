package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.JungleCard;

public class JunglePowerUp implements GenericPowerUp{
    private int numberOfPowerUp;

    public JunglePowerUp(){
        numberOfPowerUp=0;
    }

    @Override
    public int getNumberOfPowerUp() {
        return numberOfPowerUp;
    }

    @Override
    public void addPowerUp() {
        numberOfPowerUp++;
    }

    public boolean removeLayerJungleCard(JungleCard jungleCard){
        int i = jungleCard.getSpecialAttribute();
        jungleCard.inACombo(1);
        if(jungleCard.getSpecialAttribute()<i) return true;
        return false;
    }
}
