package com.pokerbomb.controller.state;

import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.game.Game;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.cards.Deck;
import com.pokerbomb.model.game.cards.Hand;
import com.pokerbomb.model.game.goals.Goal;
import com.pokerbomb.model.game.powerup.DynamitePowerUp;
import com.pokerbomb.model.game.powerup.FrozenPowerUp;
import com.pokerbomb.model.game.powerup.JunglePowerUp;
import com.pokerbomb.view.GameView;
import com.pokerbomb.view.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

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
                if (gameModel.getSelectedP() != Game.PowerUpButton.NOT) {
                    gameModel.deselectP();
                }
                else {
                    gameModel.selectU();
                }
                break;
            case DOWN:
                if (gameModel.getSelectedU() != Game.CombineButton.NOT) {
                    gameModel.deselectU();
                }
                else {
                    gameModel.selectP();
                }
                break;
            case RIGHT:
                if ((gameModel.getSelectedU() == Game.CombineButton.NOT) && (gameModel.getSelectedP() == Game.PowerUpButton.NOT)) {
                    gameModel.nextSelected();
                }
                else if (gameModel.getSelectedU() != Game.CombineButton.NOT) {
                    gameModel.changeSelectedU();
                }
                else if (gameModel.getSelectedP() != Game.PowerUpButton.NOT) {
                    gameModel.nextSelectedP();
                }
                break;
            case LEFT:
                if ((gameModel.getSelectedU() == Game.CombineButton.NOT) && (gameModel.getSelectedP() == Game.PowerUpButton.NOT)) {
                    gameModel.previousSelected();
                }
                else if ((gameModel.getSelectedU() != Game.CombineButton.NOT)) {
                    gameModel.changeSelectedU();
                }
                else if (gameModel.getSelectedP() != Game.PowerUpButton.NOT) {
                    gameModel.previousSelectedP();
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
                    PlayWithoutCombo();

                    String s = Hand.handRanking(newd1.getDeck());
                    gameModel.setString_1(s);
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
                    PlayWithoutCombo();

                    String s = Hand.handRanking(newd2.getDeck());
                    gameModel.setString_2(s);
                }
                break;
            case ENTER:
                Hand hand = new Hand();
                ArrayList<Goal> goals = gameModel.getLevels().get(gameModel.getLevel()-1).getGoals();
                Collections.reverse(goals);
                if (gameModel.getSelectedU() == Game.CombineButton.U1) {
                    gameModel.setD1(Hand.handConfirm(gameModel.getDeck_1().getDeck(), hand));
                    String s = Hand.handRanking(gameModel.getDeck_1().getDeck());
                    gameModel.setString_1(s);
                    for (Goal goal : goals) {
                        goal.increment(hand);
                    }
                }
                else if (gameModel.getSelectedU() == Game.CombineButton.U2) {
                    gameModel.setD2(Hand.handConfirm(gameModel.getDeck_2().getDeck(), hand));
                    String s = Hand.handRanking(gameModel.getDeck_2().getDeck());
                    gameModel.setString_2(s);
                    for (Goal goal : goals) {
                        goal.increment(hand);
                    }
                }
                else if (gameModel.getSelectedP() == Game.PowerUpButton.P1) {
                    JunglePowerUp jungle = JunglePowerUp.getInstance();
                    jungle.addPowerUp();
                    jungle.addPowerUp();

                    Deck newdeck1 = gameModel.getDeck_1();
                    Deck newdeck2 = gameModel.getDeck_2();

                    newdeck1 = jungle.removeLayerJungleCard(newdeck1.getDeck());
                    newdeck2 = jungle.removeLayerJungleCard(newdeck2.getDeck());


                    gameModel.setD1(newdeck1);
                    gameModel.setD2(newdeck2);
                }
                else if (gameModel.getSelectedP() == Game.PowerUpButton.P2) {
                    DynamitePowerUp dynamite = DynamitePowerUp.getInstance();
                    dynamite.addPowerUp();
                    dynamite.addPowerUp();


                    Deck newdeck1 = gameModel.getDeck_1();
                    Deck newdeck2 = gameModel.getDeck_2();

                    newdeck1 = dynamite.addPlayToDynamiteCard(newdeck1.getDeck());
                    newdeck2 = dynamite.addPlayToDynamiteCard(newdeck2.getDeck());


                    gameModel.setD1(newdeck1);
                    gameModel.setD2(newdeck2);
                }
                else if (gameModel.getSelectedP() == Game.PowerUpButton.P3) {
                    FrozenPowerUp frozen = FrozenPowerUp.getInstance();
                    frozen.addPowerUp();
                    frozen.addPowerUp();



                    Deck newdeck1 = gameModel.getDeck_1();
                    Deck newdeck2 = gameModel.getDeck_2();

                    newdeck1 = frozen.Unfreeze(newdeck1.getDeck());
                    newdeck2 = frozen.Unfreeze(newdeck2.getDeck());

                    gameModel.setD1(newdeck1);
                    gameModel.setD2(newdeck2);
                }
                Collections.reverse(goals);
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

    void PlayWithoutCombo(){
        Deck d1 = new Deck();
        Deck d2 = new Deck();
        for(Card card: gameModel.getDeck_1().getDeck()){
            if(!card.notInACombo())
                d1.addCard(card);
        }
        for(Card card: gameModel.getDeck_2().getDeck()){
            if(!card.notInACombo())
                d2.addCard(card);
        }

        gameModel.setD1(d1);
        gameModel.setD2(d2);
    }

}
