package com.pokerbomb.controller;

import com.pokerbomb.controller.state.ControllerState;
import com.pokerbomb.controller.state.FactoryState;

import java.io.IOException;

public class Controller {
    ControllerState<?> state;

    public Controller(FactoryState factory) {
        this.state = factory.genMenuState(false);
    }

    public void start() throws InterruptedException, IOException, CloneNotSupportedException, ClassNotFoundException {
        while (this.state != null) {
            this.state = this.state.execute(this, this.state.getCommand());
            Thread.sleep(30);
        }
    }
}
