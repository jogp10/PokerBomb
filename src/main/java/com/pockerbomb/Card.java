package com.pockerbomb;

public interface Card {
    String toString();

    Rank getRank();

    Suit getSuit();

    int getRankValue();

    int getSuitValue();

    void draw();
}
