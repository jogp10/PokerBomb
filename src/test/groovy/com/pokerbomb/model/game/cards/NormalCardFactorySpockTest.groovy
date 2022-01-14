package com.pokerbomb.model.game.cards

import spock.lang.Specification

class NormalCardFactorySpockTest extends Specification {
    def "CreateCard"() {
        given:
        NormalCardFactory normalCardFactory = new NormalCardFactory()
        when:
        NormalCard normalCard  = normalCardFactory.createCard(Suit.DIAMOND, Rank.EIGHT)
        then:
        normalCard.getRank()==Rank.EIGHT
    }
}
