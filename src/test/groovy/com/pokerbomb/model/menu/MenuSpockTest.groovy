package com.pokerbomb.model.menu

import spock.lang.Specification

class MenuSpockTest extends Specification {
    Menu menu;

    def setup() {
        menu = new Menu()
    }

    def 'com.pokerbomb.model.menu getSelected'() {
        expect:
        menu.getSelected() == Menu.Option.START
    }

    def 'com.pokerbomb.model.menu setSelected'() {
        when:
        menu.setSelected(Menu.Option.INST)

        then:
        menu.getSelected() == Menu.Option.INST
    }

    def 'com.pokerbomb.model.menu getPosElem'() {
        when:
        int i = menu.getPosElem(Menu.Option.STORE)

        then:
        i == 2
    }

    def 'com.pokerbomb.model.menu enumToString'() {
        when:
        String opts = menu.enumToString(Menu.Option.START)

        then:
        opts == "PLAY"
    }

}

