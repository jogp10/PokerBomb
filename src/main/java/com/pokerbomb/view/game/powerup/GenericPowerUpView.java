package com.pokerbomb.view.game.powerup;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.powerup.PowerUp;
import com.pokerbomb.view.View;

public abstract class GenericPowerUpView extends View<PowerUp> implements PowerUpView {

    protected GenericPowerUpView(PowerUp model, TextGraphics graphics) {
        super(model);
        this.graphics = graphics;
    }

    public abstract void draw(int col, int row);
}
