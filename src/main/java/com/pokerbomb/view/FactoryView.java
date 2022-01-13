package com.pokerbomb.view;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.Shelf;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.Deck;
import com.pokerbomb.model.game.powerup.PowerUp;
import com.pokerbomb.view.game.cards.CardView;
import com.pokerbomb.view.game.cards.CardViewFactory;
import com.pokerbomb.view.game.cards.DeckView;
import com.pokerbomb.view.game.powerup.PowerUpView;
import com.pokerbomb.view.game.powerup.PowerUpViewFactory;

public class FactoryView {

    public ShelfView genShelfView(Shelf model, TextGraphics graphics) {
        BorderView borderView = new BorderView(model.getWidth(), model.getHeight(), graphics);
        return new ShelfView(model, borderView, graphics);
    }

    public CardView genCardView(Card model, TextGraphics graphics) {
        CardViewFactory cardViewFactory = new CardViewFactory();
        return cardViewFactory.createCardView(model, graphics);
    }


    public DeckView genDeckView(Deck model, TextGraphics graphics) {
        return new DeckView(model, graphics);
    }

    public PowerUpView genPowerUpView(PowerUp model, TextGraphics graphics) {
        PowerUpViewFactory powerUpViewFactory = new PowerUpViewFactory();
        return powerUpViewFactory.createPowerUpView(model, graphics);
    }
}
