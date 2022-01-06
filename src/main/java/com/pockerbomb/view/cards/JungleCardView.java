package com.pockerbomb.view.cards;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pockerbomb.model.game.cards.JungleCard;
import com.pockerbomb.view.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JungleCardView extends View<JungleCard> {

    CardView cardView;

    static final List<String> backgroundColors = new ArrayList<String>() {{
        add("#FFFFFF"); // default
        add("##00FF00"); // Lime
        add("#008000"); // Green
        add("#008080"); // Teal
    }};

    public JungleCardView(JungleCard model, TextGraphics graphics) {
        super(model);
        this.graphics=graphics;
        cardView = new CardView(model, graphics);
    }

    public void draw(int col, int row) throws IOException {
        cardView.setBackgroundColour(backgroundColors.get(model.getSpecialAttribute()));
        cardView.draw(col, row);
    }
}
