package com.pokerbomb.model.game.powerup


import com.pokerbomb.model.game.cards.FrozenCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class FrozenPowerUpSpockTest extends Specification{
    FrozenPowerUp frozenPowerUp;
    def setup(){
        frozenPowerUp = new FrozenPowerUp();
    }

    def 'com.pokerbomb.models.powerup.FrozenPowerUp constructor'() {
        expect:
            frozenPowerUp.getNumberOfPowerUp()==0
    }

    def 'com.pokerbomb.models.powerup.FrozenPowerUp unfreezecard'() {
        given:
            FrozenCard frozenCard = new FrozenCard(Suit.DIAMOND, Rank.QUEEN)

        when:
            frozenPowerUp.Unfreeze(frozenCard)

        then:
            frozenCard.getSpecialAttribute()==0;
            !frozenCard.isActive()
    }

    def 'com.pokerbomb.models.powerup.FrozenPowerUp buy Unfreezers'() {
        when:
            frozenPowerUp.addPowerUp();

        then:
            frozenPowerUp.getNumberOfPowerUp()==1
    }

}




