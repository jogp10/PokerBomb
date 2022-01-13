package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.JungleCard;

public class JunglePowerUp implements PowerUp {
    private int numberOfPowerUp;
    private static JunglePowerUp instance;

    private JunglePowerUp(){
        numberOfPowerUp=0;
    }

    public static JunglePowerUp getInstance(){
        if(JunglePowerUp.instance == null){
            JunglePowerUp.instance = new JunglePowerUp();
        }
        return JunglePowerUp.instance;
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
