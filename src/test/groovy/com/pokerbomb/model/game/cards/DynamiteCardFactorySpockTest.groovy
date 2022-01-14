package com.pokerbomb.model.game.cards

import spock.lang.Specification

class DynamiteCardFactorySpockTest extends Specification {
    def "CreateCard"() {
        given:
            DynamiteCardFactory dynamiteCardFactory = new DynamiteCardFactory()
        when:
            DynamiteCard dynamiteCard = dynamiteCardFactory.createCard(Suit.DIAMOND, Rank.EIGHT)
        then:
            dynamiteCard.getRank()==Rank.EIGHT
    }
}
