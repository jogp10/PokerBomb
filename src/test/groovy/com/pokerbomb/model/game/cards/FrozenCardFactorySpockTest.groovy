package com.pokerbomb.model.game.cards

import spock.lang.Specification

class FrozenCardFactorySpockTest extends Specification {
    def "CreateCard"() {
        given:
        FrozenCardFactory frozenCardFactory = new FrozenCardFactory()
        when:
        FrozenCard frozenCard = frozenCardFactory.createCard(Suit.DIAMOND, Rank.EIGHT)
        then:
        frozenCard.getRank()==Rank.EIGHT
    }
}
