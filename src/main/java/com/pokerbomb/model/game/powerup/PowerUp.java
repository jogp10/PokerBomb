package com.pokerbomb.model.game.powerup;

import com.pokerbomb.model.Model;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.SpecialCard;
import com.pokerbomb.model.game.deck.Deck;

import java.util.ArrayList;

public interface PowerUp extends Model {

    int getNumberOfPowerUp();

    void addPowerUp();

    Card usePowerUp(SpecialCard card);
    Deck usePowerUp(ArrayList<Card> cards);
}
