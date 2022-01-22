package com.pokerbomb.controller.state;

import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.GameOver;
import com.pokerbomb.view.GameOverView;
import com.pokerbomb.view.View;

import java.io.IOException;

public class GameOverState extends ControllerState<GameOver>{

    GameOver gameOverModel;
    GameOverView gameOverView;

    public GameOverState(FactoryState factory, GameOver gameOverModel, GameOverView gameOverView) {
        super(factory);
        this.gameOverModel = gameOverModel;
        this.gameOverView = gameOverView;
        this.graphics = gameOverView.initGraphics();
    }

    @Override
    public View<GameOver> getView() {
        return gameOverView;
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
