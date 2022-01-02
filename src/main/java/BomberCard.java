public class BomberCard extends Card{
    int numberOfPlaysUntilBomb;

    public BomberCard(Suit suit, Value value) {
        super(suit, value);
        numberOfPlaysUntilBomb = 7;
    }

    public void removePlays() { numberOfPlaysUntilBomb--; }
    public void removePlays(int number_plays) {numberOfPlaysUntilBomb-=number_plays; }

    public int getNumberOfPlaysTillBomb() { return numberOfPlaysUntilBomb; }
}
