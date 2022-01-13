package com.pokerbomb.controller.state;

import com.pokerbomb.model.game.Game;
import com.pokerbomb.model.menu.Ins;
import com.pokerbomb.model.menu.Menu;
import com.pokerbomb.view.FactoryView;
import com.pokerbomb.view.GameView;
import com.pokerbomb.view.InsView;
import com.pokerbomb.view.MenuView;

public class FactoryState {

    public MenuState genMenuState(Boolean inGame) {
        Menu menuModel = new Menu();
        MenuView menuView = new MenuView(menuModel);
        return new MenuState(this, inGame, menuModel, menuView);
    }

    public InsState genInsState(Boolean inGame) {
        Ins instModel = new Ins();
        InsView instView = new InsView(instModel);
        return new InsState(this, inGame, instModel, instView);
    }

    public GameState genGameState() {
        Game gameModel = new Game();
        GameView gameView = new GameView(gameModel, new FactoryView());
        GameState gameState = new GameState(this,gameModel, gameView);
        return gameState;
    }
}
