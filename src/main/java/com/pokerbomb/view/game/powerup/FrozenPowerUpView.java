package com.pokerbomb.view.game.powerup;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.powerup.GenericPowerUp;

public class FrozenPowerUpView extends GenericPowerUpView{

    protected FrozenPowerUpView(GenericPowerUp model, TextGraphics graphics) {
        super(model, graphics);
    }

    @Override
    public void draw(int col, int row) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#00FFFF"));
        graphics.putString(col, row, "\u2744");
    }
}
