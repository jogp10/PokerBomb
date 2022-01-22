package com.pokerbomb.model.game.powerup

import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.model.game.cards.DynamiteCard
import com.pokerbomb.model.game.cards.NormalCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class DynamitePowerUpSpockTest extends Specification {
    DynamitePowerUp dynamitePowerUp;

    def setup(){
        dynamitePowerUp = DynamitePowerUp.getInstance()
        dynamitePowerUp.addPowerUp()
    }

/*
    def 'com.pokerbomb.models.powerup.DynamitePowerUp constructor'() {
        expect:
            dynamitePowerUp.getNumberOfPowerUp()==0;
    }

 */

    def 'com.pokerbomb.models.powerup.DynamitePowerUp addPlay'() {
        given:
            DynamiteCard dynamiteCard = new DynamiteCard(Suit.DIAMOND, Rank.QUEEN)

        when:
            int dynamiteSpecialAttribute = dynamiteCard.getSpecialAttribute()
            boolean confirm =  dynamitePowerUp.usePowerUp(dynamiteCard, 2)

        then:
            confirm
            dynamiteSpecialAttribute+2==dynamiteCard.getSpecialAttribute()
    }

/*
    def 'com.pokerbomb.models.powerup.DynamitePowerUp buy AddPlays'() {
        when:
            dynamitePowerUp.addPowerUp()
        then:
            dynamitePowerUp.getNumberOfPowerUp()==1
    }
 */

    def 'com.pokerbomb.models.powerup.DynamitePowerUp getInstance'() {
        expect:
            DynamitePowerUp.getInstance().is(dynamitePowerUp)
    }

    def 'com.pokerbomb.models.powerup.DynamitePowerUp AddPlays2'() {
        given:
            Card c1 = new NormalCard(Suit.CLUB, Rank.EIGHT)
            Card c2 = new NormalCard(Suit.CLUB, Rank.EIGHT)
            Card c3 = new NormalCard(Suit.CLUB, Rank.EIGHT)
            Card c4 = new NormalCard(Suit.CLUB, Rank.EIGHT)
            Card c5 = new DynamiteCard(Suit.CLUB, Rank.EIGHT)
            ArrayList<Card> cards = new ArrayList<>()
            cards.add(c1)
            cards.add(c2)
            cards.add(c3)
            cards.add(c4)
            cards.add(c5)

        when:
        dynamitePowerUp.usePowerUp(cards)
        then:
        cards.get(4).getSpecialAttribute()==8
    }


}



