package com.pokerbomb.model.game.powerup

import com.pokerbomb.model.game.cards.FrozenCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class PowerUpSpockTest extends Specification{
    UnfreezeCard unfreezeCard;
    def setup(){
        unfreezeCard = new UnfreezeCard();
    }

    def 'com.pokerbomb.models.powerup.UnfreezeCard constructor'() {
        expect:
            unfreezeCard.getNumberOfPowerups()==0
    }

    def 'com.pokerbomb.models.powerup.UnfreezeCard unfreezecadrd'() {
        given:
            FrozenCard frozenCard = new FrozenCard(Suit.DIAMOND, Rank.QUEEN)

        when:
            unfreezeCard.Unfreeze(frozenCard)

        then:
            frozenCard.getSpecialAttribute()==0;
            !frozenCard.isActive()
    }

    def 'com.pokerbomb.models.powerup.UnfreezeCard buy Unfreezers'() {
        when:
            unfreezeCard.addPowerUp();

        then:
            unfreezeCard.getNumberOfPowerups()==1
    }

    def 'com.pokerbomb.models.powerup.StopPlayDynamiteCard'()
}
