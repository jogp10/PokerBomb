package com.pockerbomb.model.game.cards


import spock.lang.Specification

class DynamiteCardSpockTest1 extends Specification{
    DynamiteCard dynamiteCard;
    def setup(){
        dynamiteCard = new DynamiteCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.model.cards.DynamiteCard removePlays'() {
        when:
            dynamiteCard.removeSpecialAttribute(1)

        then:
            dynamiteCard.getSpecialAttribute()==4
    }

    def 'com.pockerbomb.model.cards.DynamiteCard constructor'() {
        when:
            int numberOfPlaysTillDynamite = dynamiteCard.getSpecialAttribute()
        then:
            numberOfPlaysTillDynamite==5
    }

    def 'com.pockerbomb.model.cards.DynamiteCard isActive'() {
        when:
            dynamiteCard.removeSpecialAttribute(5)

        then:
            !dynamiteCard.isActive()

    }

    def 'com.pockerbomb.model.cards.DynamiteCard PlayWithCombo'() {
        expect:
            dynamiteCard.inACombo(1);
    }

    def 'com.pockerbomb.model.cards.DynamiteCard PlayWithoutCombo'() {
        expect:
            !dynamiteCard.notInACombo();
    }


}
