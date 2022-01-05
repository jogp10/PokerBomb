package com.pockerbomb.model.game;

import com.pockerbomb.model.game.cards.Card;
import com.pockerbomb.model.game.cards.Rank;

import java.util.ArrayList;

public class Hand {

    public static void sortByRank(ArrayList<Card> hand) {
        int i, j, min_j;

      /* ---------------------------------------------------
         The selection sort algorithm
         --------------------------------------------------- */
        for ( i = 0 ; i < hand.size() ; i++ ) {
         /* ---------------------------------------------------
            Find array element with min. value among
            h[i], h[i+1], ..., h[n-1]
            --------------------------------------------------- */
            min_j = i;   // Assume elem i (h[i]) is the minimum

            for ( j = i+1 ; j < hand.size() ; j++ ) {
                if (hand.get(j).getRankValue() < hand.get(min_j).getRankValue()) {
                    min_j = j;    // We found a smaller rank value, update min_j
                }
            }

         /* ---------------------------------------------------
            Swap a[i] and a[min_j]
            --------------------------------------------------- */
            Card help = hand.get(i);
            hand.set(i, hand.get(min_j));
            hand.set(min_j, help);
        }
    }
    public static void sortBySuit(ArrayList<Card> hand) {
        int i, j, min_j;

      /* ---------------------------------------------------
         The selection sort algorithm
         --------------------------------------------------- */
        for ( i = 0 ; i < hand.size() ; i ++ ) {
         /* ---------------------------------------------------
            Find array element with min. value among
            h[i], h[i+1], ..., h[n-1]
            --------------------------------------------------- */
            min_j = i;   // Assume elem i (h[i]) is the minimum

            for ( j = i + 1 ; j < hand.size() ; j++ ) {
                if (hand.get(j).getSuitValue() < hand.get(min_j).getSuitValue()) {
                    min_j = j;    // We found a smaller suit value, update min_j
                }
            }

         /* ---------------------------------------------------
            Swap a[i] and a[min_j]
            --------------------------------------------------- */
            Card help = hand.get(i);
            hand.set(i, hand.get(min_j));
            hand.set(min_j, help);
        }
    }

    //5 cards of the same suit
    public static boolean isFlush(Deck deck) {
        ArrayList<Card> hand = deck.getDeck();

        if (hand.size() < 5)
            return false;   // Make sure we have 5 cards....

        sortBySuit(hand);      // Sort the cards by the suit values

        return (hand.get(0).getSuitValue() == hand.get(4).getSuitValue());   // All cards has same suit
    }

    //5 cards in sequence from low to high. An Ace can be high or low
    public static boolean isStraight(Deck deck) {
        ArrayList<Card> hand = deck.getDeck();
        int i, testRank;

        if (hand.size() < 5 )
            return false;

        sortByRank(hand);      // Sort the poker hand by the rank of each card

      /* ===========================
         Check if hand has an Ace
         =========================== */
        if (hand.get(4).getRank() == Rank.ACE) {
         /* =================================
            Check straight using an Ace
            ================================= */
            boolean a = hand.get(0).getRank() == Rank.TWO && hand.get(1).getRank() == Rank.THREE && hand.get(2).getRank() == Rank.FOUR && hand.get(3).getRank() == Rank.FIVE;
            boolean b = hand.get(0).getRank() == Rank.TEN && hand.get(1).getRank() == Rank.JACK && hand.get(2).getRank() == Rank.QUEEN && hand.get(3).getRank() == Rank.KING;

            return a || b;
        } else {
         /* ===========================================
            General case: check for increasing values
            =========================================== */
            testRank = hand.get(0).getRankValue() + 1;

            for ( i = 1; i < 5; i++ ) {
                if (hand.get(i).getRankValue() != testRank)
                    return false;        // Straight failed...
                testRank++;   // Next card in hand
            }
            return true;        // Straight found
        }
    }

    //A continuous run of 5 cards, all of the same suit. An Ace will be low in a straight flush
    public static boolean isStraightFlush(Deck deck) {
        return isFlush(deck) && isStraight(deck);
    }

    //A continuous run of 5 cards from 10 to Ace, all of the same suit. The highest score hand!
    public static boolean isRoyalFlush(Deck deck) {
        return isFlush(deck) && isStraight(deck) && deck.getDeck().get(4).getRank() == Rank.ACE;
    }

    //4 cards of the same value
    public static boolean isFourOfAKind(Deck deck) {
        ArrayList<Card> hand = deck.getDeck();
        boolean a1, a2 = false;

        if (hand.size() < 4)
            return false;

        sortByRank(hand);         // Sort by rank first

      /* ------------------------------------------------------
         Check for: 4 cards of the same rank + higher ranked unmatched card
	 ------------------------------------------------------- */
        a1 = hand.get(0).getRank() == hand.get(1).getRank() &&
             hand.get(1).getRank() == hand.get(2).getRank() &&
             hand.get(2).getRank() == hand.get(3).getRank();


      /* ------------------------------------------------------
         Check for: lower ranked unmatched card + 4 cards of the same rank
	 ------------------------------------------------------- */
        if (hand.size() > 4)
            a2 = hand.get(1).getRank() == hand.get(2).getRank() &&
                 hand.get(2).getRank() == hand.get(3).getRank() &&
                 hand.get(3).getRank() == hand.get(4).getRank();

        return a1 || a2;
    }

    //2 cards of one value and 3 cards of another value
    public static boolean isFullHouse(Deck deck) {
        ArrayList<Card> hand = deck.getDeck();
        boolean a1, a2;

        if (hand.size() < 5)
            return false;

        sortByRank(hand);      // Sort by rank first

      /* ------------------------------------------------------
         Check for: x x x y y
	 ------------------------------------------------------- */
        a1 = hand.get(0).getRank() == hand.get(1).getRank() &&
             hand.get(1).getRank() == hand.get(2).getRank() &&
             hand.get(3).getRank() == hand.get(4).getRank();

      /* ------------------------------------------------------
         Check for: x x y y y
	 ------------------------------------------------------- */
        a2 = hand.get(0).getRank() == hand.get(1).getRank() &&
             hand.get(2).getRank() == hand.get(3).getRank() &&
             hand.get(3).getRank() == hand.get(4).getRank();

        return a1 || a2 ;
    }

    //3 cards of the same value
    public static boolean isThreeOfAKind(Deck deck) {
        ArrayList<Card> hand = deck.getDeck();
        boolean a1, a2 = false, a3 = false;

        if (hand.size() < 3)
            return false;

        if (isFourOfAKind(deck) || isFullHouse(deck))
            return false;        // The hand is not 3 of a kind (but better)

        sortByRank(hand);

      /* ------------------------------------------------------
         Check for: x x x a b
	 ------------------------------------------------------- */
        a1 = hand.get(0).getRank() == hand.get(1).getRank() &&
             hand.get(1).getRank() == hand.get(2).getRank();

      /* ------------------------------------------------------
         Check for: a x x x b
	 ------------------------------------------------------- */
        if (hand.size() > 3)
            a2 = hand.get(1).getRank() == hand.get(2).getRank() &&
                 hand.get(2).getRank() == hand.get(3).getRank();

      /* ------------------------------------------------------
         Check for: a b x x x
	 ------------------------------------------------------- */
        if (hand.size() > 4)
            a3 = hand.get(2).getRank() == hand.get(3).getRank() &&
                 hand.get(3).getRank() == hand.get(4).getRank();

        return a1 || a2 || a3;
    }

    //2 cards of one value and 2 cards of another value
    public static boolean isTwoPairs(Deck deck) {
        ArrayList<Card> hand = deck.getDeck();
        boolean a1, a2 = false, a3 = false;

        if (hand.size() < 4)
            return false;

        if (isFourOfAKind(deck) || isFullHouse(deck) || isThreeOfAKind(deck))
            return false;        // The hand is not 2 pairs (but better)

        sortByRank(hand);

      /* --------------------------------
         Checking: a a  b b x
	 -------------------------------- */
        a1 = hand.get(0).getRank() == hand.get(1).getRank() &&
             hand.get(2).getRank() == hand.get(3).getRank();

      /* ------------------------------
         Checking: a a x  b b
	 ------------------------------ */
        if (hand.size() > 4) {
            a2 = hand.get(0).getRank() == hand.get(1).getRank() &&
                 hand.get(3).getRank() == hand.get(4).getRank();

      /* ------------------------------
         Checking: x a a  b b
	 ------------------------------ */
            a3 = hand.get(1).getRank() == hand.get(2).getRank() &&
                 hand.get(3).getRank() == hand.get(4).getRank();
        }

        return a1 || a2 || a3;
    }

    //2 cards of the same value
    public static boolean isPair(Deck deck) {
        ArrayList<Card> hand = deck.getDeck();
        boolean a1, a2 = false, a3 = false, a4 = false;

        if (hand.size() < 2)
            return false;

        if (isFourOfAKind(deck) || isFullHouse(deck) || isThreeOfAKind(deck) || isTwoPairs(deck))
            return false;        // The hand is not one pair (but better)

        sortByRank(hand);

      /* --------------------------------
         Checking: a a x y z
	 -------------------------------- */
        a1 = hand.get(0).getRank() == hand.get(1).getRank();

      /* --------------------------------
         Checking: x a a y z
	 -------------------------------- */
        if (hand.size() > 2)
            a2 = hand.get(1).getRank() == hand.get(2).getRank();

      /* --------------------------------
         Checking: x y a a z
	 -------------------------------- */
        if (hand.size() > 3)
            a3 = hand.get(2).getRank() == hand.get(3).getRank();

      /* --------------------------------
         Checking: x y z a a
	 -------------------------------- */
        if (hand.size() > 4)
            a4 = hand.get(3).getRank() == hand.get(4).getRank();

        return a1 || a2 || a3 || a4;
    }

    public static String handRanking(Deck deck) {
        String hand;

        if (isRoyalFlush(deck)) {
            hand = "Royal Flush";
        } else if (isStraightFlush(deck)) {
            hand = "Straight Flush";
        } else if (isFourOfAKind(deck)) {
            hand = "Four of a Kind";
        } else if (isFullHouse(deck)) {
            hand = "Full House";
        } else if (isFlush(deck)) {
            hand = "Flush";
        } else if (isStraight(deck)) {
            hand = "Straight";
        } else if (isThreeOfAKind(deck)) {
            hand = "Three of a Kind";
        } else if (isTwoPairs(deck)) {
            hand = "Two Pairs";
        } else if (isPair(deck)) {
            hand = "Pair";
        } else {
            hand = "None";
        }

        return hand;
    }
}
