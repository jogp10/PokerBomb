package com.pockerbomb.controller.state;

import com.pockerbomb.model.menu.Menu;
import com.pockerbomb.view.MenuView;

public class FactoryState {

    public MenuState genMenuState( Boolean inGame) {
        Menu menuModel = new Menu(inGame);
        MenuView menuView = new MenuView(menuModel);
        return new MenuState(this, inGame, menuModel, menuView);
    }

}
