package com.pokerbomb.model.game.cards


import spock.lang.Specification

class FrozenCardSpockTest extends Specification{
    FrozenCard frozenCard;
    def setup(){
        frozenCard = new FrozenCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pokerbomb.model.cards.FrozenCard removeLayers'() {
        when:
            frozenCard.removeSpecialAttribute(1)

        then:
            frozenCard.getSpecialAttribute()==1
    }

    def 'com.pokerbomb.model.cards.FrozenCard removeLayers 2'() {
        when:
            frozenCard.removeSpecialAttribute(2)

        then:
            frozenCard.getSpecialAttribute()==0
    }

    def 'constructor'() {
        when:
            int numberOfLayers = frozenCard.getSpecialAttribute()

        then:
            numberOfLayers==2
    }

    def 'isActive'() {
        when:
            frozenCard.removeSpecialAttribute(2)

        then:
            !frozenCard.isActive()

    }

    def 'PlayWithCombo'() {
        expect:
            !frozenCard.inACombo(1);
    }

    def 'PlayWithoutCombo'() {
        expect:
            !frozenCard.notInACombo();
    }


    def "GetCard"() {
        expect:
            frozenCard.getCard().is(frozenCard)
    }
}
