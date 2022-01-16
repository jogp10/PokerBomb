package com.pokerbomb.model.game.powerup

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.DynamiteCard
import com.pokerbomb.model.game.cards.FrozenCard
import com.pokerbomb.model.game.cards.NormalCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class FrozenPowerUpSpockTest extends Specification{
    FrozenPowerUp frozenPowerUp;
    def setup(){
        frozenPowerUp = FrozenPowerUp.getInstance();
    }
    /*
    def 'com.pokerbomb.models.powerup.FrozenPowerUp constructor'() {
        expect:
            frozenPowerUp.getNumberOfPowerUp()==0
    }

     */

    def 'com.pokerbomb.models.powerup.FrozenPowerUp unfreezecard'() {
        given:
            FrozenCard frozenCard = new FrozenCard(Suit.DIAMOND, Rank.QUEEN)

        when:
            frozenPowerUp.Unfreeze(frozenCard)

        then:
            frozenCard.getSpecialAttribute()==0;
            !frozenCard.isActive()
    }
/*
    def 'com.pokerbomb.models.powerup.FrozenPowerUp buy Unfreezers'() {
        when:
            frozenPowerUp.addPowerUp();

        then:
            frozenPowerUp.getNumberOfPowerUp()==1
    }

 */

    def 'com.pokerbomb.models.powerup.FrozenPowerUp getInstance'() {
        expect:
        FrozenPowerUp.getInstance().is(frozenPowerUp)
    }

    def 'com.pokerbomb.models.powerup.FrozenPowerUp AddPlays2'() {
        given:
        Card c1 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        Card c2 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        Card c3 = new FrozenCard(Suit.CLUB, Rank.EIGHT)
        Card c4 = new NormalCard(Suit.CLUB, Rank.EIGHT)
        Card c5 = new FrozenCard(Suit.CLUB, Rank.EIGHT)
        ArrayList<Card> cards = new ArrayList<>()
        cards.add(c1)
        cards.add(c2)
        cards.add(c3)
        cards.add(c4)
        cards.add(c5)

        when:
        frozenPowerUp.Unfreeze(cards)
        then:
        cards.get(4).getSpecialAttribute()==2
    }

}




