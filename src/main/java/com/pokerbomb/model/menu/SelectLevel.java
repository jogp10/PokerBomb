package com.pokerbomb.model.menu;

import com.pokerbomb.model.Model;
import com.pokerbomb.model.game.Game;

public class SelectLevel implements Model {

    public enum Level {L1, L2, L3, L4, L5, L6,L7, L8, L9, L10}
    SelectLevel.Level[] opt = SelectLevel.Level.values();

    Level selected;
    int selectedi;

    public SelectLevel() {
        this.selected = SelectLevel.Level.L1;
    }

    public SelectLevel.Level getSelected() {
        return selected;
    }

    public int getSelectedAsInt() {
        int selected = 0;

        switch (this.getSelected()) {
            case L1:
                selected = 1;
                break;
            case L2:
                selected = 2;
                break;
            case L3:
                selected = 3;
                break;
            case L4:
                selected = 4;
                break;
            case L5:
                selected = 5;
                break;
            case L6:
                selected = 6;
                break;
            case L7:
                selected = 7;
                break;
            case L8:
                selected = 8;
                break;
            case L9:
                selected = 9;
                break;
            case L10:
                selected = 10;
                break;
        }

        return selected;
    }

    public void setSelected(SelectLevel.Level selected) {
        this.selected = selected;
    }

    public int getPosElem(SelectLevel.Level target) {
        int i = 0;
        for (; opt[i] != target; i++) ;
        return i;
    }

    public void nextSelected() {
        if (selected == SelectLevel.Level.L10) selected = SelectLevel.Level.L1;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i++;
            selected = opt[i];
        }
    }

    public void previousSelected() {
        if (selected == SelectLevel.Level.L1) selected = SelectLevel.Level.L10;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i--;
            selected = opt[i];
        }
    }


}
