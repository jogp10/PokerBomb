package com.pokerbomb.controller.state;

import com.pokerbomb.model.game.Game;
import com.pokerbomb.model.menu.Ins;
import com.pokerbomb.model.menu.Menu;
import com.pokerbomb.model.menu.SelectLevel;
import com.pokerbomb.view.*;

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

    public GameState genGameState(int l) {
        Game gameModel = new Game(l);
        GameView gameView = new GameView(gameModel, new FactoryView());
        GameState gameState = new GameState(this,gameModel, gameView);
        return gameState;
    }

    public SelectLevelState genSelectLevelState() {
        SelectLevel selectModel = new SelectLevel();
        SelectLevelView selectView = new SelectLevelView(selectModel);
        SelectLevelState selectState = new SelectLevelState(this, selectModel, selectView);
        return selectState;
    }
}
