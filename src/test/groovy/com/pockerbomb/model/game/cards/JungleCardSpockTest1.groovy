package com.pockerbomb.model.game.cards


import spock.lang.Specification

class JungleCardSpockTest1 extends Specification{
    JungleCard jungleCard;
    def setup(){
        jungleCard = new JungleCard(Suit.CLUB, Rank.ACE)
    }

    def 'com.pockerbomb.model.cards.JungleCard removePlays'() {
        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            jungleCard.getSpecialAttribute()==0
    }

    def 'com.pockerbomb.model.cards.JungleCard constructor'() {
        when:
            int numberSpecialAttribute = jungleCard.getSpecialAttribute()

        then:
            numberSpecialAttribute==1
    }

    def 'com.pockerbomb.model.cards.JungleCard isActive'() {
        when:
            jungleCard.removeSpecialAttribute(1)

        then:
            !jungleCard.isActive()
    }

    def 'com.pockerbomb.model.cards.JungleCard PlayWithCombo'() {
        expect:
            jungleCard.inACombo(4);
    }

    def 'com.pockerbomb.model.cards.JungleCard PlayWithoutCombo'() {
        expect:
            !jungleCard.notInACombo();
    }
}
