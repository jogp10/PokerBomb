package com.pokerbomb.model.game

import com.pokerbomb.model.game.goals.CardCollectorGoal
import com.pokerbomb.model.game.goals.GiveUsAHandGoal
import com.pokerbomb.model.game.goals.Goal
import com.pokerbomb.model.game.goals.InDaClubGoal
import com.pokerbomb.model.game.goals.SeeingDoubleGoal
import com.pokerbomb.model.game.goals.TheDoubleDoubleGoal
import com.pokerbomb.model.game.goals.TheHouseIsFullGoal
import com.pokerbomb.model.game.goals.ThreesCompanyGoal
import com.pokerbomb.model.game.goals.Type
import spock.lang.Specification

class ReadLevelsSpockTest extends Specification {
    def 'Read Levels'() {
        given:
        ArrayList<Level> levels = new ArrayList<>()

        ArrayList<Goal> goals1 = new ArrayList<>()
        goals1.add(new InDaClubGoal(Type.CLUBS, 15))
        goals1.add(new GiveUsAHandGoal(Type.HANDS, 15))
        Level level1 = new Level(11, goals1)
        levels.add(level1)

        ArrayList<Goal> goals2 = new ArrayList<>()
        goals2.add(new CardCollectorGoal(Type.CARDS, 20))
        Level level2 = new Level(12, goals2)
        levels.add(level2)

        ArrayList<Goal> goals3 = new ArrayList<>()
        goals3.add(new SeeingDoubleGoal(Type.PAIR, 3))
        goals3.add(new TheDoubleDoubleGoal(Type.TWO_PAIRS, 2))
        goals3.add(new ThreesCompanyGoal(Type.THREE_OF_A_KIND, 1))
        Level level3 = new Level(13, goals3)
        levels.add(level3)

        ArrayList<Goal> goals4 = new ArrayList<>()
        goals4.add(new SeeingDoubleGoal(Type.PAIR, 8))
        goals4.add(new TheDoubleDoubleGoal(Type.TWO_PAIRS, 4))
        Level level4 = new Level(14, goals4)
        levels.add(level4)

        ArrayList<Goal> goals5 = new ArrayList<>()
        goals5.add(new Goal(Type.SCORE, 2000))
        Level level5 = new Level(15, goals5)
        levels.add(level5)

        ArrayList<Goal> goals6 = new ArrayList<>()
        goals6.add(new TheHouseIsFullGoal(Type.FULL_HOUSE, 2))
        Level level6 = new Level(16, goals6)
        levels.add(level6)

        when:
        ArrayList<Level> levelsFile = ReadLevels.readLevels("src/main/java/com/pokerbomb/model/game/Levels.txt")

        then:
        levels.equals(levelsFile)
    }
}
