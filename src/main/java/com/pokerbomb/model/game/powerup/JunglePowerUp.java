package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.Player;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.SpecialCard;
import com.pokerbomb.model.game.deck.Deck;
import com.pokerbomb.model.game.cards.JungleCard;

import java.util.ArrayList;

public class JunglePowerUp implements PowerUp {
    private static int numberOfPowerUp;
    private static JunglePowerUp instance;
    private static int price = 1;

    private JunglePowerUp(){
        numberOfPowerUp=2;
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
    public void setNumberOfPowerUp(int i) {
        numberOfPowerUp=i;
    }

    @Override
    public void addPowerUp() {
        numberOfPowerUp++;
    }

    public Card usePowerUp(SpecialCard jungleCard){
        if(getNumberOfPowerUp()<0) {
            numberOfPowerUp=0;
            return jungleCard;
        }
        jungleCard.inACombo(1);
        return jungleCard;
    }

    public Deck usePowerUp(ArrayList<Card> cards){
        Deck d = new Deck();
        for(Card card: cards){
            if(card instanceof JungleCard) {
                this.usePowerUp((JungleCard) card);
            }
            d.addCard(card);
        }
        this.numberOfPowerUp--;
        return d;
    }

    @Override
    public int buy() {
        if(!Player.getInstance().buy(price)) return 0;
        addPowerUp();
        price+=3;
        return price-3;
    }
}
