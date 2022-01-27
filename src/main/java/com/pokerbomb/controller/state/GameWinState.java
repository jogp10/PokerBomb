package com.pokerbomb.controller.state;

import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.GameWin;
import com.pokerbomb.view.GameWinView;
import com.pokerbomb.view.View;

import java.io.IOException;

public class GameWinState extends ControllerState<GameWin>{

    GameWin gameWinModel;
    GameWinView gameWinView;

    public GameWinState(FactoryState factory, GameWin gameWinModel, GameWinView gameWinView) {
        super(factory);
        this.gameWinModel = gameWinModel;
        this.gameWinView = gameWinView;
        this.graphics = gameWinView.initGraphics();
    }

    @Override
    public View<GameWin> getView() {
        return gameWinView;
    }

    @Override
    public ControllerState<?> execute(Controller controller, CommandKey readCommand) throws IOException {
        ControllerState<?> nextState = this;
        switch (readCommand.getCommandEnum()) {
            case ESC:
                nextState = factory.genMenuState(false);
                break;
            case ENTER:
                nextState = factory.genMenuState(false);
                break;
            case QUIT:
                nextState = null;
                break;
        }
        return goToState(nextState);
    }



}