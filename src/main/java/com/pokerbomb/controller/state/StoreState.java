package com.pokerbomb.controller.state;



import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.menu.Store;
import com.pokerbomb.view.StoreView;
import com.pokerbomb.view.View;

import java.io.IOException;

public class StoreState extends ControllerState<Store> {
    Boolean inGame;
    Store model;
    StoreView view;

    public StoreState(FactoryState factory, Store storeModel, StoreView storeView) {
        super(factory);
        this.model = storeModel;
        this.view = storeView;
        this.graphics = storeView.initGraphics();
    }

    @Override
    public View<Store> getView() {
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
                    case JUNGLE:
                        //nextState = factory.genSelectLevelState();  //  buy jungle powerup
                        break;
                    case DYNAMITE:
                        //nextState = factory.genInsState(inGame);  //  buy dynamite powerup
                        break;
                    case DEFREEZE:
                        //nextState = factory.genInsState(inGame);  //  buy defreeze powerup
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
