package com.pokerbomb.view.cards;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.cards.CardGeneric;

import java.io.IOException;

public class NormalCardView extends CardViewGeneric {
    protected NormalCardView(CardGeneric model, TextGraphics graphics) {
        super(model, graphics);
    }
}
