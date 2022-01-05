package com.pockerbomb.view.cards;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pockerbomb.model.game.cards.NormalCard;
import com.pockerbomb.view.View;

import java.io.IOException;

public class NormalCardView extends CardView {

    protected NormalCardView(NormalCard model, TextGraphics graphics) {
        super(model, graphics);
    }

    @Override
    public void draw(int col, int row) throws IOException {
        super.draw(col, row);
    }
}
