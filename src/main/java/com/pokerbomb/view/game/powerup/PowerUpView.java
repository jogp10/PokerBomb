package com.pokerbomb.view.game.powerup;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.powerup.PowerUp;
import com.pokerbomb.view.View;

import java.io.IOException;

public class PowerUpView extends View<PowerUp> {

    protected PowerUpView(PowerUp model, TextGraphics graphics) {
        super(model);
    }

    @Override
    public void draw(int col, int row) throws IOException {
    }
}
