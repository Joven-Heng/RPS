import java.util.ArrayList;

public class Logic {

    Logic(){

    }

    Outcome showOutcome(ArrayList<Entity> players) throws Exception{
        if(players.size() == 2){
            return showOutcomeTwo(players.get(0), players.get(1));
        } else {
            throw new Exception("Number of players are wrong");
        }
    }

    Outcome showOutcomeTwo(Entity p1, Entity p2){
        Asset a1 = p1.showHand();
        Asset a2 = p2.showHand();

        Outcome outcome = new Outcome();

        if(a1.getWinAgainst().contains(a2.assetType)){
            // wins
            outcome.updateWin(p1, p2);
            return outcome;
        } else if (a1.getDrawAgainst().contains(a2.assetType)){
            outcome.updateDraw(p1, p2);
            return outcome;
        } else {
            outcome.updateWin(p2, p1);
            return outcome;
        }
    }


}
