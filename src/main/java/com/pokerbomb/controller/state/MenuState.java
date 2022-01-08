package com.pokerbomb.controller.state;

import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.menu.Menu;
import com.pokerbomb.view.MenuView;
import com.pokerbomb.view.View;

import java.io.IOException;

public class MenuState extends ControllerState<Menu> {
    Boolean inGame;
    Menu model;
    MenuView view;

    public MenuState(FactoryState factory, Boolean inGame, Menu menuModel, MenuView menuView) {
        super(factory);
        this.model = menuModel;
        this.view = menuView;
        this.inGame = inGame;
        this.graphics = menuView.initGraphics();
    }

    @Override
    public View<Menu> getView() {
        return view;
    }

    @Override
    public ControllerState<?> execute(Controller controller, CommandKey readCommand) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        ControllerState<?> nextState = this;
        switch (readCommand.getCommandEnum()) {
            case UP:
                model.previousSelected();
                break;
            case DOWN:
                model.nextSelected();
                break;
            case ENTER:
                switch (model.getSelected()) {
                    case START:
                        if (!inGame) {
                            //nextState = factory.genGameState(controller);
                        }

                        else {
                            //nextState = factory.genGameState(controller.getGame());
                        }
                        break;
                    case INST:
                        nextState = factory.genInsState(inGame);
                        break;
                    case EXIT:
                        nextState = null;
                }
                break;
            case QUIT:
                nextState = null;
        }
        return goToState(nextState);
    }
}

