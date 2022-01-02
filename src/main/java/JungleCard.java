public class JungleCard extends Card{
    private int numberOfLayers;

    public JungleCard(Suit suit, Rank rank) {
        super(suit, rank);
        numberOfLayers = 3;
    }

    public void removeLayers(){
        numberOfLayers--;
    }
    public void removeLayers(int number_layers) {numberOfLayers-=number_layers; }

    public int getNumberOfLayers(){ return numberOfLayers; }
}
