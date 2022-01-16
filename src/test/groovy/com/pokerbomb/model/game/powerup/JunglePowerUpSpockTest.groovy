package com.pokerbomb.model.game.powerup

import com.pokerbomb.model.game.cards.JungleCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

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
            jungleCard.notInACombo()
            jungleCard.notInACombo()

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


