package com.pokerbomb.model

import spock.lang.Specification

class ButtonSpockTest extends Specification {
    def 'TestButton'() {
        given:
            Button button = new Button(100, 100)
        expect:
            button.getHeight()==100
            button.getWidth()==100
    }
}
