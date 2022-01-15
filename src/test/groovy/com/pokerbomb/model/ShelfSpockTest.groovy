package com.pokerbomb.model

import com.pokerbomb.model.menu.Menu
import spock.lang.Specification

class ShelfSpockTest extends Specification {

    Shelf shelf;

    def setup() {
        shelf = new Shelf(4,5);
    }

    def "GetHeight"() {
        expect:
        shelf.getHeight() == 4
    }

    def "GetWidth"() {
        expect:
        shelf.getWidth() == 5
    }
}
