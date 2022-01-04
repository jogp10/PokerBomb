import com.pockerbomb.Brick
import spock.lang.Specification

class BrickSpockTest extends Specification{

    def 'com.pockerbomb.Brick removeLayers'() {
        given:
            Brick brick = new Brick()

        when:
            brick.removeLayers()

        then:
            brick.numberOfLayers==0
    }

    def 'com.pockerbomb.Brick constructor'() {
        given:
        Brick brick = new Brick()

        when:
            int numberOfLayers = brick.getNumberOfLayers()

        then:
            numberOfLayers==1
    }
}
