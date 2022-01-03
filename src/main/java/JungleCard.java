public class JungleCard extends Card{
    private int numberOfLayers;
    private int numberOfPlaysToAddLayer;

    public JungleCard(Suit suit, Rank rank) {
        super(suit, rank);
        numberOfLayers = 3;
        numberOfPlaysToAddLayer = 0;
    }

    public void removeLayers(){
        removeLayers(1);
    }
    public void removeLayers(int number_layers) {
        numberOfLayers-=number_layers;
        numberOfPlaysToAddLayer=0;
    }

    public void addNumberOfPlaysWithoutCombo() {
        // Add another layer if card is not in a combo after 4 plays
        numberOfPlaysToAddLayer++;

        if(numberOfPlaysToAddLayer>3 && numberOfLayers!=3){
            removeLayers(-1);
        }
    }

    public int getNumberOfLayers(){ return numberOfLayers; }
}
