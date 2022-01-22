package com.pokerbomb.model.game.cards


import spock.lang.Specification

class JungleCardSpockTest extends Specification{
    JungleCard jungleCard;
    def setup(){
        jungleCard = new JungleCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pokerbomb.model.cards.JungleCard removePlays'() {
        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            jungleCard.getSpecialAttribute()==0
    }

    def 'com.pokerbomb.model.cards.JungleCard constructor'() {
        when:
            int numberSpecialAttribute = jungleCard.getSpecialAttribute()

        then:
            numberSpecialAttribute==1
    }

    def 'com.pokerbomb.model.cards.JungleCard isActive'() {
        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            !jungleCard.isActive()
    }

    def 'com.pokerbomb.model.cards.JungleCard PlayWithCombo'() {
        expect:
            jungleCard.inACombo(10);
    }

    def 'com.pokerbomb.model.cards.JungleCard PlayWithoutCombo'() {
        expect:
            !jungleCard.notInACombo();
    }

    def "GetCard"() {
        expect:
            jungleCard.getCard().is(jungleCard)
    }
}
