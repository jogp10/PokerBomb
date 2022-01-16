package com.pokerbomb.model.menu;

import com.pokerbomb.model.Model;


public class Menu implements Model {

    public enum Option {START, INST, STORE, EXIT}    //Enum used to avoid typing errors

    public String[] optString = {"PLAY", "INSTRUCTIONS", "STORE", "EXIT"}; //get the string associated to the enumerator

    Option selected;
    Option[] opt = Option.values();

    public Menu() {
        this.selected = Option.START;
    }

    public Option getSelected() {
        return selected;
    }

    public void setSelected(Option selected) {
        this.selected = selected;
    }

    public int getPosElem(Option target) {
        int i = 0;
        for (; opt[i] != target; i++) ;
        return i;
    }

    public void nextSelected() {
        if (selected == Option.EXIT) selected = Option.START;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i++;
            selected = opt[i];
        }
    }

    public void previousSelected() {
        if (selected == Option.START) selected = Option.EXIT;
        else {
            //find the position of this.selected in the opt array
            int i = getPosElem(selected);
            i--;
            selected = opt[i];
        }
    }

    public String enumToString(Option menuOption) {
        int position = getPosElem(menuOption);
        return optString[position];
    }
}




