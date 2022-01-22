package com.pokerbomb.controller.state;

import com.pokerbomb.model.game.GameImplementation;
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
        GameImplementation gameImplementationModel = new GameImplementation(l);
        GameView gameView = new GameView(gameImplementationModel, new FactoryView());
        GameState gameState = new GameState(this, gameImplementationModel, gameView);
        return gameState;
    }

    public SelectLevelState genSelectLevelState() {
        SelectLevel selectModel = new SelectLevel();
        SelectLevelView selectView = new SelectLevelView(selectModel);
        SelectLevelState selectState = new SelectLevelState(this, selectModel, selectView);
        return selectState;
    }
}
