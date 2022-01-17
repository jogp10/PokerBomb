package com.pokerbomb.model.game

import com.pokerbomb.model.game.goals.CanYouDigItGoal
import com.pokerbomb.model.game.goals.CardCollectorGoal
import com.pokerbomb.model.game.goals.DiamondMinerGoal
import com.pokerbomb.model.game.goals.FlushedOutGoal
import com.pokerbomb.model.game.goals.GiveUsAHandGoal
import com.pokerbomb.model.game.goals.Goal
import com.pokerbomb.model.game.goals.HeartbreakerGoal
import com.pokerbomb.model.game.goals.InDaClubGoal
import com.pokerbomb.model.game.goals.RunRabbitRunGoal
import com.pokerbomb.model.game.goals.SeeingDoubleGoal
import com.pokerbomb.model.game.goals.SquadsOfQuadsGoal
import com.pokerbomb.model.game.goals.TheDoubleDoubleGoal
import com.pokerbomb.model.game.goals.TheHouseIsFullGoal
import com.pokerbomb.model.game.goals.ThreesCompanyGoal
import com.pokerbomb.model.game.goals.Type
import spock.lang.Specification

class ReadLevelsSpockTest extends Specification {
    def "Read Levels' Goals"() {
        given:
        ArrayList<Level> levels = new ArrayList<>()

        ArrayList<Goal> goals1 = new ArrayList<>()
        goals1.add(new InDaClubGoal(Type.CLUBS, 15))
        goals1.add(new GiveUsAHandGoal(Type.HANDS, 15))
        Level level1 = new Level(1, goals1)
        levels.add(level1)

        ArrayList<Goal> goals2 = new ArrayList<>()
        goals2.add(new CardCollectorGoal(Type.CARDS, 20))
        Level level2 = new Level(2, goals2)
        levels.add(level2)

        ArrayList<Goal> goals3 = new ArrayList<>()
        goals3.add(new SeeingDoubleGoal(Type.PAIR, 3))
        goals3.add(new TheDoubleDoubleGoal(Type.TWO_PAIRS, 2))
        goals3.add(new ThreesCompanyGoal(Type.THREE_OF_A_KIND, 1))
        Level level3 = new Level(3, goals3)
        levels.add(level3)

        ArrayList<Goal> goals4 = new ArrayList<>()
        goals4.add(new SeeingDoubleGoal(Type.PAIR, 8))
        goals4.add(new TheDoubleDoubleGoal(Type.TWO_PAIRS, 4))
        Level level4 = new Level(4, goals4)
        levels.add(level4)

        ArrayList<Goal> goals5 = new ArrayList<>()
        goals5.add(new TheHouseIsFullGoal(Type.FULL_HOUSE, 2))
        Level level5 = new Level(5, goals5)
        levels.add(level5)

        ArrayList<Goal> goals6 = new ArrayList<>()
        goals6.add(new DiamondMinerGoal(Type.DIAMONDS, 12))
        goals6.add(new HeartbreakerGoal(Type.HEARTS, 12))
        goals6.add(new CanYouDigItGoal(Type.SPADES, 12))
        Level level6 = new Level(6, goals6)
        levels.add(level6)

        ArrayList<Goal> goals7 = new ArrayList<>()
        goals7.add(new SquadsOfQuadsGoal(Type.FOUR_OF_A_KIND, 1))
        Level level7 = new Level(7, goals7)
        levels.add(level7)

        ArrayList<Goal> goals8 = new ArrayList<>()
        goals8.add(new HeartbreakerGoal(Type.HEARTS, 12))
        Level level8 = new Level(8, goals8)
        levels.add(level8)

        ArrayList<Goal> goals9 = new ArrayList<>()
        goals9.add(new ThreesCompanyGoal(Type.THREE_OF_A_KIND, 1))
        goals9.add(new FlushedOutGoal(Type.FLUSH, 2))
        Level level9 = new Level(9, goals9)
        levels.add(level9)

        ArrayList<Goal> goals10 = new ArrayList<>()
        goals10.add(new RunRabbitRunGoal(Type.STRAIGHT, 1))
        goals10.add(new InDaClubGoal(Type.CLUBS, 10))
        Level level10 = new Level(10, goals10)
        levels.add(level10)

        when:
        ArrayList<Level> levelsFile = ReadLevels.readLevels("src/main/resources/Levels.txt")

        then:
        levels.equals(levelsFile)
    }


}
