package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.Player;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.SpecialCard;
import com.pokerbomb.model.game.deck.Deck;
import com.pokerbomb.model.game.cards.FrozenCard;

import java.util.ArrayList;

public class FrozenPowerUp implements PowerUp {
    private int numberOfPowerUp;
    private static FrozenPowerUp instance;
    private static int price = 1;

    private FrozenPowerUp(){
        numberOfPowerUp=1;
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

    @Override
    public void setNumberOfPowerUp(int i) {
        numberOfPowerUp=i;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void addPowerUp(){
        numberOfPowerUp++;
    }

    public Card usePowerUp(SpecialCard frozenCard){
        if(getNumberOfPowerUp()==0) return frozenCard;
        frozenCard.inACombo(100);
        return frozenCard;
    }

    public Deck usePowerUp(ArrayList<Card> cards){
        Deck d = new Deck();
        for(Card card: cards){
            if(card instanceof FrozenCard && getNumberOfPowerUp()>0) {
                this.usePowerUp((FrozenCard) card);
            }
            d.addCard(card);
        }
        if(getNumberOfPowerUp()<1) return d;
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

    @Override
    public void setPrice(int i) {
        price = i;
    }
}
