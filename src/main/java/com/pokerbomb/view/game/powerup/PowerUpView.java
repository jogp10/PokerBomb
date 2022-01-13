package com.pokerbomb.view.game.powerup;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.view.View;

import java.io.IOException;

public interface PowerUpView {
    public void draw(int col, int row) throws IOException;
}
