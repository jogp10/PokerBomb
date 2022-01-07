package com.pokerbomb.controller.state;

import com.pokerbomb.model.menu.Ins;
import com.pokerbomb.model.menu.Menu;
import com.pokerbomb.view.InsView;
import com.pokerbomb.view.MenuView;

public class FactoryState {

    public MenuState genMenuState(Boolean inGame) {
        Menu menuModel = new Menu(inGame);
        MenuView menuView = new MenuView(menuModel);
        return new MenuState(this, inGame, menuModel, menuView);
    }

    public InsState genInsState(Boolean inGame) {
        Ins instModel = new Ins();
        InsView instView = new InsView(instModel);
        return new InsState(this, inGame, instModel, instView);
    }
}
