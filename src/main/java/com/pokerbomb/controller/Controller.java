package com.pokerbomb.controller;

import com.pokerbomb.controller.state.ControllerState;
import com.pokerbomb.controller.state.FactoryState;
import com.pokerbomb.model.Player;

import java.io.IOException;

public class Controller {
    ControllerState<?> state;

    public Controller(FactoryState factory) {
        this.state = factory.genMenuState(false);
    }

    public void start() throws InterruptedException, IOException, CloneNotSupportedException, ClassNotFoundException {
        Player.getInstance();
        while (this.state != null) {
            this.state = this.state.execute(this, this.state.getCommand());
            Thread.sleep(30);
        }
        Player.getInstance().end();
    }
}
