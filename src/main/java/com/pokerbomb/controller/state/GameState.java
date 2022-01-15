package com.pokerbomb.controller.state;

import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.game.Game;
import com.pokerbomb.model.game.cards.Deck;
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
                gameModel.selectU();
                break;
            case DOWN:
                gameModel.deselectU();
                break;
            case RIGHT:
                if (gameModel.getSelectedU() == Game.CombineButton.NOT) {
                    gameModel.nextSelected();
                }
                else {
                    gameModel.changeSelectedU();
                }
                break;
            case LEFT:
                if (gameModel.getSelectedU() == Game.CombineButton.NOT) {
                    gameModel.previousSelected();
                }
                else {
                    gameModel.changeSelectedU();
                }
                break;
            case D1:
                Deck newd1 = gameModel.getDeck_1();
                if (newd1.getDeck().size() <= 4) {
                    gameModel.moveToDeck(newd1);
                    gameModel.setD1(newd1);
                    Deck newg1 = gameModel.getGivenDeck();
                    gameModel.removeFromDeck(newg1);
                    gameModel.addNewCardToG();
                }
                break;
            case D2:
                Deck newd2 = gameModel.getDeck_2();
                if (newd2.getDeck().size() <= 4) {
                    gameModel.moveToDeck(newd2);
                    gameModel.setD2(newd2);
                    Deck newg2 = gameModel.getGivenDeck();
                    gameModel.removeFromDeck(newg2);
                    gameModel.addNewCardToG();
                }
                break;

            case C1:





                break;
            case C2:



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
