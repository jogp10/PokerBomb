package com.pokerbomb.view.game.powerup;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.powerup.GenericPowerUp;

public class JunglePowerUpView extends GenericPowerUpView{

    protected JunglePowerUpView(GenericPowerUp model, TextGraphics graphics) {
        super(model, graphics);
    }

    @Override
    public void draw(int col, int row) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#00FF00"));
        graphics.putString(col, row, "b");
    }
}
