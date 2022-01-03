public class Brick {
    private int numberOfLayers;

    public Brick() {
        numberOfLayers = 1;
    }

    public void removeLayers() { removeLayers(1); }
    public void removeLayers(int number_layers) { numberOfLayers-=number_layers; }

    public int getNumberOfLayers() { return numberOfLayers; }
}
