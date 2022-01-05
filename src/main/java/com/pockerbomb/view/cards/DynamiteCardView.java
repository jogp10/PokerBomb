package com.pockerbomb.view.cards;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pockerbomb.model.game.cards.Card;
import com.pockerbomb.model.game.cards.DynamiteCard;
import com.pockerbomb.view.View;

import java.io.IOException;

public class DynamiteCardView extends View<DynamiteCard> {

    CardView cardView;

    public DynamiteCardView(DynamiteCard model, TextGraphics graphics) {
        super(model);
        this.graphics=graphics;
        cardView = new CardView(model, graphics);
    }

    @Override
    public void draw(int col, int row) throws IOException {
            cardView.draw(col, row);

            graphics.setForegroundColor(TextColor.Factory.fromString("#FF0000"));
            graphics.putString(col+2, row+4, String.valueOf(model.getSpecialAttribute()));
    }
}
