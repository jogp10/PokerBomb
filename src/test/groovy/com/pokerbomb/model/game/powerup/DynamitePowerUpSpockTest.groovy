package com.pokerbomb.model.game.powerup

import com.pokerbomb.model.game.cards.DynamiteCard
import com.pokerbomb.model.game.cards.Rank
import com.pokerbomb.model.game.cards.Suit
import spock.lang.Specification

class DynamitePowerUpSpockTest extends Specification {
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



