package com.pokerbomb.view.game.cards;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.cards.DynamiteCard;

import java.io.IOException;

public class DynamiteCardView extends CardViewGeneric {

    public DynamiteCardView(DynamiteCard model, TextGraphics graphics) {
        super(model, graphics);
    }

    @Override
    public void draw(int col, int row) throws IOException {
        super.draw(col, row);
        if(model.isActive()) {
            graphics.setForegroundColor(TextColor.Factory.fromString("#FF0000"));
            graphics.putString(col + 4, row + 3, String.valueOf(model.getSpecialAttribute()));
        }
    }
}
