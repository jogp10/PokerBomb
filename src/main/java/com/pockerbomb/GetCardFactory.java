package com.pockerbomb;

public class GetCardFactory {
    public Card getCard(Suit suit, Rank rank, String cardType){
        if(cardType==null){
            return new Card(suit, rank);
        }
        if(cardType.equalsIgnoreCase("FROZEN")){
            return new FrozenCard(suit, rank);
        }
        if(cardType.equalsIgnoreCase("DYNAMITE")){
            return new DynamiteCard(suit, rank);
        }
        if(cardType.equalsIgnoreCase("JUNGLE")){
            return new JungleCard(suit, rank);
        }
        return new Card(suit, rank);
    }
}
