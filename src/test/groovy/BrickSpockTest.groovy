import spock.lang.Specification

class BrickSpockTest extends Specification{

    def 'Brick removeLayers'() {
        given:
            Brick brick = new Brick()

        when:
            brick.removeLayers()

        then:
            brick.numberOfLayers==0
    }

    def 'Brick constructor'() {
        given:
            Brick brick = new Brick()

        when:
            int numberOfLayers = brick.getNumberOfLayers()

        then:
            numberOfLayers==1
    }
}
