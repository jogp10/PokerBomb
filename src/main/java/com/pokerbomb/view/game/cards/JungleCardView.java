package com.pokerbomb.view.game.cards;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.JungleCard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JungleCardView extends CardViewGeneric {

    static final List<String> backgroundColors = new ArrayList<String>() {{
        add("#FFFFFF"); // default
        add("##00FF00"); // Lime
        add("#008000"); // Green
        add("#008080"); // Teal
    }};

    public JungleCardView(JungleCard model, TextGraphics graphics) {
        super(model, graphics);
    }

    public void draw(int col, int row) throws IOException {
        if(model.isActive()) super.setBackgroundColour(backgroundColors.get(model.getSpecialAttribute()-1));
        super.draw(col, row);
    }
}
