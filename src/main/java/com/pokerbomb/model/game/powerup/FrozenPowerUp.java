package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.FrozenCard;

public class FrozenPowerUp implements PowerUp {
    private int numberOfPowerUp;
    private static FrozenPowerUp instance;

    private FrozenPowerUp(){
        numberOfPowerUp=0;
    }

    public static FrozenPowerUp getInstance(){
        if(FrozenPowerUp.instance == null){
            FrozenPowerUp.instance = new FrozenPowerUp();
        }
        return FrozenPowerUp.instance;
    }

    public int getNumberOfPowerUp(){
        return numberOfPowerUp;
    }

    public void addPowerUp(){
        numberOfPowerUp++;
    }

    public boolean Unfreeze(FrozenCard frozenCard){
        frozenCard.inACombo(100);
        return !frozenCard.isActive();
    }
}
