package com.pokerbomb.view.game.cards;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.cards.FrozenCard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FrozenCardView extends CardViewGeneric {

    static final List<String> backgroundColors = new ArrayList<String>() {{
        add("#FFFFFF"); // default White
        add("#00FFFF"); // Aqua
        add("#0000FF"); // Blue
    }};

    public FrozenCardView(FrozenCard model, TextGraphics graphics) {
        super(model, graphics);
    }

    @Override
    public void draw(int col, int row) throws IOException {
        if(model.isActive())  super.setBackgroundColour(backgroundColors.get(model.getSpecialAttribute()-1));
        super.draw(col, row);
    }
}
