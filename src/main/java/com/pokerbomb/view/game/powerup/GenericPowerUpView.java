package com.pokerbomb.view.game.powerup;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.powerup.GenericPowerUp;
import com.pokerbomb.view.BorderView;
import com.pokerbomb.view.View;

public abstract class GenericPowerUpView extends View<GenericPowerUp> {

    protected GenericPowerUpView(GenericPowerUp model, TextGraphics graphics) {
        super(model);
        this.graphics = graphics;
    }

    public abstract void draw(int col, int row);
}
