package com.pokerbomb.view.game.powerup;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.powerup.PowerUp;

public class FrozenPowerUpView extends GenericPowerUpView {

    public FrozenPowerUpView(PowerUp model, TextGraphics graphics) {
        super(model, graphics);
    }

    @Override
    public void draw(int col, int row) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#00FFFF"));
        graphics.putString(col, row, "c");
        graphics.putString(col, row+1, String.valueOf(model.getNumberOfPowerUp()));
    }
}
