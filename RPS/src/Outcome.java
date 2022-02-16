import java.util.ArrayList;

public class Outcome {

    boolean isWin;
    Entity winner;
    Entity loser;
    ArrayList<Entity> draw;
    String message;

    void updateWin(Entity p1, Entity p2){
        winner = p1;
        loser = p2;
        isWin = true;
        message = p1.getName() + " chose " + p1.showHand().getAssetType() + "\n" +
                p2.getName() + " chose " + p2.showHand().getAssetType() + "\n" +
                p1.getName() + " wins!";
    }

    void updateDraw(Entity p1, Entity p2){
        draw = new ArrayList<>();
        draw.add(p1);
        draw.add(p2);
        isWin = false;
        message = "Both players chose " + p1.showHand().getAssetType() + ". It is a draw. There are no winners or losers";
    }
}
