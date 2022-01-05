package com.pockerbomb.model

import com.pockerbomb.model.DynamiteCard
import com.pockerbomb.model.Rank
import com.pockerbomb.model.Suit
import spock.lang.Specification

class DynamiteCardSpockTest extends Specification{
    DynamiteCard dynamiteCard;
    def setup(){
        dynamiteCard = new DynamiteCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.model.DynamiteCard removePlays'() {
        when:
            dynamiteCard.removeSpecialAttribute(1)

        then:
            dynamiteCard.getSpecialAttribute()==4
    }

    def 'com.pockerbomb.model.DynamiteCard constructor'() {
        when:
            int numberOfPlaysTillDynamite = dynamiteCard.getSpecialAttribute()
        then:
            numberOfPlaysTillDynamite==5
    }

    def 'com.pockerbomb.model.DynamiteCard isActive'() {
        when:
            dynamiteCard.removeSpecialAttribute(5)

        then:
            !dynamiteCard.isActive()

    }

    def 'com.pockerbomb.model.DynamiteCard PlayWithCombo'() {
        expect:
            dynamiteCard.PlayWithCombo(1);
    }

    def 'com.pockerbomb.model.DynamiteCard PlayWithoutCombo'() {
        expect:
            !dynamiteCard.PlayWithoutCombo();
    }


}
