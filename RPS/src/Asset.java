import java.util.ArrayList;
import java.util.Arrays;

public class Asset {

    AssetType assetType;

    private ArrayList<AssetType> winAgainst;
    private ArrayList<AssetType> drawAgainst;
    private ArrayList<AssetType> loseAgainst;


    Asset(AssetType assetType){
        this.assetType = assetType;

        switch(assetType) {
        case ROCK:
            winAgainst = new ArrayList<>(Arrays.asList(AssetType.SCISSORS));
            drawAgainst = new ArrayList<>(Arrays.asList(AssetType.ROCK));
            loseAgainst = new ArrayList<>(Arrays.asList(AssetType.PAPER));
            break;
        case PAPER:
            winAgainst = new ArrayList<>(Arrays.asList(AssetType.ROCK));
            drawAgainst = new ArrayList<>(Arrays.asList(AssetType.PAPER));
            loseAgainst = new ArrayList<>(Arrays.asList(AssetType.SCISSORS));
            break;
        case SCISSORS:
            winAgainst = new ArrayList<>(Arrays.asList(AssetType.PAPER));
            drawAgainst = new ArrayList<>(Arrays.asList(AssetType.SCISSORS));
            loseAgainst = new ArrayList<>(Arrays.asList(AssetType.ROCK));
            break;
        default:
            assert(true);
        }
    }
    public AssetType getAssetType() {
        return assetType;
    }

    public ArrayList<AssetType> getWinAgainst() {
        return winAgainst;
    }

    public ArrayList<AssetType> getDrawAgainst() {
        return drawAgainst;
    }

    public ArrayList<AssetType> getLoseAgainst() {
        return loseAgainst;
    }



}
