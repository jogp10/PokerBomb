package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.Deck;
import com.pokerbomb.model.game.cards.FrozenCard;
import com.pokerbomb.model.game.cards.JungleCard;

import java.util.ArrayList;

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

    public Card removeLayerJungleCard(JungleCard jungleCard){
        if(getNumberOfPowerUp()==0) return jungleCard;
        jungleCard.inACombo(1);
        return jungleCard;
    }

    public Deck removeLayerJungleCard(ArrayList<Card> cards){
        Deck d = new Deck();
        for(Card card: cards){
            if(card instanceof JungleCard) {
                this.removeLayerJungleCard((JungleCard) card);
            }
            d.addCard(card);
        }
        numberOfPowerUp--;
        return d;
    }
}
