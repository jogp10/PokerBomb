package com.pokerbomb;


import com.pokerbomb.controller.Controller;
import com.pokerbomb.controller.state.FactoryState;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException, CloneNotSupportedException, ClassNotFoundException {

        Controller controller = new Controller(new FactoryState());
        controller.start();

        // Player's info
            //long playerCoins = 0;
    }
}
