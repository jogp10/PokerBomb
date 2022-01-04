package com.pockerbomb

import com.pockerbomb.Brick
import com.pockerbomb.GenericSpecialCard
import spock.lang.Specification

class BrickSpockTest extends Specification{

    def 'com.pockerbomb.Brick removeLayers'() {
        given:
            Brick brick = new Brick()

        when:
            brick.removeSpecialAttribute()

        then:
            brick.specialAttribute==0
    }

    def 'com.pockerbomb.Brick constructor'() {
        given:
        Brick brick = new Brick()

        when:
            int numberOfLayers = brick.getSpecialAttribute()

        then:
            numberOfLayers==1
    }

    def 'com.pockerbomb.Brick isActive'() {
        given:
            GenericSpecialCard brick = new Brick()

        expect:
            brick.isActive()
    }
}
