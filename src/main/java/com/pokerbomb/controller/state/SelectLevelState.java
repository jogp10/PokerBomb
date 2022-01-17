package com.pokerbomb.controller.state;

import com.pokerbomb.controller.CommandKey;
import com.pokerbomb.controller.Controller;
import com.pokerbomb.model.menu.Ins;
import com.pokerbomb.model.menu.SelectLevel;
import com.pokerbomb.view.InsView;
import com.pokerbomb.view.SelectLevelView;
import com.pokerbomb.view.View;

import java.io.IOException;

public class SelectLevelState extends ControllerState<SelectLevel> {

    Boolean inGame;
    SelectLevel lModel;
    SelectLevelView lView;

    public SelectLevelState(FactoryState factory, SelectLevel lModel, SelectLevelView lView) {
        super(factory);
        this.lModel = lModel;
        this.lView = lView;
        this.graphics = lView.initGraphics();
    }

    @Override
    public View<SelectLevel> getView() {
        return lView;
    }

    @Override
    public ControllerState<?> execute(Controller controller, CommandKey readCommand) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        ControllerState<?> nextState = this;
        switch (readCommand.getCommandEnum()) {
            case UP:
                lModel.previousSelected();
                break;
            case DOWN:
                lModel.nextSelected();
                break;
            case ENTER:
                int selected = lModel.getSelectedAsInt();
                nextState = factory.genGameState(selected);  //determine theh level selected, and initialize a new game instance with it
                break;
            case ESC:
                nextState = factory.genMenuState(true);
                break;
            case QUIT:
                nextState = null;
        }
        return goToState(nextState);
    }

}
