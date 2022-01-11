package com.pokerbomb.model.game.cards


import spock.lang.Specification

class FrozenCardSpockTest1 extends Specification{
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

    def 'com.pokerbomb.model.cards.FrozenCard constructor'() {
        when:
            int numberOfLayers = frozenCard.getSpecialAttribute()

        then:
            numberOfLayers==2
    }

    def 'com.pokerbomb.model.cards.FrozenCard isActive'() {
        when:
            frozenCard.removeSpecialAttribute(2)

        then:
            !frozenCard.isActive()

    }

    def 'com.pokerbomb.model.cards.FrozenCard PlayWithCombo'() {
        expect:
            !frozenCard.inACombo(1);
    }

    def 'com.pokerbomb.model.cards.FrozenCard PlayWithoutCombo'() {
        expect:
            !frozenCard.notInACombo();
    }
}
