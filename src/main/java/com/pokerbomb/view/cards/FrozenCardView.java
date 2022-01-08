package com.pokerbomb.view.cards;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.cards.FrozenCard;
import com.pokerbomb.view.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FrozenCardView extends View<FrozenCard> {

    CardView cardView;

    static final List<String> backgroundColors = new ArrayList<String>() {{
        add("#FFFFFF"); // default White
        add("#00FFFF"); // Aqua
        add("#0000FF"); // Blue
    }};

    public FrozenCardView(FrozenCard model, TextGraphics graphics) {
        super(model);
        this.graphics=graphics;
        cardView = new CardView(model, graphics);
    }

    @Override
    public void draw(int col, int row) throws IOException {
        cardView.setBackgroundColour(backgroundColors.get(model.getSpecialAttribute()));
        cardView.draw(col, row);
    }
}
