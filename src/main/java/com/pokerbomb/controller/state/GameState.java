package com.pokerbomb.controller.state;

import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.game.Game;
import com.pokerbomb.view.GameView;
import com.pokerbomb.view.View;

import java.io.IOException;

public class GameState extends ControllerState<Game> {
    Game gameModel;
    GameView gameView;


    public GameState(FactoryState factory, Game gameModel, GameView gameView) {
        super(factory);
        this.gameModel = gameModel;
        this.gameView = gameView;
        this.graphics = gameView.initGraphics();
    }

    @Override
    public View<Game> getView() {
        return gameView;
    }

    @Override
    public ControllerState<?> execute(Controller controller, CommandKey commandKey) throws IOException {
        CommandKey command = null;
        ControllerState<?> nextState = this;
        switch (commandKey.getCommandEnum()) {
            case UP:
                //GameModel.getCursor().moveUp();
                break;
            case DOWN:
                //gameModel.getCursor().moveDown();
                break;
            case RIGHT:
                //gameModel.nextSelected();
                break;
            case LEFT:
                //gameModel.previousSelected();
                break;
            case ENTER:
                //command = new Flag(gameModel);   place card in deck
                break;
            case ESC:
                nextState = factory.genMenuState(true);
                break;
            case QUIT:
                nextState = null;
                break;
        }
        /*if (command != null)
            try {
                command.execute();
                gameModel.addCommand(command);
                if (gameModel.checkWin())
                    nextState = factory.genGameOverState(configuration, gameModel.getTable().getScore());
            } catch (GameOver g) {
                nextState = factory.genGameOverState(configuration, gameModel.getTable().getScore());
            }*/
        return goToState(nextState);

    }

}
