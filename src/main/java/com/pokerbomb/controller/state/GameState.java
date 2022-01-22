package com.pokerbomb.controller.state;

import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.game.Game;
import com.pokerbomb.model.game.cards.Card;
import com.pokerbomb.model.game.deck.Deck;
import com.pokerbomb.model.game.cards.Hand;
import com.pokerbomb.model.game.goals.Goal;
import com.pokerbomb.model.game.powerup.DynamitePowerUp;
import com.pokerbomb.model.game.powerup.FrozenPowerUp;
import com.pokerbomb.model.game.powerup.JunglePowerUp;
import com.pokerbomb.model.game.powerup.PowerUp;
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
                Up();
                break;
            case DOWN:
                Down();
                break;
            case RIGHT:
                Right();
                break;
            case LEFT:
                Left();
                break;
            case D1:
                DeckChoice(1);
                break;
            case D2:
                DeckChoice(2);
                break;
            case ENTER:
                Enter();
                break;
            case ESC:
                nextState = factory.genMenuState(true);
                break;
            case QUIT:
                nextState = null;
                break;
        }
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

    void Right(){
        if ((gameModel.getSelectedU() == Game.CombineButton.NOT) && (gameModel.getSelectedP() == Game.PowerUpButton.NOT)) {
            gameModel.nextSelected();
        }
        else if (gameModel.getSelectedU() != Game.CombineButton.NOT) {
            gameModel.changeSelectedU();
        }
        else if (gameModel.getSelectedP() != Game.PowerUpButton.NOT) {
            gameModel.nextSelectedP();
        }
    }

    void Up(){
        if (gameModel.getSelectedP() != Game.PowerUpButton.NOT) {
            gameModel.deselectP();
        }
        else {
            gameModel.selectU();
        }
    }

    void Down(){
        if (gameModel.getSelectedU() != Game.CombineButton.NOT) {
            gameModel.deselectU();
        }
        else {
            gameModel.selectP();
        }
    }

    void Left(){
        if ((gameModel.getSelectedU() == Game.CombineButton.NOT) && (gameModel.getSelectedP() == Game.PowerUpButton.NOT)) {
            gameModel.previousSelected();
        }
        else if ((gameModel.getSelectedU() != Game.CombineButton.NOT)) {
            gameModel.changeSelectedU();
        }
        else if (gameModel.getSelectedP() != Game.PowerUpButton.NOT) {
            gameModel.previousSelectedP();
        }
    }

    void DeckChoice(int i){
        Deck newd;
        if(i==1) newd = gameModel.getDeck_1();
        else newd = gameModel.getDeck_2();

        if (newd.getDeck().size() <= 4) {
            gameModel.moveToDeck(newd);

            if(i==1) gameModel.setD1(newd);
            else gameModel.setD2(newd);

            Deck newg = gameModel.getGivenDeck();

            gameModel.removeFromDeck(newg);
            gameModel.addNewCardToG();
            PlayWithoutCombo();

            String s = Hand.handRanking(newd.getDeck());
            if(i==1) gameModel.setString_1(s);
            else gameModel.setString_2(s);
        }
    }

    void PowerUpSelect(int i){
        PowerUp powerUp;
        if(i==1) powerUp = JunglePowerUp.getInstance();
        else if(i==2) powerUp = DynamitePowerUp.getInstance();
        else powerUp = FrozenPowerUp.getInstance();

        powerUp.addPowerUp();

        Deck newdeck1 = gameModel.getDeck_1();
        Deck newdeck2 = gameModel.getDeck_2();

        newdeck1 = powerUp.usePowerUp(newdeck1.getDeck());
        newdeck2 = powerUp.usePowerUp(newdeck2.getDeck());


        gameModel.setD1(newdeck1);
        gameModel.setD2(newdeck2);
    }

    void HandSelect(int i, Hand hand){
        if(i==1) gameModel.setD1(Hand.handConfirm(gameModel.getDeck_1().getDeck(), hand));
        else gameModel.setD2(Hand.handConfirm(gameModel.getDeck_2().getDeck(), hand));

        String s = Hand.handRanking(gameModel.getDeck_1().getDeck());
        gameModel.setString_1(s);
        s = Hand.handRanking(gameModel.getDeck_2().getDeck());
        gameModel.setString_2(s);
    }

    void Enter(){
        Hand hand = new Hand();
        ArrayList<Goal> goals = gameModel.getLevels().get(gameModel.getLevel()-1).getGoals();
        Collections.reverse(goals);

        if (gameModel.getSelectedU() == Game.CombineButton.U1) {
            HandSelect(1, hand);
            for (Goal goal : goals) {
                goal.increment(hand);
            }
        }
        else if(gameModel.getSelectedU() == Game.CombineButton.U2){
            HandSelect(2, hand);

            for (Goal goal : goals) {
                goal.increment(hand);
            }
        }
        else if (gameModel.getSelectedP() == Game.PowerUpButton.P3) {
            PowerUpSelect(3);
        }
        else if (gameModel.getSelectedP() == Game.PowerUpButton.P2) {
            PowerUpSelect(2);
        }
        else if (gameModel.getSelectedP() == Game.PowerUpButton.P1) {
            PowerUpSelect(1);
        }
        Collections.reverse(goals);
    }
}
