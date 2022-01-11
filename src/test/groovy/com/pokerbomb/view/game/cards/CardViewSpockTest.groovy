package com.pokerbomb.view.game.cards

import com.googlecode.lanterna.graphics.TextGraphics
import com.pokerbomb.model.game.cards.Card
import com.pokerbomb.view.ViewTest

class CardViewSpockTest extends ViewTest<Card>{
    def 'com.pokerbomb.view.game.cards Card View'(){
        given:
            Card card = Mockito.mock(Card.class)
            TextGraphics graphics = Mockito.mock(TextGraphics.class)
            CardView cardView = new CardView(card, graphics)

        when:
            cardView.draw(0, 0)

        then:
            verify(graphics, Mockito.times(1)).draw()
    }
}
