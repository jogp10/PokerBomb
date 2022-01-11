package com.pokerbomb.view.cards;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.cards.FrozenCard;
import com.pokerbomb.view.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FrozenCardView extends CardView {

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
        super.setBackgroundColour(backgroundColors.get(model.getSpecialAttribute()));
        super.draw(col, row);
    }
}
