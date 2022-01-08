package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.JungleCard;

public class JunglePowerUp implements GenericPowerUp{
    private int numberOfPowerUp;

    public JunglePowerUp(){

    }

    @Override
    public int getNumberOfPowerUp() {
        return 0;
    }

    @Override
    public void addPowerUp() {
    }

    public boolean removeLayerJungleCard(JungleCard jungleCard){
        return true;
    }
}
