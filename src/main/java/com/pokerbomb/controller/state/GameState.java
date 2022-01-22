package com.pokerbomb.controller.state;

import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.game.GameImplementation;
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

public class GameState extends ControllerState<GameImplementation> {
    GameImplementation gameImplementationModel;
    GameView gameView;


    public GameState(FactoryState factory, GameImplementation gameImplementationModel, GameView gameView) {
        super(factory);
        this.gameImplementationModel = gameImplementationModel;
        this.gameView = gameView;
        this.graphics = gameView.initGraphics();
    }

    @Override
    public View<GameImplementation> getView() {
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
        for(Card card: gameImplementationModel.getDeck_1().getDeck()){
            if(!card.notInACombo())
                d1.addCard(card);
        }
        for(Card card: gameImplementationModel.getDeck_2().getDeck()){
            if(!card.notInACombo())
                d2.addCard(card);
        }

        gameImplementationModel.setD1(d1);
        gameImplementationModel.setD2(d2);
    }

    void Right(){
        if ((gameImplementationModel.getSelectedU() == GameImplementation.CombineButton.NOT) && (gameImplementationModel.getSelectedP() == GameImplementation.PowerUpButton.NOT)) {
            gameImplementationModel.nextSelected();
        }
        else if (gameImplementationModel.getSelectedU() != GameImplementation.CombineButton.NOT) {
            gameImplementationModel.changeSelectedU();
        }
        else if (gameImplementationModel.getSelectedP() != GameImplementation.PowerUpButton.NOT) {
            gameImplementationModel.nextSelectedP();
        }
    }

    void Up(){
        if (gameImplementationModel.getSelectedP() != GameImplementation.PowerUpButton.NOT) {
            gameImplementationModel.deselectP();
        }
        else {
            gameImplementationModel.selectU();
        }
    }

    void Down(){
        if (gameImplementationModel.getSelectedU() != GameImplementation.CombineButton.NOT) {
            gameImplementationModel.deselectU();
        }
        else {
            gameImplementationModel.selectP();
        }
    }

    void Left(){
        if ((gameImplementationModel.getSelectedU() == GameImplementation.CombineButton.NOT) && (gameImplementationModel.getSelectedP() == GameImplementation.PowerUpButton.NOT)) {
            gameImplementationModel.previousSelected();
        }
        else if ((gameImplementationModel.getSelectedU() != GameImplementation.CombineButton.NOT)) {
            gameImplementationModel.changeSelectedU();
        }
        else if (gameImplementationModel.getSelectedP() != GameImplementation.PowerUpButton.NOT) {
            gameImplementationModel.previousSelectedP();
        }
    }

    void DeckChoice(int i){
        Deck newd;
        if(i==1) newd = gameImplementationModel.getDeck_1();
        else newd = gameImplementationModel.getDeck_2();

        if (newd.getDeck().size() <= 4) {
            gameImplementationModel.moveToDeck(newd);

            if(i==1) gameImplementationModel.setD1(newd);
            else gameImplementationModel.setD2(newd);

            Deck newg = gameImplementationModel.getGivenDeck();

            gameImplementationModel.removeFromDeck(newg);
            gameImplementationModel.addNewCardToG();
            PlayWithoutCombo();

            String s = Hand.handRanking(newd.getDeck());
            if(i==1) gameImplementationModel.setString_1(s);
            else gameImplementationModel.setString_2(s);
        }
    }

    void PowerUpSelect(int i){
        PowerUp powerUp;
        if(i==1) powerUp = JunglePowerUp.getInstance();
        else if(i==2) powerUp = DynamitePowerUp.getInstance();
        else powerUp = FrozenPowerUp.getInstance();

        powerUp.addPowerUp();

        Deck newdeck1 = gameImplementationModel.getDeck_1();
        Deck newdeck2 = gameImplementationModel.getDeck_2();

        newdeck1 = powerUp.usePowerUp(newdeck1.getDeck());
        newdeck2 = powerUp.usePowerUp(newdeck2.getDeck());


        gameImplementationModel.setD1(newdeck1);
        gameImplementationModel.setD2(newdeck2);
    }

    void HandSelect(int i, Hand hand){
        if(i==1) gameImplementationModel.setD1(Hand.handConfirm(gameImplementationModel.getDeck_1().getDeck(), hand));
        else gameImplementationModel.setD2(Hand.handConfirm(gameImplementationModel.getDeck_2().getDeck(), hand));

        String s = Hand.handRanking(gameImplementationModel.getDeck_1().getDeck());
        gameImplementationModel.setString_1(s);
        s = Hand.handRanking(gameImplementationModel.getDeck_2().getDeck());
        gameImplementationModel.setString_2(s);
    }

    void Enter(){
        Hand hand = new Hand();
        ArrayList<Goal> goals = gameImplementationModel.getLevels().get(gameImplementationModel.getLevel()-1).getGoals();
        Collections.reverse(goals);

        if (gameImplementationModel.getSelectedU() == GameImplementation.CombineButton.U1) {
            HandSelect(1, hand);
            for (Goal goal : goals) {
                goal.increment(hand);
            }
        }
        else if(gameImplementationModel.getSelectedU() == GameImplementation.CombineButton.U2){
            HandSelect(2, hand);

            for (Goal goal : goals) {
                goal.increment(hand);
            }
        }
        else if (gameImplementationModel.getSelectedP() == GameImplementation.PowerUpButton.P3) {
            PowerUpSelect(3);
        }
        else if (gameImplementationModel.getSelectedP() == GameImplementation.PowerUpButton.P2) {
            PowerUpSelect(2);
        }
        else if (gameImplementationModel.getSelectedP() == GameImplementation.PowerUpButton.P1) {
            PowerUpSelect(1);
        }
        Collections.reverse(goals);
    }
}
