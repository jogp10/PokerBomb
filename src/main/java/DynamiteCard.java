public class DynamiteCard extends Card{
    private int numberOfPlaysUntilDynamite;

    public DynamiteCard(Suit suit, Value value) {
        super(suit, value);
        numberOfPlaysUntilDynamite = 5;
    }

    public void removePlays() { numberOfPlaysUntilDynamite--; }
    public void removePlays(int number_plays) {numberOfPlaysUntilDynamite-=number_plays; }

    public int getNumberOfPlaysTillDynamite() { return numberOfPlaysUntilDynamite; }
}
