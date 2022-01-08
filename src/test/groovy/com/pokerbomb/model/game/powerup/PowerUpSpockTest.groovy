package com.pokerbomb.model.game.powerup

import com.pokerbomb.model.game.cards.DynamiteCard
import com.pokerbomb.model.game.cards.FrozenCard
import com.pokerbomb.model.game.cards.JungleCard
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

class DynamitePowerUpSpockTest extends Specification{
    DynamitePowerUp dynamitePowerUp;

    def setup(){
        dynamitePowerUp = new DynamitePowerUp();
    }

    def 'com.pokerbomb.models.powerup.DynamitePowerUp constructor'() {
        expect:
            dynamitePowerUp.getNumberOfPowerUp()==0;
    }

    def 'com.pokerbomb.models.powerup.DynamitePowerUp addPlay'() {
        given:
            DynamiteCard dynamiteCard = new DynamiteCard(Suit.DIAMOND, Rank.QUEEN)

        when:
            int dynamiteSpecialAttribute = dynamiteCard.getSpecialAttribute()
            boolean confirm =  dynamitePowerUp.addPlayToDynamiteCard(dynamiteCard, 2)

        then:
            confirm
            dynamiteSpecialAttribute+2==dynamiteCard.getSpecialAttribute()
    }

    def 'com.pokerbomb.models.powerup.DynamitePowerUp buy AddPlays'() {
        when:
            dynamitePowerUp.addPowerUp()
        then:
            dynamitePowerUp.getNumberOfPowerUp()==1
    }
}

class JunglePowerUpSpockTest extends Specification{
    JunglePowerUp junglePowerUp;

    def setup(){
        junglePowerUp = new JunglePowerUp();
    }

    def 'com.pokerbomb.models.powerup.JunglePowerUp constructor'() {
        expect:
            junglePowerUp.getNumberOfPowerUp()==0;
    }

    def 'com.pokerbomb.models.powerup.JunglePowerUp removeLayer'() {
        given:
            JungleCard jungleCard = new JungleCard(Suit.DIAMOND, Rank.QUEEN)
            jungleCard.notInACombo()
            jungleCard.notInACombo()
            jungleCard.notInACombo()

        expect:
            jungleCard.getSpecialAttribute()==1

        when:
            boolean confirm =  junglePowerUp.removeLayerJungleCard(jungleCard)

        then:
            confirm
            !jungleCard.isActive()
    }

    def 'com.pokerbomb.models.powerup.JunglePowerUp buy RemoveLayers'() {
        when:
            junglePowerUp.addPowerUp()
        then:
            junglePowerUp.getNumberOfPowerUp()==1
    }
}


