package com.pokerbomb.view.powerup;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.Model;
import com.pokerbomb.model.game.powerup.GenericPowerUp;
import com.pokerbomb.view.View;

import java.io.IOException;

public class GenericPowerUpView extends View<GenericPowerUp> {

    protected GenericPowerUpView(GenericPowerUp model, TextGraphics graphics) {
        super(model);
    }

    @Override
    public void draw(int col, int row) throws IOException {
    }
}
