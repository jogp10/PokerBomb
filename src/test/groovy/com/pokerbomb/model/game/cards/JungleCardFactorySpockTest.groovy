package com.pokerbomb.model.game.cards

import spock.lang.Specification

class JungleCardFactorySpockTest extends Specification {
    def "CreateCard"() {
        given:
            JungleCardFactory jungleCardFactory = new JungleCardFactory()
        when:
            JungleCard jungleCard = jungleCardFactory.createCard(Suit.DIAMOND, Rank.EIGHT)
        then:
            jungleCard.getRank()==Rank.EIGHT
    }
}
