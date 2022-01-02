public class Brick {
    private int numberOfLayers;

    public Brick() {
        numberOfLayers = 1;
    }

    public void removeLayers() { numberOfLayers--; }

    public int getNumberOfLayers() { return numberOfLayers; }
}
