package com.pokerbomb.controller.state;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.Model;
import com.pokerbomb.view.View;

import java.io.IOException;

public abstract class ControllerState<T extends Model> {


    FactoryState factory;
    TextGraphics graphics;

    public ControllerState(FactoryState factory) {
        this.factory = factory;
    }

    public abstract View<T> getView();

    protected void draw(TextGraphics graphics) throws IOException {
        this.getView().draw(0, 0);
    }

    protected ControllerState<?> goToState(ControllerState<?> nextState) throws IOException {
        if (nextState != this)
            this.getView().close();
        return nextState;
    }

    public CommandKey getCommand() throws IOException {
        draw(graphics);
        CommandKey commandKey = this.getView().getCommand();
        if (commandKey == null)
            return this.getView().getCommand();
        return commandKey;
    }

    public abstract ControllerState<?> execute(Controller controller, CommandKey commandKey) throws IOException, ClassNotFoundException, CloneNotSupportedException;
}

