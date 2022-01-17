package com.pokerbomb.view.game.powerup;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.model.game.cards.*;
import com.pokerbomb.model.game.powerup.DynamitePowerUp;
import com.pokerbomb.model.game.powerup.FrozenPowerUp;
import com.pokerbomb.model.game.powerup.JunglePowerUp;
import com.pokerbomb.model.game.powerup.PowerUp;
import com.pokerbomb.view.game.cards.*;

public class PowerUpViewFactory {
    public PowerUpView createPowerUpView(PowerUp powerUp, TextGraphics graphics){
        if(powerUp instanceof DynamitePowerUp) {
            return new DynamitePowerUpView((DynamitePowerUp) powerUp, graphics);
        }
        if(powerUp instanceof JunglePowerUp) {
            return new JunglePowerUpView((JunglePowerUp) powerUp, graphics);
        }
        if(powerUp instanceof FrozenPowerUp) {
            return new FrozenPowerUpView((FrozenPowerUp) powerUp, graphics);
        }
        return null;
    }
}
