package com.pockerbomb

import spock.lang.Specification

class BrickSpockTest extends Specification{

    def 'com.pockerbomb.Brick removeLayers'() {
        given:
            Card brick = new Brick()

        when:
            brick.removeSpecialAttribute(1)

        then:
            brick.specialAttribute==0
    }

    def 'com.pockerbomb.Brick constructor'() {
        given:
            Card brick = new Brick()

        when:
            int numberOfLayers = brick.getSpecialAttribute()

        then:
            numberOfLayers==1
    }

    def 'com.pockerbomb.Brick isActive'() {
        given:
            Card brick = new Brick()

        expect:
            brick.isActive();
    }
}
