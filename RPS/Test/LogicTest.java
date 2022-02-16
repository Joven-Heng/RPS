import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    Logic logic;

    Entity HumanPaper;
    Entity HumanRock;
    Entity HumanScissors;

    Entity AIPaper;
    Entity AIRock;
    Entity AIScissors;

    Outcome outcome;

    @BeforeEach
    void setUp(){
        logic = new Logic();
        HumanPaper = new EntityPlayer("PeterPaper", AssetType.PAPER);
        HumanRock = new EntityPlayer("PeterRock", AssetType.ROCK);
        HumanScissors = new EntityPlayer("PeterScissors", AssetType.SCISSORS);

        AIPaper = new EntityPlayer("AIPaper", AssetType.PAPER);
        AIRock = new EntityPlayer("AI1Rock", AssetType.ROCK);
        AIScissors = new EntityPlayer("AI1Scissors", AssetType.SCISSORS);

        outcome = new Outcome();
    }

    @Test
    void humanVSCom_player1_win_test(){
        outcome.updateWin(HumanScissors, AIPaper);
        assertEquals(logic.showOutcomeTwo(HumanScissors, AIPaper).winner, outcome.winner);
        assertEquals(logic.showOutcomeTwo(AIPaper, HumanScissors).loser, outcome.loser);
    }

    @Test
    void humanVSCom_player1_lose_test(){
        outcome.updateWin(AIPaper, HumanRock);
        assertEquals(logic.showOutcomeTwo(HumanRock, AIPaper).winner, outcome.winner);
        assertEquals(logic.showOutcomeTwo(AIPaper, HumanRock).loser, outcome.loser);
    }

    @Test
    void humanVSCom_player1_draw_test(){
        outcome.updateDraw(HumanRock, AIRock);
        assertEquals(logic.showOutcomeTwo(HumanRock, AIRock).draw.get(0), outcome.draw.get(0));
        assertEquals(logic.showOutcomeTwo(HumanRock, AIRock).draw.get(1), outcome.draw.get(1));
    }

    @Test
    void ComVsCom_player1_win_test(){
        outcome.updateWin(AIScissors, AIPaper);
        assertEquals(logic.showOutcomeTwo(AIPaper, AIScissors).winner, outcome.winner);
        assertEquals(logic.showOutcomeTwo(AIPaper, AIScissors).loser, outcome.loser);
    }

    @Test
    void ComVsCom_player1_lose_test(){
        outcome.updateWin(AIPaper, AIRock);
        assertEquals(logic.showOutcomeTwo(AIRock, AIPaper).winner, outcome.winner);
        assertEquals(logic.showOutcomeTwo(AIRock, AIPaper).loser, outcome.loser);
    }

    @Test
    void ComVsCom_player1_draw_test(){
        outcome.updateDraw(AIScissors, AIScissors);
        assertEquals(logic.showOutcomeTwo(AIScissors, AIScissors).draw.get(0), outcome.draw.get(0));
        assertEquals(logic.showOutcomeTwo(AIScissors, AIScissors).draw.get(1), outcome.draw.get(1));
    }

}