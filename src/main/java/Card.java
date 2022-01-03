public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return this.suit.toString() + "-" + this.rank.toString();
    }

    public Rank getRank() {
        return this.rank;
    }
    public Suit getSuit() {
        return this.suit;
    }

    public int getRankValue() {
        int value;
        switch (rank) {
            case TWO:
                value = 2;
                break;
            case THREE:
                value = 3;
                break;
            case FOUR:
                value = 4;
                break;
            case FIVE:
                value = 5;
                break;
            case SIX:
                value = 6;
                break;
            case SEVEN:
                value = 7;
                break;
            case EIGHT:
                value = 8;
                break;
            case NINE:
                value = 9;
                break;
            case TEN:
                value = 10;
                break;
            case JACK:
                value = 11;
                break;
            case QUEEN:
                value = 12;
                break;
            case KING:
                value = 13;
                break;
            case ACE:
                value = 14;
                break;
            default:
                value = 0;
        }
        return value;
    }
    public int getSuitValue() {
        int value;
        switch (suit) {
            case HEART:
                value = 1;
                break;
            case DIAMOND:
                value = 2;
                break;
            case SPADE:
                value = 3;
                break;
            case CLUB:
                value = 4;
                break;
            default:
                value = 0;
        }
        return value;
    }
}
