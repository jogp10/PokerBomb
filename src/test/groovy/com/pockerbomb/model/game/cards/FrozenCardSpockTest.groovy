package com.pockerbomb.model.game.cards

import com.pockerbomb.model.game.cards.FrozenCard
import com.pockerbomb.model.game.cards.Rank
import com.pockerbomb.model.game.cards.Suit
import spock.lang.Specification

class FrozenCardSpockTest extends Specification{
    FrozenCard frozenCard;
    def setup(){
        frozenCard = new FrozenCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.model.cards.FrozenCard removeLayers'() {
        when:
            frozenCard.removeSpecialAttribute(1)

        then:
            frozenCard.getSpecialAttribute()==1
    }

    def 'com.pockerbomb.model.cards.FrozenCard removeLayers 2'() {
        when:
            frozenCard.removeSpecialAttribute(2)

        then:
            frozenCard.getSpecialAttribute()==0
    }

    def 'com.pockerbomb.model.cards.FrozenCard constructor'() {
        when:
            int numberOfLayers = frozenCard.getSpecialAttribute()

        then:
            numberOfLayers==2
    }

    def 'com.pockerbomb.model.cards.FrozenCard isActive'() {
        when:
            frozenCard.removeSpecialAttribute(2)

        then:
            !frozenCard.isActive()

    }

    def 'com.pockerbomb.model.cards.FrozenCard PlayWithCombo'() {
        expect:
            !frozenCard.inACombo(1);
    }

    def 'com.pockerbomb.model.cards.FrozenCard PlayWithoutCombo'() {
        expect:
            !frozenCard.notInACombo();
    }
}
