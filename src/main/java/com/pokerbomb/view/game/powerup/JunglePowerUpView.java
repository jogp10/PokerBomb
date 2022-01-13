package com.pokerbomb.view.game.powerup;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.powerup.PowerUp;

public class JunglePowerUpView extends GenericPowerUpView{

    public JunglePowerUpView(PowerUp model, TextGraphics graphics) {
        super(model, graphics);
    }

    @Override
    public void draw(int col, int row) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#00FF00"));
        graphics.putString(col, row, "b");
        graphics.putString(col, row+1, String.valueOf(model.getNumberOfPowerUp()));
    }
}
