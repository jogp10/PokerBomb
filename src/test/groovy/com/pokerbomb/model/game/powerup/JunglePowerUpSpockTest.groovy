package com.pokerbomb.model.game.powerup

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.DynamiteCard
import com.pokerbomb.model.game.cards.JungleCard
import com.pokerbomb.model.game.cards.NormalCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class JunglePowerUpSpockTest extends Specification{
    JunglePowerUp junglePowerUp;

    def setup(){
        junglePowerUp = JunglePowerUp.getInstance()
        junglePowerUp.addPowerUp()
    }
/*
    def 'com.pokerbomb.models.powerup.JunglePowerUp constructor'() {
        expect:
            junglePowerUp.getNumberOfPowerUp()==0;
    }

 */

    def 'com.pokerbomb.models.powerup.JunglePowerUp removeLayer'() {
        given:
            JungleCard jungleCard = new JungleCard(Suit.DIAMOND, Rank.QUEEN)
            jungleCard.notInACombo()
            jungleCard.notInACombo()
            jungleCard.notInACombo()
            jungleCard.notInACombo()
            jungleCard.notInACombo()

        when:
            jungleCard = junglePowerUp.removeLayerJungleCard(jungleCard)

        then:
            !jungleCard.isActive()
    }
/*
    def 'com.pokerbomb.models.powerup.JunglePowerUp buy RemoveLayers'() {
        when:
            junglePowerUp.addPowerUp()
        then:
            junglePowerUp.getNumberOfPowerUp()==1
    }

 */

    def 'com.pokerbomb.models.powerup.JunglePowerUp getInstance'() {
        expect:
        JunglePowerUp.getInstance().is(junglePowerUp)
    }

    def 'com.pokerbomb.models.powerup.JunglePowerUp AddPlays2'() {
        given:
        Card c1 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        Card c5 = new JungleCard(Suit.CLUB, Rank.EIGHT)
        c5.notInACombo()
        c5.notInACombo()
        c5.notInACombo()
        c5.notInACombo()
        ArrayList<Card> cards = new ArrayList<>()
        cards.add(c1)
        cards.add(c5)

        when:
        junglePowerUp.removeLayerJungleCard(cards)
        then:
        cards.get(1).getSpecialAttribute()==0
    }
}


