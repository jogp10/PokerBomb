package com.pokerbomb.view.cards;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.cards.*;

public class CardViewFactory {
    public CardView createCardView(Card card, TextGraphics graphics){
        if(card instanceof DynamiteCard) {
            return new DynamiteCardView((DynamiteCard) card, graphics);
        }
        if(card instanceof FrozenCard) {
            return new FrozenCardView((FrozenCard) card, graphics);
        }
        if(card instanceof JungleCard) {
            return new JungleCardView((JungleCard) card, graphics);
        }
        if(card instanceof NormalCard) {
            return new NormalCardView((NormalCard) card, graphics);
        }
        return null;
    }
}
