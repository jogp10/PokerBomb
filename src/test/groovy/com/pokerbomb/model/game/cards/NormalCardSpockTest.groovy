package com.pokerbomb.model.game.cards

import spock.lang.Specification

class NormalCardSpockTest extends Specification {
    def "GetCard"() {
        given:
            NormalCard normalCard = new NormalCard(Suit.DIAMOND, Rank.ACE)
        expect:
            normalCard.getCard().is(normalCard)
    }
}
