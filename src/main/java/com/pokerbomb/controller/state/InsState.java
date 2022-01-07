package com.pokerbomb.controller.state;

import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.menu.Ins;
import com.pokerbomb.view.InsView;
import com.pokerbomb.view.View;

import java.io.IOException;

public class InsState extends ControllerState<Ins>{

    Boolean inGame;
    Ins insModel;
    InsView insView;

    public InsState(FactoryState factory, Boolean inGame, Ins instModel, InsView instView) {
        super(factory);
        this.inGame = inGame;
        this.insModel = instModel;
        this.insView = instView;
        this.graphics = insView.initGraphics();
    }

    @Override
    public View<Ins> getView() {
        return insView;
    }

    @Override
    public ControllerState<?> execute(Controller controller, CommandKey readCommand) throws IOException {
        ControllerState<?> nextState = this;
        switch (readCommand.getCommandEnum()) {
            case ENTER:
                nextState = factory.genMenuState(inGame);
                break;
            case QUIT: {
                nextState = null;
                break;
            }
        }
        return goToState(nextState);
    }
}
