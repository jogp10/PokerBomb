package com.pockerbomb.view.cards;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pockerbomb.model.game.cards.DynamiteCard;
import com.pockerbomb.view.View;

import java.io.IOException;

public class DynamiteCardView extends CardView {

    public DynamiteCardView(DynamiteCard model, TextGraphics graphics) {
        super(model, graphics);
        this.graphics=graphics;
    }

    @Override
    public void draw(int col, int row) throws IOException {
        super.draw(col, row);

        graphics.setForegroundColor(TextColor.Factory.fromString("#FF0000"));
        graphics.putString(col+2, row+4, String.valueOf(model.getSpecialAttribute()));
    }
}
